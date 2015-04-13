package com.sub.estelle.net;

import com.sub.estelle.item.ItemEstelle;
import com.sub.estelle.item.ItemZero;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Administrator on 2015/4/5.
 */
public class ModItems
{
    public static final ItemEstelle Zero = new ItemZero();

    public static void init()
    {
        GameRegistry.registerItem(Zero,"Zero");
    }
}
