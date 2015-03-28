package com.sub.estelle;

import com.sub.estelle.proxy.iProxy;
import com.sub.estelle.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.Mod_ID, name = Reference.Mod_Name, version = Reference.Mod_Version)


public class Estelle 
{
    @Instance(Reference.Mod_ID)
	public static Estelle instance;

	@SidedProxy(clientSide = "com.sub.estelle.proxy.ClientProxy", serverSide = "com.sub.estelle.proxy.ServerProxy")
	public static iProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent ground0)
	{
			
	
	}
	@EventHandler
	public void init (FMLInitializationEvent ground1)
	{
		
	}
	@EventHandler
	public void postinit (FMLPostInitializationEvent standby)
	{

	}
}