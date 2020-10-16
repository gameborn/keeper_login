package com.gameborn.keeperlogin.ui.login;

import java.lang.System;

/**
 * Starting view of the application LoginFragment
 * @viewModel - dependency injection of LoginViewModel
 * @binding - binds to the view and gives and access to all controls of R.layout.login_fragment
 * @nacController - Navigation controller us used to switch between fragments
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0006\u0010 \u001a\u00020\u0013J\u0006\u0010!\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/gameborn/keeperlogin/ui/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/gameborn/keeperlogin/databinding/LoginFragmentBinding;", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/gameborn/keeperlogin/ui/login/LoginViewModel;", "getViewModel", "()Lcom/gameborn/keeperlogin/ui/login/LoginViewModel;", "setViewModel", "(Lcom/gameborn/keeperlogin/ui/login/LoginViewModel;)V", "getObserverForLoginResult", "Landroidx/lifecycle/Observer;", "Lcom/gameborn/keeperlogin/data/LoginResult;", "getObserverForLoginValidation", "Lcom/gameborn/keeperlogin/data/LoginValidationResult;", "handleLoginButtonClick", "", "view", "Landroid/view/View;", "handleOnSuccessLogin", "initialize", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "performLoginAction", "showProgressBar", "updateUserLoginData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.gameborn.keeperlogin.ui.login.LoginViewModel viewModel;
    private com.gameborn.keeperlogin.databinding.LoginFragmentBinding binding;
    private androidx.navigation.NavController navController;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.gameborn.keeperlogin.ui.login.LoginViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.gameborn.keeperlogin.ui.login.LoginViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Initialize all bindings and properties
     */
    private final void initialize() {
    }
    
    public final void updateUserLoginData() {
    }
    
    public final void showProgressBar() {
    }
    
    /**
     * performLoginAction - when login button is clicked. Clear error text fields and call for login method
     */
    private final void performLoginAction() {
    }
    
    /**
     * handleLoginButtonClick - on LoginButton click
     * @view - loginButton
     */
    private final void handleLoginButtonClick(android.view.View view) {
    }
    
    /**
     * getObserverForLoginResult - Provides Observer to handle LoginResult property change
     * //TODO:REFACTOR WHEN REAL LOGIN SERVICE WOULD BE AVAILABLE
     */
    private final androidx.lifecycle.Observer<com.gameborn.keeperlogin.data.LoginResult> getObserverForLoginResult() {
        return null;
    }
    
    /**
     * getObserverForLoginValidation - provides Observer to handle LoginValidationResult changes
     */
    private final androidx.lifecycle.Observer<com.gameborn.keeperlogin.data.LoginValidationResult> getObserverForLoginValidation() {
        return null;
    }
    
    /**
     * handleOnSuccessLogin - perform transition between fragments
     */
    private final void handleOnSuccessLogin() {
    }
    
    public LoginFragment() {
        super();
    }
}