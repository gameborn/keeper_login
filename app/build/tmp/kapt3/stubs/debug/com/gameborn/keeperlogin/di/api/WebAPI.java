package com.gameborn.keeperlogin.di.api;

import java.lang.System;

/**
 * WebAPI - an interface with available methods using to instantiate WebAPI class with Retrofit
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\b\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/gameborn/keeperlogin/di/api/WebAPI;", "", "getUsers", "Lio/reactivex/Observable;", "", "Lcom/gameborn/keeperlogin/data/LoggedUser;", "id", "", "login", "", "", "password", "app_debug"})
public abstract interface WebAPI {
    
    /**
     * getUsers - request using in LoggedInFragment. Loading list of users (@LoggedUser)
     * @page - request user list using page number
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract io.reactivex.Observable<java.util.List<com.gameborn.keeperlogin.data.LoggedUser>> getUsers(@retrofit2.http.Query(value = "page")
    int id);
    
    /**
     * login - request using in LoginFragment
     * @login - users login
     * @password - users password
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/login")
    public abstract io.reactivex.Observable<java.lang.Boolean> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "login")
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "password")
    java.lang.String password);
}