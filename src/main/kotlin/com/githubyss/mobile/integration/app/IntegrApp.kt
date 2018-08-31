package com.githubyss.mobile.integration.app

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.kit.ComkitApplication
import com.githubyss.mobile.common.kit.logcat.ComkitLogcatUtils
import com.githubyss.mobile.common.network.ComnetApplication

/**
 * IntegrApp
 * <Description> Global Application
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
class IntegrApp : Application() {
    companion object {
        lateinit var instance: IntegrApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this@IntegrApp

        initARouter(instance)
        initComkit(instance)
        initComnet(instance)

        initLog(ComkitLogcatUtils.LOG_LEVEL_VERBOSE)
    }

    /** Inner static singleton mode. by Ace Yan */
//    companion object {
//        var instance = Holder.INSTANCE
//    }
//
//    private object Holder {
//        val INSTANCE = IntegrApp()
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//
//        initARouter(instance)
//    }

    private fun initARouter(application: IntegrApp) {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(application)
    }

    private fun initComkit(application: IntegrApp) {
        ComkitApplication.instance.init(application)
    }

    private fun initComnet(application: IntegrApp) {
        ComnetApplication.instance.init(application)
    }

    private fun initLog(level: Int) {
        ComkitLogcatUtils.logLevel = level
    }
}
