package com.code.aseoha.tileentities.consoles;


import com.code.aseoha.Controls.CoffeePot;
import com.code.aseoha.Controls.WibblyLever;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class BlueMarbleTile extends ConsoleTile {

    public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

//    @Override
//    public AxisAlignedBB getRenderBoundingBox() {return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7);
////        return RENDER_BOX.getCenter(this.getPos());
//    }
@Override
public AxisAlignedBB getRenderBoundingBox() {return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7).expandTowards(-2.7,-1,-2.7);
//        return RENDER_BOX.getCenter(this.getPos());
}

    public BlueMarbleTile() {
        this(AseohaTiles.console_bluemarble.get());
        this.registerControlEntry(ControlRegistry.MONITOR.get());
//        this.variants = TextureVariants.BRACKOLIN;
    }

    public BlueMarbleTile(TileEntityType<?> type) {
        super(type);
      //Done
       this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(1.219, .4F, -.588),EntitySize.scalable(0.26F, 0.25F)));
       //Done
       this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(0.105, .5, -1.13),EntitySize.scalable(0.31F, 0.15F)));
       //Done
       this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(0.29, .45, -1.27),EntitySize.scalable(0.1F, 0.3F)));
        //Done
       this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.27, .45, -1.28),EntitySize.scalable(0.1F, 0.3F)));
        //Done
       this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(.964, .6, .931),EntitySize.scalable(0.25F, 0.075F)));
        //Done
       this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-.845, .65F, 1 ),EntitySize.scalable(0.30F, 0.30F)));
        //Done
       this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(-0.12, 0.6, 1.35),EntitySize.scalable(0.2F, 0.4F)));
        //Done
       this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(0.20, 0.6, 1.35),EntitySize.scalable(0.2F, 0.4F)));
       //Done
       this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(-1.30, .5, 0.24),EntitySize.scalable(0.20F, 0.075F)));
        //Done
       this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(-1.31, .5, -0.18),EntitySize.scalable(0.20F, 0.075F)));
        //Done
       this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(0.035, 1.15, -0.975),EntitySize.scalable(0.15F, 0.3F)));

       this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(-.77, .65F, -.75),EntitySize.scalable(0.3F, 0.35F)));
       //Done
       this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(-1.1, 0.6, -0.21),EntitySize.scalable(0.13F, 0.12F)));
       //Done
       this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(-1.15, 0.6, 0.06),EntitySize.scalable(0.13F, 0.12F)));
       //Done
       this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(-1.1, 0.6, 0.33),EntitySize.scalable(0.13F, 0.12F)));

       this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.68F, .65F, -1F),EntitySize.scalable(0.3F, 0.35F)));
       //Done
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(1.38, .5, 0.04),EntitySize.scalable(0.15F, 0.15F)));

       this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.68, 1.08800, 0.24),EntitySize.scalable(0.6F, 0.3125F)));

        this.controlOverrides.put(CoffeePot.class, new ControlOverride(new Vector3d(1.36, .5, 0.238),EntitySize.scalable(0.15F, 0.15F)));

        this.controlOverrides.put(WibblyLever.class, new ControlOverride(new Vector3d(0.004, .6, -1.038),EntitySize.scalable(0.0625F, 0.0625F)));
    }



}