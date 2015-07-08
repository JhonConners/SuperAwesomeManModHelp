package com.Jhon_Conners.item;

import com.Jhon_Conners.lib.RefStrings;
import com.google.common.base.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Mitems {



	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	
	public static ToolMaterial ObsidianShard = EnumHelper.addToolMaterial("ObsidianShard", 3, 2651, 16.0f, 5.5f, 10);
	
	
	public static Item ObsidianSword;
	public static Item ObsidianPick;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	
	public static void initializeItem(){
		ObsidianSword = new ObsidianSword(ObsidianShard).setUnlocalizedName("Obsidian Sword").setCreativeTab(CreativeTabs.tabCombat).setTextureName("oparmorweaponsandtools:ObsidianSword");
		ObsidianPick = new ObsidianPick(ObsidianShard).setUnlocalizedName("Obsidian Pick").setCreativeTab(CreativeTabs.tabTools).setTextureName("oparmorweaponsandtools:ObsidianPick");
		ObsidianShovel = new ObsidianShovel(ObsidianShard).setUnlocalizedName("Obsidian Shovel").setCreativeTab(CreativeTabs.tabTools).setTextureName("oparmorweaponsandtools:ObsidianShovel");
		ObsidianAxe = new ObsidianAxe(ObsidianShard).setUnlocalizedName("Obsidian Axe").setCreativeTab(CreativeTabs.tabTools).setTextureName("ObsidianAxe").setTextureName("oparmorweaponsandtools:ObsidianAxe");
		ObsidianHoe = new ObsidianHoe(ObsidianShard).setUnlocalizedName("Obsidian Hoe").setCreativeTab(CreativeTabs.tabTools).setTextureName("oparmorweaponsandtools:ObsidianHoe");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(ObsidianSword, ObsidianSword.getUnlocalizedName());
		GameRegistry.registerItem(ObsidianPick, ObsidianPick.getUnlocalizedName());
		GameRegistry.registerItem(ObsidianShovel, ObsidianShovel.getUnlocalizedName());
		GameRegistry.registerItem(ObsidianAxe, ObsidianAxe.getUnlocalizedName());
		GameRegistry.registerItem(ObsidianHoe, ObsidianHoe.getUnlocalizedName());
	}
}
