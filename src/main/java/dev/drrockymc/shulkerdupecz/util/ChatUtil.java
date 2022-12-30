package dev.drrockymc.shulkerdupecz.util;

import org.bukkit.ChatColor;

public class ChatUtil {
    public static String color(String Message) {
        return ChatColor.translateAlternateColorCodes('&', Message);
    }

    public static String prefix() {
        return color("&9[&eShulker&d&lDupe &3重制版&9]");
    }

    public static String noPrem() {
        return prefix() + color(" &c");
    }
}
