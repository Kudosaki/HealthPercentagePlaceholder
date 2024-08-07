
package me.matthewe.healthpercentage;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.PlaceholderHook;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class HealthPercentagePlaceholder extends JavaPlugin {

    @Override
    public void onEnable() {
        new HealthPercentageExpansion().register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
