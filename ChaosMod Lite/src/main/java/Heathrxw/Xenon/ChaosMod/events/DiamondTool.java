package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DiamondTool extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_HELMET, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_LEGGINGS, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_BOOTS, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_AXE, 1));
        }
    }

    public String getName() {
        return "Iron";
    }
}