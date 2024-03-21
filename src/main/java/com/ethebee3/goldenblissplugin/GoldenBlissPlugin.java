package com.ethebee3.goldenblissplugin;


import java.util.UUID;
import java.util.logging.Logger;
import io.papermc.lib.PaperLib;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.bukkit.NamespacedKey;
import com.ethebee3.goldenblissplugin.listeners.useEvent;
import com.ethebee3.goldenblissplugin.managers.SingletonManager;


public final class GoldenBlissPlugin extends JavaPlugin {
  private static JavaPlugin plugin = null;
  private static NamespacedKey isGemKey = null;
  private static NamespacedKey isFireGemKey = null;
  private static NamespacedKey isStrengthGemKey = null;
  private static NamespacedKey isSpeedGemKey = null;
  private static NamespacedKey isLifeGemKey = null;
  private static NamespacedKey isSculkGemKey = null;
  private static NamespacedKey isEarthGemKey = null;
  private static NamespacedKey isPuffGemKey = null;
  private static SingletonManager sm = null;

  @Override
  public void onEnable() {
    plugin = this;
    PaperLib.suggestPaper(this);
    saveDefaultConfig();

    sm = new SingletonManager();

    isGemKey = new NamespacedKey((@NotNull Plugin)this, "is_custom_gem");
    isFireGemKey = new NamespacedKey((@NotNull Plugin)this, "is_fire_gem");
    isStrengthGemKey = new NamespacedKey((@NotNull Plugin)this, "is_strength_gem");
    isSpeedGemKey = new NamespacedKey((@NotNull Plugin)this, "is_speed_gem");
    isLifeGemKey = new NamespacedKey((@NotNull Plugin)this, "is_life_gem");
    isSculkGemKey = new NamespacedKey((@NotNull Plugin)this, "is_sculk_gem");
    isEarthGemKey = new NamespacedKey((@NotNull Plugin)this, "is_earth_gem");
    isPuffGemKey = new NamespacedKey((@NotNull Plugin)this, "is_puff_gem");


    //listeners
    PluginManager pluginManager = Bukkit.getServer().getPluginManager();
    pluginManager.registerEvents((Listener)new useEvent(), (Plugin)this);


  }
  public static NamespacedKey getIsGemKey() {
        return isGemKey;
  }
  public static SingletonManager getSingletonManager() {
        return sm;
  }

    
}
