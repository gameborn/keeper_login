package com.gameborn.keeperlogin.di.api

import com.gameborn.keeperlogin.data.LoggedUser
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * WebAPI - an interface with available methods using to instantiate WebAPI class with Retrofit
 */

interface WebAPI
{
    /**
     * getUsers - request using in LoggedInFragment. Loading list of users (@LoggedUser)
     * @page - request user list using page number
     */
    @GET("/users")
    fun getUsers(@Query ("page") id: Int): Observable<List<LoggedUser>>

    /**
     * login - request using in LoginFragment
     * @login - users login
     * @password - users password
     */
    @GET("/login")
    fun login(@Query("login") login:String, @Query("password") password: String): Observable<Boolean>

}