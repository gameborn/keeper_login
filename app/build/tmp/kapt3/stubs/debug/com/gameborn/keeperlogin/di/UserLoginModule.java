package com.gameborn.keeperlogin.di;

import java.lang.System;

/**
 * UserLoginModule - Hilt module provides UserLoginData as an example of Hilt Framework
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/gameborn/keeperlogin/di/UserLoginModule;", "", "()V", "provideContext", "Landroid/content/Context;", "appContext", "provideUserLoginData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gameborn/keeperlogin/data/UserLoginData;", "app_debug"})
@dagger.Module()
public final class UserLoginModule {
    public static final com.gameborn.keeperlogin.di.UserLoginModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.UserLoginData> provideUserLoginData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    private UserLoginModule() {
        super();
    }
}