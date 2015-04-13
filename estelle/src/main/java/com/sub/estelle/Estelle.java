package com.sub.estelle;

import com.sub.estelle.handler.ConfigurationHandler;
import com.sub.estelle.net.ModItems;
import com.sub.estelle.proxy.iProxy;
import com.sub.estelle.reference.Reference;
import com.sub.estelle.utility.Loghelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.Mod_ID, name = Reference.Mod_Name, version = Reference.Mod_Version, guiFactory = Reference.GUI_FACTORY_CLASS)


public class Estelle 
{
    @Instance(Reference.Mod_ID)
	public static Estelle instance;

	@SidedProxy(clientSide = "com.sub.estelle.proxy.ClientProxy", serverSide = "com.sub.estelle.proxy.ServerProxy")
	public static iProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModItems.init();
	}
	@EventHandler
	public void init (FMLInitializationEvent event)
	{
		
	}
	@EventHandler
	public void postinit (FMLPostInitializationEvent event)
	{

	}
}