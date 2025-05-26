package com.code.aseoha.Helpers;


import com.code.aseoha.block.AseohaBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class AcceleratorMultiblock {
    private static final int MIN_RADIUS = 4; // 8x8 ring (diameter = 2 * radius)
    private static final int MAX_RADIUS = 25; // 50x50 ring
    private static final int MIN_COOLERS = 4; // Minimum number of coolers required

    /**
     * Verifies if a valid particle accelerator structure exists centered around the collision chamber.
     * Called when the player interacts with the Control Console.
     *
     * @param level The world
     * @param consolePos The position of the Control Console
     * @return true if the structure is valid, false otherwise
     */
    public static boolean verifyStructure(World level, BlockPos consolePos) {
        // Step 1: Find the Collision Chamber near the console
        BlockPos chamberPos = findCollisionChamber(level, consolePos);
        if (chamberPos == null) {
            sendMessage(level, consolePos, "No Collision Chamber found near Control Console!");
            return false;
        }

        // Step 2: Determine the ring radius by checking for coils
        int radius = findRingRadius(level, chamberPos);
        if (radius < MIN_RADIUS || radius > MAX_RADIUS) {
            sendMessage(level, consolePos, "Invalid ring size! Must be between 8x8 or 50x50.");
            return false;
        }

        // Step 3: Verify the ring of Electromagnetic Coils
        if (!verifyRing(level, chamberPos, radius)) {
            sendMessage(level, consolePos, "Incomplete or invalid Electromagnetic Coil ring!");
            return false;
        }

        // Step 4: Verify the Injector
        BlockPos injectorPos = findInjector(level, chamberPos, radius);
        if (injectorPos == null) {
            sendMessage(level, consolePos, "No Injector found on the ring!");
            return false;
        }

        // Step 5: Verify Cryogenic Coolers
        int coolerCount = countCryogenicCoolers(level, chamberPos, radius);
        if (coolerCount < MIN_COOLERS) {
            sendMessage(level, consolePos, "Need at least 4 Cryogenic Coolers near the ring!");
            return false;
        }

        // Step 6: All checks passed
        sendMessage(level, consolePos, "Particle Accelerator structure is valid!");
        return true;
    }

    /**
     * Finds the Collision Chamber within a 5-block radius of the Control Console.
     */
    private static BlockPos findCollisionChamber(World level, BlockPos consolePos) {
        for (BlockPos pos : BlockPos.betweenClosed(
                consolePos.offset(-5, -5, -5),
                consolePos.offset(5, 5, 5))) {
            if (level.getBlockState(pos).getBlock() == AseohaBlocks.COLLISION_CHAMBER.get()) {
                return pos.immutable();
            }
        }
        return null;
    }

    /**
     * Determines the radius of the coil ring by checking distances from the chamber.
     */
    private static int findRingRadius(World level, BlockPos chamberPos) {
        for (int r = MIN_RADIUS; r <= MAX_RADIUS; r++) {
            // Check a point on the ring (e.g., directly north)
            BlockPos testPos = chamberPos.offset(r, 0, 0);
            if (level.getBlockState(testPos).getBlock() == AseohaBlocks.ELECTROMAGNETIC_COIL.get()) {
                return r;
            }
        }
        return -1;
    }

    /**
     * Verifies that a complete ring of Electromagnetic Coils exists at the given radius.
     */
    private static boolean verifyRing(World level, BlockPos chamberPos, int radius) {
        // Check blocks in a circular pattern using a simple approximation
        // For a radius r, check points at (x, z) where x^2 + z^2 ≈ r^2
        for (double theta = 0; theta < 2 * Math.PI; theta += Math.PI / 16) { // Check every 22.5 degrees
            int x = (int) Math.round(radius * Math.cos(theta));
            int z = (int) Math.round(radius * Math.sin(theta));
            BlockPos pos = chamberPos.offset(x, 0, z);
            BlockState state = level.getBlockState(pos);
            if (state.getBlock() != AseohaBlocks.ELECTROMAGNETIC_COIL.get()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Finds the Injector Block on the ring.
     */
    private static BlockPos findInjector(World level, BlockPos chamberPos, int radius) {
        for (double theta = 0; theta < 2 * Math.PI; theta += Math.PI / 16) {
            int x = (int) Math.round(radius * Math.cos(theta));
            int z = (int) Math.round(radius * Math.sin(theta));
            BlockPos pos = chamberPos.offset(x, 0, z);
            if (level.getBlockState(pos).getBlock() == AseohaBlocks.INJECTOR.get()) {
                return pos.immutable();
            }
        }
        return null;
    }

    /**
     * Counts Cryogenic Coolers within 2 blocks of the ring.
     */
    private static int countCryogenicCoolers(World level, BlockPos chamberPos, int radius) {
        int count = 0;
        // Check a slightly larger area around the ring
        AxisAlignedBB searchArea = new AxisAlignedBB(
                chamberPos.offset(-radius - 2, -2, -radius - 2),
                chamberPos.offset(radius + 2, 2, radius + 2)
        );
        for (BlockPos pos : BlockPos.betweenClosed(
                new BlockPos(searchArea.minX, searchArea.minY, searchArea.minZ),
                new BlockPos(searchArea.maxX, searchArea.maxY, searchArea.maxZ))) {
            if (level.getBlockState(pos).getBlock() == AseohaBlocks.CRYOGENIC_COOLER.get()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Sends a message to players near the console.
     */
    private static void sendMessage(World level, BlockPos pos, String message) {
        if (!level.isClientSide) {
            level.players().stream()
                    .filter(player -> player.distanceToSqr(pos.getX(), pos.getY(), pos.getZ()) < 100)
                    .forEach(player -> player.sendMessage(new TranslationTextComponent(message), player.getUUID()));
        }
    }
}
