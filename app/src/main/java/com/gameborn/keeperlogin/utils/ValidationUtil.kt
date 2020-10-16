package com.gameborn.keeperlogin.utils

import android.util.Patterns
import com.gameborn.keeperlogin.R
import com.gameborn.keeperlogin.data.LoginValidationResult
import com.gameborn.keeperlogin.ext.PASSWORD_MINIMUM_SYMBOLS

/**
 * ValidationUtil - static validation util help to validate data provided by user and return error message
 */
object ValidationUtil
{
    /**
     * validateLoginPassword - static method helps validate entered data for login and password fields
     * @userLogin - login data
     * @userPassword - password data
     * @return LoginValidationResult
     */
    fun validateLoginPassword(userLogin: String, userPassword: String): LoginValidationResult
    {
        return LoginValidationResult(isUserEmailValid(userLogin), isPasswordValid(userPassword))
    }


    /**
     * isUserEmailValid - validates email data
     * @userEmail - entered user email
     * @return String ResourceId of error message or null if data valid
     */
    private fun isUserEmailValid(userEmail: String = ""): Int? {
        if(Patterns.EMAIL_ADDRESS.matcher(userEmail).matches())
        {
            return null
        }

        return R.string.login_validation_error
    }

    /**
     * isPasswordValid - validates user password data
     * @password - entered user password
     * @return String ResourceId of error message or null if data valid
     */
    private fun isPasswordValid(password: String): Int? {
        if(password.length >= PASSWORD_MINIMUM_SYMBOLS)
        {
            return null
        }

        return R.string.password_validation_error
    }
}