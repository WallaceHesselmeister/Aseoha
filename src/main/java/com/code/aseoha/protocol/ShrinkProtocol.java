package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithExterior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class ShrinkProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
//        ((IHelpWithConsole) console).Aseoha$SetHads(!((IHelpWithConsole) console).Aseoha$GetHads());
            ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
            if(ext!=null)
                if(console!=null)
                    if(world!=null) {
//                        int scale = ((IHelpWithConsole) console).Aseoha$GetExteriorSize();
//                        if(((IHelpWithConsole) console).Aseoha$GetExteriorSize() == 1) ((IHelpWithConsole) console).Aseoha$SetExteriorSize(0);
//                        if(((IHelpWithConsole) console).Aseoha$GetExteriorSize() == 0) ((IHelpWithConsole) console).Aseoha$SetExteriorSize(1);
                        switch (((IHelpWithConsole) console).Aseoha$GetExteriorSize()){
                            case 0:
                                ((IHelpWithConsole) console).Aseoha$SetExteriorSize(1);
                                ((IHelpWithExterior) ext).Aseoha$SetScale(1);
//                                Networking.sendToServer(new ExteriorSizePacket(Objects.requireNonNull(console.getLevel()).dimension().getRegistryName(), 1));
                                console.updateClient();
                                break;
                            case 1:
                                ((IHelpWithConsole) console).Aseoha$SetExteriorSize(0);
                                ((IHelpWithExterior) ext).Aseoha$SetScale(0);
//                                Networking.sendToServer(new ExteriorSizePacket(Objects.requireNonNull(console.getLevel()).dimension().getRegistryName(), 0));
                                console.updateClient();
                                break;
                            default:
                                ((IHelpWithConsole) console).Aseoha$SetExteriorSize(1);
                                ((IHelpWithExterior) ext).Aseoha$SetScale(1);
//                                Networking.sendToServer(new ExteriorSizePacket(Objects.requireNonNull(console.getLevel()).dimension().getRegistryName(), 1));
                                console.updateClient();
                                break;

                        }
//                        aseoha.LOGGER.info(((IHelpWithConsole) console).Aseoha$GetExteriorSize());
//                        aseoha.LOGGER.info(((IHelpWithExterior) ext).Aseoha$GetScale());


//                        if(((IHelpWithConsole) console).Aseoha$GetExteriorSize() == 0) {
//                            scale = 1;
//                            ((IHelpWithConsole) console).Aseoha$SetExteriorSize(1);
//                        }
//                        else {
//                            scale = 0;
//                            ((IHelpWithConsole) console).Aseoha$SetExteriorSize(0);
//                        }
//                        ((IHelpWithConsole) console).Aseoha$SetExteriorSize(scale);
                    }
        assert world != null;
        if (world.isClientSide) {
                playerIn.displayClientMessage(new TranslationTextComponent("Shrink toggled " + (((IHelpWithConsole) console).Aseoha$GetExteriorSize() != 1 ? "Off" : "On")), true);

                playerIn.closeContainer();
        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.EXTERIOR_PROPERTIES;
    }
}
