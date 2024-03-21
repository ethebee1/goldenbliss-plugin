package com.ethebee3;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.PluginManager;


public class GoldenBlissPlugin extends JavaPlugin {
  private static NamespacedKey isGemKey = null;

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);
    saveDefaultConfig();
    private static SingletonManager sm = null;
    sm = new SingletonManager();

    //edits by ethebee3 from here
    private static isGemKey = null;
    private static isFireGemKey = null;
    private static isStrengthGemKey = null;
    private static isSpeedGemKey = null;
    private static isLifeGemKey = null;
    private static isSculkGemKey = null;
    private static isEarthGemKey = null;
    private static isPuffGemKey = null;

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
