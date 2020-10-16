package com.gameborn.keeperlogin.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gameborn.keeperlogin.data.*
import com.gameborn.keeperlogin.utils.ValidationUtil
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import com.gameborn.keeperlogin.R
import com.gameborn.keeperlogin.di.api.WebAPI
import javax.inject.Inject

/**
 * LoginViewModel - for LoginFragment use only. Handle and validate data for login view
 * @userLoginData - injected property which could be use to provide predefined user login/password, used as an DI example
 * @typedUserData - save login/password data when user types em on LoginFragment
 * @webAPI - service which provides method 'login', 'getUsers'. Built with retrofit
 * @loginResult - Provide results when @webApi:login called
 * @validationResult - Provide results of entered login/password validation
 * @subscription - provides option to dispose API request when it's no longer needed
 */

class LoginViewModel @Inject constructor() : ViewModel()
{
    @Inject
    lateinit var userLoginData: MutableLiveData<UserLoginData>
    var typedUserData: UserLoginData = UserLoginData("", "", "")

    @Inject
    lateinit var webAPI: WebAPI

    var loginResult = MutableLiveData<LoginResult>()
    var validationResult = MutableLiveData<LoginValidationResult>()


    private var subscription: Disposable? = null

    /**
     * data - login and password data provided by user
     * Validate data fields using @ValidationUtil
     * If data valid invoke 'login' call using @webAPI
     */
    fun login()
    {
        //Validate Login/Password fields
        validationResult.value = ValidationUtil.validateLoginPassword(typedUserData.login, typedUserData.password)

        //Call 'login' if fields are valid
        if(validationResult.value!!.isValid())
        {
            subscription = webAPI
                .login(typedUserData.login, typedUserData.password) //call 'login' with required params login/password
                .subscribeOn(Schedulers.io()) //run request on IO thread for network operations
                .subscribe(
                    {result -> if (result) loginResult.postValue(LoginResult(LoginResult.STATUS.SUCCESS)) },
                    {
                        loginResult.postValue(LoginResult(LoginResult.STATUS.ERROR, R.string.login_failed_error_message))
                        disposeSubscriptions()
                    }
                ) //Handle the result

        }
    }

    /**
     * Dispose subscription after successful login
     */
    fun disposeSubscriptions()
    {
        subscription?.dispose()
    }

    /**
     * Method called from LoginFragment to handle data typed by user
     * @login - data from login EditText
     * @password - data from password EditText
     */
    fun loginDataChanged(login: String, password: String)
    {
        typedUserData.login = login
        typedUserData.password = password
    }



}