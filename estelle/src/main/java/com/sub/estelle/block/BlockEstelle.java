package com.sub.estelle.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2015/4/9.
 */
public class BlockEstelle extends Block {
    public BlockEstelle(Material material){
        super(material);
    }
    public BlockEstelle(){
        this(Material.rock);
    }
}
