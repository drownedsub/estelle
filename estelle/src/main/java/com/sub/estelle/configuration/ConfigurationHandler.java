package com.sub.estelle.configuration;





import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Administrator on 2015/3/29.
 */
public class ConfigurationHandler
{
    public static void init(File configureFile)
    {
        Configuration configuration = new Configuration(configureFile);
        try
        {
            configuration.load();
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL,
                    "configValue", true, "This is an example value").getBoolean(true);
        }
        catch (Exception e)
        {
        }
        finally
        {
            configuration.save();
        }
        }
}
