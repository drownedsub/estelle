package com.sub.estelle;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = "Estelle", name = "Estelle", version="1.7.2-1.0")



public class Estelle 
{
    @Instance("Estelle")
	public static Estelle instance;

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