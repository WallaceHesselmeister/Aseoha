package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.Coral;
import com.code.aseoha.misc.PassNotNull;
import com.code.aseoha.misc.TARDISHelper;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.registries.ConsoleRegistry;
import net.tardis.mod.registries.ExteriorRegistry;

public class TardisCoralTile extends TileEntity implements ITickableTileEntity {
    public TardisCoralTile() {
        super(AseohaTiles.TARDIS_CORAL.get());
    }

    public int timer = 0;
    public int Maxtimer = 500;//12000;
    boolean isActive = true;
    public int STATE = 0;

    //    private BlockPos pos = new BlockPos(this.worldPosition.getX(), this.worldPosition.getY(), this.worldPosition.getZ() - 1);
    @Override
    public void tick() {

        if (this.level != null) {
//            Block block = this.getLevel().getBlockState(this.worldPosition).getBlock();
//            if (block instanceof Coral && block != null) {
//                assert this.level != null;
//                if (this.getLevel().getServer() != null)
//                    ((Coral) block).tickFunction(
//                            this.getLevel().getBlockState(this.worldPosition),
//                            PassNotNull.NotNullServerWorld(
//                                    this.getLevel().getServer().getLevel(
//                                            PassNotNull.NotNullWorldRegKey(
//                                                    this.level.dimension(),
//                                                    this.getLevel().dimension())), null),
//                            this.worldPosition,
//                            this.timer);
//            }
        }

        assert this.level != null;
        int prevState = this.STATE;
            if (this.timer <= this.Maxtimer / 5)
                this.STATE = 0;
            if ((this.timer >= this.Maxtimer / 5)) {
                if (this.timer <= this.Maxtimer / 5 + this.Maxtimer / 5)
                    this.STATE = 1;
                if (this.timer >= this.Maxtimer / 5 + this.Maxtimer / 5) {
                    if (this.timer <= this.Maxtimer / 5 + this.Maxtimer / 5 + this.Maxtimer / 5)
                        this.STATE = 2;
                    if (this.timer >= this.Maxtimer / 5 + this.Maxtimer / 5 + this.Maxtimer / 5)
//                        if (this.timer <= this.Maxtimer / 5 + this.Maxtimer / 5 + this.Maxtimer / 5 + this.Maxtimer + this.Maxtimer / 5)
                        this.STATE = 3;
                }
            }
        if (this.isActive) {
            this.timer++;
            if(this.getLevel().getServer() != null)
                ((Coral) this.getBlockState().getBlock()).tickFunction(this.getBlockState(), PassNotNull.NotNullServerWorld(PassNotNull.NotNullServerWorld(this.getLevel().getServer().getLevel(PassNotNull.NotNullWorldRegKey(this.level.dimension(), null)), null), null), this.getBlockPos(), this.timer);

//            aseoha.LOGGER.info(this.this.timer);
            if (this.timer == Maxtimer && this.getLevel() != null) {
                this.spawnTARDIS();
                this.level.removeBlock(getBlockPos(), true);
                this.setRemoved();
            }
        }
        if(prevState != this.STATE) {
            this.getBlockState().setValue(Coral.STATE, this.STATE);
            this.getLevel().setBlock(this.worldPosition, (BlockState) this.getBlockState().setValue(Coral.STATE, this.STATE), 1);//.setValue(STATE, this.State), 1);
        }
    }

    private void spawnTARDIS() {
        assert this.level != null;
        if (!this.level.isClientSide())
            try {
                TARDISHelper.createTARDIS(this.worldPosition.south(), PassNotNull.NotNullServerWorld(this.level.getServer().getLevel(this.level.dimension()), null), ExteriorRegistry.TT_CAPSULE.get(), ConsoleRoom.ALABASTER, ConsoleRegistry.HARTNELL.get());
            } catch (Exception e) {
                aseoha.SendDebugToAll("Jeez louise, howdya break the TARDIS coral?");
            }
        this.timer = 0;
        this.setChanged();
        this.setRemoved();
    }
}