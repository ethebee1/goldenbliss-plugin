/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.ethebee3.goldenblissplugin.managers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import org.bukkit.entity.Player;

public class TempDataManager {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public HashMap<Player, Long> cantUseGems = new HashMap(1);
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public LinkedList<UUID> ironShiftLeft = new LinkedList();
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public LinkedList<UUID> ironRightLeft = new LinkedList();
}

