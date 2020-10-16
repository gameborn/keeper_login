package com.gameborn.keeperlogin.data;

import java.lang.System;

/**
 * LoginResult - provide information over 'login' call
 * @status - result of 'login' request
 * @errorMessage - String ResourceId for suitable error message
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/gameborn/keeperlogin/data/LoginResult;", "", "status", "Lcom/gameborn/keeperlogin/data/LoginResult$STATUS;", "errorMessage", "", "(Lcom/gameborn/keeperlogin/data/LoginResult$STATUS;Ljava/lang/Integer;)V", "getErrorMessage", "()Ljava/lang/Integer;", "setErrorMessage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatus", "()Lcom/gameborn/keeperlogin/data/LoginResult$STATUS;", "setStatus", "(Lcom/gameborn/keeperlogin/data/LoginResult$STATUS;)V", "isSuccess", "", "STATUS", "app_debug"})
public final class LoginResult {
    @org.jetbrains.annotations.NotNull()
    private com.gameborn.keeperlogin.data.LoginResult.STATUS status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer errorMessage;
    
    public final boolean isSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gameborn.keeperlogin.data.LoginResult.STATUS getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.gameborn.keeperlogin.data.LoginResult.STATUS p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public LoginResult(@org.jetbrains.annotations.NotNull()
    com.gameborn.keeperlogin.data.LoginResult.STATUS status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorMessage) {
        super();
    }
    
    public LoginResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/gameborn/keeperlogin/data/LoginResult$STATUS;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "DEFAULT", "app_debug"})
    public static enum STATUS {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ DEFAULT /* = new DEFAULT() */;
        
        STATUS() {
        }
    }
}