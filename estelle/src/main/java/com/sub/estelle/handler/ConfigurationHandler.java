package com.sub.estelle.handler;

import com.sub.estelle.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by Administrator on 2015/3/29.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static void init(File configureFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configureFile);
        }
    }
    @SubscribeEvent
    public void anConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.Mod_ID))
        {
            // Resync configs
        }
    }
    public void loadconfiguration()
    {
        testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL,false,"This is an example.");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
