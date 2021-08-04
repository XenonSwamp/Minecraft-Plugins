package me.heathrxw.bossbar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class bar {

    private int taskID = -1;
    private final Bossbar plugin;
    private BossBar bar;

    public bar(Bossbar plugin) {
        this.plugin = plugin;
    }

    public void addPlayer(Player Player) {
        bar.addPlayer(Player);
    }

    public BossBar getBar() {
        return bar;
    }

    public void createBar() {
        bar = Bukkit.createBossBar(format("&cSub to Technoblade"), BarColor.RED, BarStyle.SOLID);
        bar.setVisible(true);
        cast();
    }

    public void cast() {
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

            int count = -1;
            double progress = 1.0;
            double time = 1.0 /30;

            @Override
            public void run() {
                bar.setProgress(progress);

                switch(count) {
                    case -1:
                        break;
                    case 0:
                        bar.setColor(BarColor.PINK);
                        bar.setTitle(format("&dJoin the discord"));
                        break;
                    case 1:
                        bar.setColor(BarColor.GREEN);
                        bar.setTitle(format("&dSubscribe to Technoblade"));
                        break;
                    case 2:
                        bar.setColor(BarColor.BLUE);
                        bar.setTitle(format("&dhttps://heathrxw.xyz"));
                        break;
                    case 3:
                    default:
                        bar.setColor(BarColor.RED);
                        bar.setTitle(format("&dSub to Technoblade"));
                        count = -1;
                        break;
                }

                progress = progress - time;
                if (progress <= 0) {
                    count++;
                    progress = 1.0;
                }

            }
        },0, 20);
    }

    private String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
