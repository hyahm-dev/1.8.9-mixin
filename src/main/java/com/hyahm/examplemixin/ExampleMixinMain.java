package com.hyahm.examplemixin;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMixinMain.MODID, version = ExampleMixinMain.VERSION, clientSideOnly = true)
public class ExampleMixinMain {
    public static final String MODID = "examplemixin";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }
}
