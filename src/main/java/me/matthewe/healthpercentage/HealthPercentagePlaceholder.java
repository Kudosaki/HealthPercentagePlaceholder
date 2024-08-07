
package me.matthewe.healthpercentage;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.PlaceholderHook;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class HealthPercentagePlaceholder extends JavaPlugin {

    @Override
    public void onEnable() {
        PlaceholderAPI.registerPlaceholderHook("health_percentage", new PlaceholderHook() {
            @Override
            public String onPlaceholderRequest(Player p, String params) {

                double hp = p.getHealth();
                double maxHP = p.getMaxHealth();

                double percentage = (hp * 100.0) / maxHP;
                return String.valueOf((int) Math.floor(percentage));

            }
        }) ;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
