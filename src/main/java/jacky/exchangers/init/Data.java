package jacky.exchangers.init;

import java.util.ArrayList;
import java.util.List;

import jacky.exchangers.ExchangersItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Data {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<IRecipe> RECIPES = new ArrayList<IRecipe>();
	public static final String EIO = "enderio";
	public static final String MEK = "mekanism";
	public static final String THERMAL = "thermalexpansion";
	public static final String VERSION = "1.12-2.0.0";
	public static final String MODID = "exchangers";
	public static final String MODNAME = "Exchangers";
	public static final CreativeTabs TAB = new CreativeTabs(MODID) {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ExchangersItems.obsidianExchanger);
		}
	};

}
