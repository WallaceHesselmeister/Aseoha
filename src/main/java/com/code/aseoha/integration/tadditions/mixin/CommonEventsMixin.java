package com.code.aseoha.integration.tadditions.mixin;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.mistersecret312.temporal_api.events.ControlEvent;
import net.tadditions.mod.events.CommonEvents;
import net.tadditions.mod.helper.IMonitorHelp;
import net.tadditions.mod.tileentity.FourteenthConsoleTile;
import net.tardis.mod.controls.AbstractControl;
import net.tardis.mod.controls.AxisControl;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.registries.ControlRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(CommonEvents.class)
public class CommonEventsMixin {
    /**
     * @author codiak540
     * @reason prevent TA from executing anything onServerTick, it tends to NullPointer and we do what they're trying to anyway
     */
    @SubscribeEvent
    @Overwrite(remap = false)
    public static void onServerTick(TickEvent.ServerTickEvent event) {
    }

    /**
     * @author coadiak540
     * @reason fix displayed pos
     */
    @SubscribeEvent
    @Overwrite(remap = false)
    public static void onControlHit(ControlEvent.ControlHitEvent event) {
        if ((event.getControl().getEntry().equals(ControlRegistry.X.get()) || event.getControl().getEntry().equals(ControlRegistry.Y.get()) || event.getControl().getEntry().equals(ControlRegistry.Z.get())) && event.getControl().getConsole().hasNavCom()) {
            BlockPos pos = event.getControl().getConsole().getDestinationPosition().offset(((AxisControl) event.getControl()).getAddPos(event.getPlayer().isShiftKeyDown() ? -event.getControl().getConsole().getCoordIncr() : event.getControl().getConsole().getCoordIncr()));
            event.getPlayer().displayClientMessage(aseoha$getTarget(pos), true);
        }

        if (event.getControl().getEntry().equals(ControlRegistry.MONITOR.get()) && event.getPlayer().isShiftKeyDown()) {
            event.setCanceled(true);
            if (event.getControl().getConsole() instanceof FourteenthConsoleTile) {
                BlockPos pos = event.getControl().getConsole().getBlockPos();
                Vector3d p = event.getPlayer().position().subtract((double) pos.getX() + 0.5, (double) pos.getY(), (double) pos.getZ() + 0.5).normalize();
                float rot = aseoha$getRot(p);

                ((IMonitorHelp) event.getControl()).setRotAngle(rot);
            }
        }

        if (event.getControl().getEntry().equals(ControlRegistry.FAST_RETURN.get())) {
            event.setCanceled(true);
            if (!event.getControl().getConsole().getLevel().isClientSide() && event.getControl().getConsole().getLandTime() <= 0) {
                if (event.getControl().getConsole().getCurrentLocation() == event.getControl().getConsole().getDestinationPosition()) {
                    SpaceTimeCoord coord = event.getControl().getConsole().getReturnLocation();
                    event.getControl().getConsole().setDestination(RegistryKey.create(Registry.DIMENSION_REGISTRY, coord.getDimRL()), coord.getPos());
                    event.getControl().getConsole().setExteriorFacingDirection(coord.getFacing());
                    event.getPlayer().displayClientMessage(new TranslationTextComponent("tardis.fast_return_control.interact.fast_return_destination_set"), true);
                } else {
                    event.getControl().getConsole().setDestination(event.getControl().getConsole().getCurrentDimension(), event.getControl().getConsole().getCurrentLocation());
                    event.getControl().getConsole().setExteriorFacingDirection(event.getControl().getConsole().getExteriorFacingDirection());
                    event.getPlayer().displayClientMessage(new TranslationTextComponent("tardis.fast_return_control.interact.fast_return_destination_unset"), true);
                }
            }

            ((BaseControl) event.getControl()).startAnimation();
        }

    }

