package com.ethebee3.goldenblissplugin.listeners;

import com.ethebee3.goldenblissplugin.GoldenBlissPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import com.ethebee3.goldenblissplugin.managers.SingletonManager;
import com.ethebee3.goldenblissplugin.managers.TempDataManager;


public class useEvent implements Listener {
    private SingletonManager sm = GoldenBlissPlugin.getSingletonManager();
    private TempDataManager tdm;

    public useEvent() {
        this.tdm = this.sm.tempDataManager;
    }

    @EventHandler
    public void onUse(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack offHandItem = player.getInventory().getItemInOffHand();
        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        ItemStack item = null;
        if (offHandItem.getType() == Material.AMETHYST_SHARD && offHandItem.hasItemMeta()){
            item = offHandItem;
        } else if (mainHandItem.getType() == Material.AMETHYST_SHARD && mainHandItem.hasItemMeta()) {
            item = mainHandItem;
        } else {
            return;
        }
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer dataContainer = meta.getPersistentDataContainer();
        if (dataContainer.has(GoldenBlissPlugin.getIsGemKey(), PersistentDataType.BOOLEAN)){
            if (this.tdm.cantUseGems.containsKey(player)) {
                if (System.currentTimeMillis() < this.tdm.cantUseGems.get(player)) {
                    player.sendMessage(ChatColor.DARK_RED + "You can't use gems for another " + (this.tdm.cantUseGems.get(player) - System.currentTimeMillis()) / 1000L + " seconds!");
                    return;
                }else{
                    this.tdm.cantUseGems.remove(player);
                }
            }
        }
    }
}