package com.gameborn.keeperlogin.utils;

import java.lang.System;

/**
 * ValidationUtil - static validation util help to validate data provided by user and return error message
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/gameborn/keeperlogin/utils/ValidationUtil;", "", "()V", "isPasswordValid", "", "password", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "isUserEmailValid", "userEmail", "validateLoginPassword", "Lcom/gameborn/keeperlogin/data/LoginValidationResult;", "userLogin", "userPassword", "app_debug"})
public final class ValidationUtil {
    public static final com.gameborn.keeperlogin.utils.ValidationUtil INSTANCE = null;
    
    /**
     * validateLoginPassword - static method helps validate entered data for login and password fields
     * @userLogin - login data
     * @userPassword - password data
     * @return LoginValidationResult
     */
    @org.jetbrains.annotations.NotNull()
    public final com.gameborn.keeperlogin.data.LoginValidationResult validateLoginPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String userPassword) {
        return null;
    }
    
    /**
     * isUserEmailValid - validates email data
     * @userEmail - entered user email
     * @return String ResourceId of error message or null if data valid
     */
    private final java.lang.Integer isUserEmailValid(java.lang.String userEmail) {
        return null;
    }
    
    /**
     * isPasswordValid - validates user password data
     * @password - entered user password
     * @return String ResourceId of error message or null if data valid
     */
    private final java.lang.Integer isPasswordValid(java.lang.String password) {
        return null;
    }
    
    private ValidationUtil() {
        super();
    }
}