package com.gameborn.keeperlogin.ui.login;

import java.lang.System;

/**
 * LoginViewModel - for LoginFragment use only. Handle and validate data for login view
 * @userLoginData - injected property which could be use to provide predefined user login/password, used as an DI example
 * @typedUserData - save login/password data when user types em on LoginFragment
 * @webAPI - service which provides method 'login', 'getUsers'. Built with retrofit
 * @loginResult - Provide results when @webApi:login called
 * @validationResult - Provide results of entered login/password validation
 * @subscription - provides option to dispose API request when it's no longer needed
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0016\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020#2\u0006\u0010$\u001a\u00020#R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2 = {"Lcom/gameborn/keeperlogin/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "loginResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gameborn/keeperlogin/data/LoginResult;", "getLoginResult", "()Landroidx/lifecycle/MutableLiveData;", "setLoginResult", "(Landroidx/lifecycle/MutableLiveData;)V", "subscription", "Lio/reactivex/disposables/Disposable;", "typedUserData", "Lcom/gameborn/keeperlogin/data/UserLoginData;", "getTypedUserData", "()Lcom/gameborn/keeperlogin/data/UserLoginData;", "setTypedUserData", "(Lcom/gameborn/keeperlogin/data/UserLoginData;)V", "userLoginData", "getUserLoginData", "setUserLoginData", "validationResult", "Lcom/gameborn/keeperlogin/data/LoginValidationResult;", "getValidationResult", "setValidationResult", "webAPI", "Lcom/gameborn/keeperlogin/di/api/WebAPI;", "getWebAPI", "()Lcom/gameborn/keeperlogin/di/api/WebAPI;", "setWebAPI", "(Lcom/gameborn/keeperlogin/di/api/WebAPI;)V", "disposeSubscriptions", "", "login", "loginDataChanged", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.UserLoginData> userLoginData;
    @org.jetbrains.annotations.NotNull()
    private com.gameborn.keeperlogin.data.UserLoginData typedUserData;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.gameborn.keeperlogin.di.api.WebAPI webAPI;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginResult> loginResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginValidationResult> validationResult;
    private io.reactivex.disposables.Disposable subscription;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.UserLoginData> getUserLoginData() {
        return null;
    }
    
    public final void setUserLoginData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.UserLoginData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gameborn.keeperlogin.data.UserLoginData getTypedUserData() {
        return null;
    }
    
    public final void setTypedUserData(@org.jetbrains.annotations.NotNull()
    com.gameborn.keeperlogin.data.UserLoginData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gameborn.keeperlogin.di.api.WebAPI getWebAPI() {
        return null;
    }
    
    public final void setWebAPI(@org.jetbrains.annotations.NotNull()
    com.gameborn.keeperlogin.di.api.WebAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginResult> getLoginResult() {
        return null;
    }
    
    public final void setLoginResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginResult> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginValidationResult> getValidationResult() {
        return null;
    }
    
    public final void setValidationResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.gameborn.keeperlogin.data.LoginValidationResult> p0) {
    }
    
    /**
     * data - login and password data provided by user
     * Validate data fields using @ValidationUtil
     * If data valid invoke 'login' call using @webAPI
     */
    public final void login() {
    }
    
    /**
     * Dispose subscription after successful login
     */
    public final void disposeSubscriptions() {
    }
    
    /**
     * Method called from LoginFragment to handle data typed by user
     * @login - data from login EditText
     * @password - data from password EditText
     */
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel() {
        super();
    }
}