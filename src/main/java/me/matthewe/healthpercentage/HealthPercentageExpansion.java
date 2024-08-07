package me.matthewe.healthpercentage;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class HealthPercentageExpansion extends PlaceholderExpansion {

    @Override
    public String getAuthor() {
        return ".matthewe";
    }
    
    @Override
    public String getIdentifier() {
        return "hp";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player p, String params) {

        if (params==null)return "-1";
        if (p==null)return "-1";

        if (params.startsWith("percentage")){

            double hp = p.getHealth();
            double maxHP = p.getMaxHealth();

            double percentage = (hp * 100.0) / maxHP;
            return String.valueOf((int) Math.floor(percentage));
        }
        return "-1";
    }


}