package com.githubyss.mobile.integration.app

import android.app.Application

/**
 * GlobalApp.kt
 * <功能> Global Application
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 13:42:39
 */

class GlobalApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: GlobalApp? = null
            private set
    }
}