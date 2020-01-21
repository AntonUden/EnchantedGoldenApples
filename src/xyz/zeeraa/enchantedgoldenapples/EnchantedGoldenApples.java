package xyz.zeeraa.enchantedgoldenapples;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EnchantedGoldenApples extends JavaPlugin {
	public void onEnable() {
		getLogger().info("Adding recipe for Enchanted Golden Apple");
		NamespacedKey key = new NamespacedKey(this, "ENCHANTED_GOLDEN_APPLE");
		ShapedRecipe recipe = new ShapedRecipe(key, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
		
		recipe.shape("AAA", "ABA", "AAA");
		recipe.setIngredient('A', Material.GOLD_BLOCK);
		recipe.setIngredient('B', Material.APPLE);
		
		Bukkit.addRecipe(recipe);
	}
}