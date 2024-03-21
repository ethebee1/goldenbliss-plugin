/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.iseal.powergems.managers;

import com.ethebee3.managers.*

public class SingletonManager {
    public TempDataManager tempDataManager;

    public void init() {
        this.tempDataManager = new TempDataManager();
    }
}

