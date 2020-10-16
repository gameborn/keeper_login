package com.gameborn.keeperlogin;

import java.lang.System;

/**
 * KeeperApplication - required class to initialize Hilt
 * provides options to handle some global dependecies in Application
 * Modules which want to inject data here must me annotated with InstallIn(ApplicationComponent::class)
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/gameborn/keeperlogin/KeeperApplication;", "Landroid/app/Application;", "()V", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public class KeeperApplication extends android.app.Application {
    
    public KeeperApplication() {
        super();
    }
}