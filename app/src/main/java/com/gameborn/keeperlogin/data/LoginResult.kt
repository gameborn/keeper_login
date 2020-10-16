package com.gameborn.keeperlogin.data

/**
 * LoginResult - provide information over 'login' call
 * @status - result of 'login' request
 * @errorMessage - String ResourceId for suitable error message
 */
class LoginResult(var status: STATUS = STATUS.DEFAULT, var errorMessage: Int? = null)
{
    enum class STATUS
    {
        SUCCESS,
        ERROR,
        DEFAULT
    }

    fun isSuccess(): Boolean
    {
        return status.equals(STATUS.SUCCESS)
    }

}