package com.ethebee3.goldenblissplugin.managers;

import com.ethebee3.goldenblissplugin.managers.TempDataManager;

public class SingletonManager {
    public TempDataManager tempDataManager;

    public void init() {
        this.tempDataManager = new TempDataManager();
    }
}

