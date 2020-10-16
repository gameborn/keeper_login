package com.gameborn.keeperlogin.data

import org.jetbrains.annotations.NotNull
import javax.inject.Inject

/**
 * UserLoginData - stores data for 'login' request on LoginFragment
 * @login - data from login field
 * @password - data from password field
 */
data class UserLoginData @Inject constructor (var login:String, var password:String, var token:String = "")