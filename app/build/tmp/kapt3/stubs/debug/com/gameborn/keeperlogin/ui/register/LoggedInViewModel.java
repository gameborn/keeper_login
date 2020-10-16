package com.gameborn.keeperlogin.ui.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/gameborn/keeperlogin/ui/register/LoggedInViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "userList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/gameborn/keeperlogin/data/LoggedUser;", "getUserList", "()Landroidx/lifecycle/MutableLiveData;", "setUserList", "(Landroidx/lifecycle/MutableLiveData;)V", "loadUsers", "", "app_debug"})
public final class LoggedInViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.gameborn.keeperlogin.data.LoggedUser>> userList;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.gameborn.keeperlogin.data.LoggedUser>> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.gameborn.keeperlogin.data.LoggedUser>> p0) {
    }
    
    public final void loadUsers() {
    }
    
    public LoggedInViewModel() {
        super();
    }
}