package com.gameborn.keeperlogin.data

/**
 * LoggedUser coming from public RESTful API (https://gorest.co.in/public-api)
 * @id - user identification number
 * @name - user name
 * @email - user email
 * @gender - user gender
 * @status - is user active
 * @created_at - when users profile has been created
 * @updated_at = when user updated his profile last time
 */
data class LoggedUser (val id: Int, val name: String, val email: String, val gender: String, val status:String, val created_at:String, val updated_at: String)