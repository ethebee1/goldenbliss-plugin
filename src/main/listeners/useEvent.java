package com.ethebee3.listeners;

import org.bukkit.*;
import com.ethebee3.managers.*;

public class useEvent{
    private SingletonManager sm = Main.getSingletonManager();
    private TempDataManager tdm;

    public useEvent() {
        this.tdm = 
    }

    @EventHandler
    public void onUse(PlayerInteractEvent e) {
        Player player = e.getplayer()
        ItemStack offHandItem = player.getInventory().getItemInOffHand();
        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        ItemStack item = null;
        if (offHandItem.getType() == Material.ANTHMYST_SHARD && offHandItem.hasItemMeta()){
            item = offHandItem
        } else if (mainHandItem.getType() == Material.ANTHMYST_SHARD && mainHandItem.hasItemMeta()) {
            item = mainHandItem;
        } else {
            return;
        }
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer dataContainer = meta.getPersistentDataContainer();
        if (dataContainer.has(Main.getIsGemKey()), PersistentDataType.BOOLEAN){
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