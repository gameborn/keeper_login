package com.gameborn.keeperlogin.di

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.gameborn.keeperlogin.data.UserLoginData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


/**
 * UserLoginModule - Hilt module provides UserLoginData as an example of Hilt Framework
 */
@InstallIn(FragmentComponent::class)
@Module
object UserLoginModule
{
    @Provides
    fun provideUserLoginData(): MutableLiveData<UserLoginData>
    {
        return MutableLiveData<UserLoginData>(UserLoginData("Test", "PASS"))
    }

    @Provides
    @Singleton
    fun provideContext(@ApplicationContext appContext: Context): Context
    {
        return appContext
    }

}
