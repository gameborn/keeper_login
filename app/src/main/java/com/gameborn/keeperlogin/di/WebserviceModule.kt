package com.gameborn.keeperlogin.di

import com.gameborn.keeperlogin.di.api.WebAPI
import com.gameborn.keeperlogin.ext.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * WebserviceModule - Hilt module provide instance of Retrofit client and WebAPI
 */

@InstallIn(FragmentComponent::class)
@Module
object WebserviceModule
{
    /**
     * provideUsersAPI - create WebAPI instance for further injection
     */
    @Provides
    @Reusable
    fun provideUsersAPI(retrofit: Retrofit): WebAPI
    {
        return retrofit.create(WebAPI::class.java)
    }

    /**
     * provideRetrofitClient - provides Retrofit client for @provideUsersAPI
     */
    @Provides
    @Reusable
    fun provideRetrofitClient(): Retrofit
    {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}