    /**
     * @author codiak540
     * @reason fix displayed pos
     */
    @SubscribeEvent
    @Overwrite(remap = false)
    public static void onControlInteract(PlayerInteractEvent.EntityInteractSpecific event) {
        if(!event.getTarget().getType().equals(TEntities.CONTROL.get())) return;

        if ((((ControlEntity) event.getTarget()).getControl().getEntry().equals(ControlRegistry.X.get()) || ((ControlEntity) event.getTarget()).getControl().getEntry().equals(ControlRegistry.Y.get()) || ((ControlEntity) event.getTarget()).getControl().getEntry().equals(ControlRegistry.Z.get()) && ((ControlEntity) event.getTarget()).getControl().getConsole().hasNavCom())) {
            BlockPos pos = ((ControlEntity) event.getTarget()).getControl().getConsole().getDestinationPosition().offset(((AxisControl) ((ControlEntity) event.getTarget()).getControl()).getAddPos(event.getPlayer().isShiftKeyDown() ? -((ControlEntity) event.getTarget()).getControl().getConsole().getCoordIncr() : ((ControlEntity) event.getTarget()).getControl().getConsole().getCoordIncr()));
            event.getPlayer().displayClientMessage(aseoha$getTarget(pos), true);
        }

        AbstractControl control;
        if (event.getTarget().getType().equals(TEntities.CONTROL.get()) && ((ControlEntity) event.getTarget()).getControl().getEntry().equals(ControlRegistry.MONITOR.get()) && event.getPlayer().isShiftKeyDown()) {
            control = ((ControlEntity) event.getTarget()).getControl();
            event.setCanceled(true);
            if (control.getConsole() instanceof FourteenthConsoleTile) {
                BlockPos pos = control.getConsole().getBlockPos();
                Vector3d p = event.getPlayer().position().subtract((double) pos.getX() + 0.5, (double) pos.getY(), (double) pos.getZ() + 0.5).normalize();
                float rot = aseoha$getRot(p);

                ((IMonitorHelp) control).setRotAngle(rot);
            }
        }

        if (((ControlEntity) event.getTarget()).getControl().getEntry().equals(ControlRegistry.FAST_RETURN.get())) {
            event.setCanceled(true);
            control = ((ControlEntity) event.getTarget()).getControl();
            if (!control.getConsole().getLevel().isClientSide() && control.getConsole().getLandTime() <= 0) {
                if (control.getConsole().getCurrentLocation() == control.getConsole().getDestinationPosition()) {
                    SpaceTimeCoord coord = control.getConsole().getReturnLocation();
                    RegistryKey<World> worldKey = RegistryKey.create(Registry.DIMENSION_REGISTRY, coord.getDimRL());
                    control.getConsole().setDestination(worldKey, coord.getPos());
                    control.getConsole().setExteriorFacingDirection(coord.getFacing());
                    event.getPlayer().displayClientMessage(new TranslationTextComponent("tardis.fast_return_control.interact.fast_return_destination_set"), true);
                } else {
                    control.getConsole().setDestination(control.getConsole().getCurrentDimension(), control.getConsole().getCurrentLocation());
                    control.getConsole().setExteriorFacingDirection(control.getConsole().getExteriorFacingDirection());
                    event.getPlayer().displayClientMessage(new TranslationTextComponent("tardis.fast_return_control.interact.fast_return_destination_unset"), true);
                }
            }

            ((BaseControl) control).startAnimation();
        }
    }

    @Unique
    private static float aseoha$getRot(Vector3d p) {
        float hype = (float) Math.sqrt(p.x * p.x + p.z * p.z);
        double degrees = Math.toDegrees(Math.asin(p.x / (double) hype));
        float rot;
        if (p.z < 0.0) {
            rot = (float) degrees;
        } else {
            rot = -((float) degrees) - 180.0F;
        }

        rot += 180.0F;
        rot += (rot < 0.0F) ? 360.0F : 0.0F;

        int range = (int) (rot / 30.0F);

        switch (range) {
            case 0:
                rot = 0.0F;
                break;
            case 1:
            case 2:
                rot = 60.0F;
                break;
            case 3:
            case 4:
            case 5:
                rot = 120.0F;
                break;
            case 6:
            case 7:
            case 8:
                rot = -120.0F;
                break;
            case 9:
            case 10:
                rot = -60.0F;
                break;
            case 11:
                rot = 0.0F;
                break;
            default:
                rot = 0.0F; // Fallback for unexpected values
                break;
        }

        return rot;
    }

    @Unique
    private static IFormattableTextComponent aseoha$getTarget(BlockPos pos) {
        TranslationTextComponent target = new TranslationTextComponent("tardis.axis_control.interact.target_change");
        IFormattableTextComponent x = (new StringTextComponent("X - ")).append(String.valueOf(pos.getX())).withStyle(TextFormatting.LIGHT_PURPLE);
        IFormattableTextComponent y = (new StringTextComponent(", Y - ")).append(String.valueOf(pos.getY())).withStyle(TextFormatting.LIGHT_PURPLE);
        IFormattableTextComponent z = (new StringTextComponent(", Z - ")).append(String.valueOf(pos.getZ())).withStyle(TextFormatting.LIGHT_PURPLE);
        return target.append(x).append(y).append(z);
    }

}
