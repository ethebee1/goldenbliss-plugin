/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.ethebee3.managers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import org.bukkit.entity.Player;

public class TempDataManager {
    public HashMap<Player, Long> cantUseGems = new HashMap(1);
    public LinkedList<UUID> ironShiftLeft = new LinkedList();
    public LinkedList<UUID> ironRightLeft = new LinkedList();
}

