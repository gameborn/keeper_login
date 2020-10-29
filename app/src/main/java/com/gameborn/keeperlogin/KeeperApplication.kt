package com.gameborn.keeperlogin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * KeeperApplication - required class to initialize Hilt
 * provides options to handle some global dependecies in Application
 * Modules which want to inject data here must be annotated with InstallIn(ApplicationComponent::class)
 */

@HiltAndroidApp
open class KeeperApplication: Application()
