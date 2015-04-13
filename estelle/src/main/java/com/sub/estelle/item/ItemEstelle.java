package com.sub.estelle.item;

import com.sub.estelle.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Administrator on 2015/4/5.
 */
public class ItemEstelle extends Item
{
    public ItemEstelle()
    {
        super();
    }
    @Override
    public String getUnlocalizedName()
    {
        return  String.format("item.zero", Reference.Mod_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return  String.format("item.zero", Reference.Mod_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
