package evilcraft.blocks;

import evilcraft.Reference;
import evilcraft.api.config.ExtendedConfig;

public class NetherfishSpawnConfig extends ExtendedConfig {
    
    public static NetherfishSpawnConfig _instance;

    public NetherfishSpawnConfig() {
        super(
            Reference.BLOCK_DARKBLOCK,
            "Nether Monster Block",
            "nethermonsterblock",
            null,
            NetherfishSpawn.class
        );
    }
    
}
