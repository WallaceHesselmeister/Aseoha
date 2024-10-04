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


public class BattleConsoleTile extends ConsoleTile {

    public AxisAlignedBB getRenderBoundingBox() {
        return (new AxisAlignedBB(this.getBlockPos())).expandTowards(2.7, 5.0, 2.7).expandTowards(-2.7, -1, -2.7);
//        return RENDER_BOX.getCenter(this.getPos());
    }

    public BattleConsoleTile() {
        this(AseohaTiles.console_battle.get());
    }

    public BattleConsoleTile(TileEntityType<?> type) {
        super(type);
//       this.registerControlEntry(ControlRegistry.MONITOR.get());
        //Done
        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(0.235, 1.969, 0.623), EntitySize.scalable(0.25F, 0.25F)));
        //Done
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(-0.503, .5, -0.254), EntitySize.scalable(0.1875F, 0.2575F)));
        //Done
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(-0.593, .5, 0.381), EntitySize.scalable(0.5F, 0.5F)));
        //Done
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.5, 0.475, -0.4), EntitySize.scalable(0.1875F, 0.1875F)));
        //Done
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(0, 0.52, -0.9), EntitySize.scalable(0.25F, 0.075F)));
        //Done
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.65, 0.5, 0.125), EntitySize.scalable(0.15F, 0.15F)));
        //Done
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(0.633, 0.6, 0.152), EntitySize.scalable(0.125F, 0.16F)));
        //Done
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(0.199, .5, -0.574), EntitySize.scalable(0.125F, 0.18F)));
        //Done
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(-0.19, 0.7, -0.56), EntitySize.scalable(0.12F, 0.1F)));
        //Done
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(0.7, 0.55, -0.4), EntitySize.scalable(0.3F, 0.3F)));
        //Done
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(0.03, 0.7, -0.56), EntitySize.scalable(0.12F, 0.1F)));

        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(-0.4, 0.6, -0.1), EntitySize.scalable(0.15F, 0.15F)));
        //Done
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(0.23, 0.55, -0.75), EntitySize.scalable(0.12F, 0.1F)));
        //Done
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(0.03, 0.55, -0.75), EntitySize.scalable(0.12F, 0.1F)));
        //Done
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(-0.19, 0.55, -0.75), EntitySize.scalable(0.12F, 0.1F)));

        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.58, 0.5, 0.575), EntitySize.scalable(0.3F, 0.35F)));
        //Done
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(0.23, 0.7, -0.56), EntitySize.scalable(0.12F, 0.1F)));

        this.controlOverrides.put(CoffeePot.class, new ControlOverride(new Vector3d(0.004, .6, -1.038),EntitySize.scalable(0.0625F, 0.0625F)));

        this.controlOverrides.put(WibblyLever.class, new ControlOverride(new Vector3d(0.004, .6, -1.038),EntitySize.scalable(0.0625F, 0.0625F)));

//       this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.4,0.3,0.2),EntitySize.scalable(0.3125F, 0.3125F)));
    }

}