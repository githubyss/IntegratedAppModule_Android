package com.githubyss.mobile.integration.app.main

import android.content.Intent
import android.os.Bundle
import com.githubyss.mobile.integration.app.base.BaseActivity

/**
 * MainActivity.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 23:23:06
 */
class MainActivity : BaseActivity() {
    private lateinit var mainIPresenter: MainContract.IPresenter
    private var mainIView = object : MainContract.IView {
        override fun setPresenter(iPresenter: MainContract.IPresenter) {
            mainIPresenter = iPresenter
        }

        override fun gotoMorseCodeTrainingPage() {
        }

        override fun gotoPasswordBankPage() {
        }
    }

    override fun bindPresenter() {
        MainPresenter(mainIView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindPresenter()
        mainIPresenter.onStandby()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mainIPresenter.onActivityResult(requestCode, resultCode)
    }
}