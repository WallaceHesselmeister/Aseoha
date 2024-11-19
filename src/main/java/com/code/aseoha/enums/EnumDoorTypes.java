package com.code.aseoha.enums;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.misc.IDoorType;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Just WhoviansRest TARDIS stuff + my coral exterior rotations
 */
public enum EnumDoorTypes implements IDoorType {
    BRACKOLIN (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MCGANN (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    SUTEKH_TARDIS (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    WHITTAKER (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_CAPALDI (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_DAVIDSON (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_HARTNELL (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_MCGANN (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_PERTWEE (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_SMITH (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_TENNANT (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    MK2_WHITTAKER (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    CORAL (state -> {
        switch(state) {
            case CLOSED: return 90.0D;
            case ONE: return -45.0D;
            case BOTH : return 30.0D;
            default:return 30.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    WARDROBE(state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return -100.0;
            case BOTH : return 100.0;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    STREETSIDE(state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    RANI (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return -80.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE),
    OLWARRIOR (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),

    BLUEDOCTOR (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),

    HARTNELL (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 75.0D;
            case BOTH : return -75.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),

    CAPALDI (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 75.0D;
            case BOTH : return -75.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH);




    Function<EnumDoorState, Double> func;
    EnumDoorState[] validStates;
    Supplier<Supplier<IInteriorDoorRenderer>> renderer;

    EnumDoorTypes(Function<EnumDoorState, Double> func, EnumDoorState... states){
        this.validStates = states;
        this.func = func;
    }

    @Override
    public EnumDoorState[] getValidStates() {
        return this.validStates;
    }

    @Override
    public double getRotationForState(EnumDoorState state) {
        return func.apply(state);
    }

    @OnlyIn(Dist.CLIENT)
    public void setInteriorDoorModel(IInteriorDoorRenderer renderer) {
        this.renderer = () -> () -> renderer;
    }

    @OnlyIn(Dist.CLIENT)
    public IInteriorDoorRenderer getInteriorDoorRenderer() {
        return this.renderer.get().get();
    }


}

