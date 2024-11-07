package com.code.aseoha.protocol;

import com.code.aseoha.aseoha;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.registries.ProtocolRegistry;

public class RegisterProtocols extends ProtocolRegistry {

    public static final DeferredRegister<Protocol> PROTOCOLSREGISTER = DeferredRegister.create(Protocol.class, aseoha.MODID);
    public static final RegistryObject<Protocol> HADS = PROTOCOLSREGISTER.register("hads", HadsProtocol::new);
    public static final RegistryObject<Protocol> EJECT = PROTOCOLSREGISTER.register("eject", EjectProtocol::new);
    public static final RegistryObject<Protocol> SHRINK = PROTOCOLSREGISTER.register("shrink", ShrinkProtocol::new);
    public static final RegistryObject<Protocol> MAINTENANCE = PROTOCOLSREGISTER.register("maintenance", MaintenanceProtocol::new);
//    public static final RegistryObject<Protocol> RWF = PROTOCOLSREGISTER.register("rwf", RWFProtocol::new);
    //TODO: FINISH RWF
}
