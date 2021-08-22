package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ObsidianTrap extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target !=null) {
            target.getLocation().add(0, -1, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, -1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, -1, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, -1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, -1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, -1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, -1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, -1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, -1, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, -1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 0, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 0, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 0, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 0, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 0, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 0, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 0, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 0, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 1, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 1, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 1, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 1, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 2, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 2, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 2, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 2, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 2, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 2, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 2, -1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(1, 2, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 2, 0).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(-1, 2, 1).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(0, 1, 0).getBlock().setType(Material.WATER);
            target.getLocation().add(0, 0, 0).getBlock().setType(Material.WATER);
        }
    }

    public String getName() {
        return "Obsidian Trap";
    }
}