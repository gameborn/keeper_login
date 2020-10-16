package com.gameborn.keeperlogin.ui.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gameborn.keeperlogin.data.LoggedUser

class LoggedInViewModel : ViewModel() {
    var userList = MutableLiveData<List<LoggedUser>>()

    fun loadUsers()
    {

    }
}