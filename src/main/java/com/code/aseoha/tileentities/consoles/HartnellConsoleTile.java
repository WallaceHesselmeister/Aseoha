package com.code.aseoha.tileentities.consoles;


import com.code.aseoha.Controls.CoffeePot;
import com.code.aseoha.Controls.WibblyLever;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class HartnellConsoleTile extends ConsoleTile {

    public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

    //    @Override
//    public AxisAlignedBB getRenderBoundingBox() {return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7);
////        return RENDER_BOX.getCenter(this.getPos());
//    }
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7).expandTowards(-2.7, -1, -2.7);
//        return RENDER_BOX.getCenter(this.getPos());
    }

    public HartnellConsoleTile() {
        this(AseohaTiles.console_hartnell.get());
//        this.registerControlEntry(ControlRegistry.MONITOR.get());
//        this.variants = TextureVariants.BRACKOLIN;
    }

    public HartnellConsoleTile(TileEntityType<?> type) {
        super(type);
        //Done
        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(0.531, .45F, -0.286), EntitySize.scalable(0.0625F, 0.1625F)));
        //Done
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(0.241, .45, 0.681), EntitySize.scalable(0.125F, 0.125F)));
        //Done
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(-0.222, .4, -0.686), EntitySize.scalable(0.1875F, 0.1875F))); //TODO: GIVE THIS A POS BEFORE I FORGET
        //Done
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.779, .4, 0.219), EntitySize.scalable(0.1875F, 0.1475F)));
        //Done
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(-0.509, .45, -0.29), EntitySize.scalable(0.1875F, 0.25F)));
        //Done
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.576, .45F, 0.705), EntitySize.scalable(0.0625F, 0.0625F)));
        //Done
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(.11, .45, -.765), EntitySize.scalable(0.16F, 0.10F)));
        //Done
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(-0.676, .45, -0.362), EntitySize.scalable(0.1875F, 0.125F)));
        //Done
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(0.939, .45, -0.088), EntitySize.scalable(0.0625F, 0.0625F)));
        //Done
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(-0.556, .45, 0.412), EntitySize.scalable(0.125F, 0.225F)));
        //Done
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(0.626, .45, -0.097), EntitySize.scalable(0.0625F, 0.1625F)));

        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(0.008, .5F, -0.532), EntitySize.scalable(0.0625F, 0.155F)));
        //Done
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(0.448, 0.45, 0.384), EntitySize.scalable(0.0625F, 0.1625F)));
        //Done
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(0.584, 0.39, .468), EntitySize.scalable(0.0625F, 0.1625F)));
        //Done
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(0.693, 0.33, 0.529), EntitySize.scalable(0.0625F, 0.1625F)));

        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(.32, .45, -.765), EntitySize.scalable(0.16F, 0.10F)));
        //Done
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(-0.216, .45, 0.686), EntitySize.scalable(0.125F, 0.125F)));

        this.controlOverrides.put(CoffeePot.class, new ControlOverride(new Vector3d(-0.695, .45, 0.478), EntitySize.scalable(0.0625F, 0.0625F)));

//       this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.68, 1.08800, 0.24),EntitySize.scalable(0.6F, 0.3125F)));

        this.controlOverrides.put(WibblyLever.class, new ControlOverride(new Vector3d(0.004, .6, -1.038), EntitySize.scalable(0.0625F, 0.0625F)));
    }


}