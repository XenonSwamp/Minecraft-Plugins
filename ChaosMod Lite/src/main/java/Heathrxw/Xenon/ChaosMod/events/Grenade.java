package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Grenade extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.CREEPER);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.CREEPER);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.CREEPER);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.CREEPER);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.CREEPER);
        }
    }

    public String getName() {
        return "Aw man.";
    }
}