package com.code.aseoha.tileentities.consoles;


import com.code.aseoha.Controls.CoffeePot;
import com.code.aseoha.Controls.WibblyLever;
import com.code.aseoha.texturevariants.TextureVariants;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class CustardConsoleTile extends ConsoleTile {

    @Override
    public AxisAlignedBB getRenderBoundingBox() {return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7);
    }

    public CustardConsoleTile() {
        this(AseohaTiles.console_custard.get());
        this.variants = TextureVariants.CUSTARD;
    }

    public CustardConsoleTile(TileEntityType<?> type) {
        super(type);
//       this.registerControlEntry(ControlRegistry.MONITOR.get());
      //Done
       this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(-0, .7, 0.543),EntitySize.scalable(0.15F, 0.15F)));
       //Done
       this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(0.83, .5, -0.45), EntitySize.scalable(0.1875F, 0.1875F)));
       //Done
       this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(0.001, 1.2, -0.41),EntitySize.scalable(0.12F, 0.25F)));
        //Done
       this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.521, .7, 0.302),EntitySize.scalable(0.1875F, 0.1875F)));
        //Done
       this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(0.47, 1, -0.264),EntitySize.scalable(0.125F, 0.125F)));
        //Done
       this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.888, .6, 0.079),EntitySize.scalable(0.085F, 0.1875F)));
        //Done
       this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(-0.509, 1.1, 0),EntitySize.scalable(0.25F, 0.25F)));
        //Done
       this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(-0.7, .7, -0.41),EntitySize.scalable(0.12499999999999997F, 0.125F)));
       //Done
       this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(0.509, .7, 0.73),EntitySize.scalable(0.085F, 0.075F)));
        //Done
       this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(0.003, .7, -0.598),EntitySize.scalable(0.1875F, 0.1875F)));
        //Done
       this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(0.221, 1.2, 0.391),EntitySize.scalable(0.12F, 0.25F)));

       this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(-0.472, .7, -0.269),EntitySize.scalable(0.125F, 0.125F)));
       //Done
       this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(0.679, .68, 0.466),EntitySize.scalable(0.0375F, 0.085F)));
       //Done
       this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(0.60, .7, 0.346),EntitySize.scalable(0.0575F, 0.085F)));

       this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(0.697, .68, 0.312),EntitySize.scalable(0.0375F, 0.085F)));

       this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.567, 1.1, 0),EntitySize.scalable(0.25F, 0.25F)));
       //Done
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(0.839, .6, 0.487),EntitySize.scalable(0.15F, 0.075F)));

        this.controlOverrides.put(CoffeePot.class, new ControlOverride(new Vector3d(0.004, .6, -1.038),EntitySize.scalable(0.1625F, 0.0625F)));

//       this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.4,0.3,0.2),EntitySize.scalable(0.3125F, 0.3125F)));

        this.controlOverrides.put(WibblyLever.class, new ControlOverride(new Vector3d(0.004, .6, -1.038),EntitySize.scalable(0.0625F, 0.0625F)));
    }


}