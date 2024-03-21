package com.ethebee1;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import com.ethebee3.managers.SingletonManager;
import com.ethebee3.listeners.useEvent;


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

    isGemKey = new NamespacedKey((plugin)this, "is_custom_gem");
    isFireGemKey = new NamespacedKey((plugin)this, "is_fire_gem");
    isStrengthGemKey = new NamespacedKey((plugin)this, "is_strength_gem");
    isSpeedGemKey = new NamespacedKey((plugin)this, "is_speed_gem");
    isLifeGemKey = new NamespacedKey((plugin)this, "is_life_gem");
    isSculkGemKey = new NamespacedKey((plugin)this, "is_sculk_gem");
    isEarthGemKey = new NamespacedKey((plugin)this, "is_earth_gem");
    isPuffGemKey = new NamespacedKey((plugin)this, "is_puff_gem");


    //listeners
    pluginManager.registerEvents((Listener)new useEvent(), (Plugin)this);


  }
  public static NamespacedKey getIsGemKey() {
        return isGemKey;
  }
  public static SingletonManager getSingletonManager() {
        return sm;
  }

    
}
