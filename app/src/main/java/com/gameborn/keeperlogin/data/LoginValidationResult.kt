package com.gameborn.keeperlogin.data

/**
 * LoginValidationResult - provides information over validation of data fields on LoginFragment
 * @loginErrorMessage - String ResourceId of error message for login field. Nullable
 * @passwordErrorMessage - String ResourceId of error message for password field. Nullable
 * @isValid - method handles valid request
 */
data class LoginValidationResult (var loginErrorMessage: Int? = null, var passwordErrorMessage: Int? = null)
{
    fun isValid(): Boolean
    {
        return loginErrorMessage == null && passwordErrorMessage == null
    }
}