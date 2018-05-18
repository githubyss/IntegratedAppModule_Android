package com.githubyss.mobile.integration.app.entrance

import android.content.Intent
import android.os.Bundle
import com.githubyss.mobile.integration.app.base.BaseActivity

/**
 * EntranceActivity.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 17:29:21
 */
class EntranceActivity : BaseActivity() {
    private lateinit var entranceIPresenter: EntranceContract.IPresenter
    private var entranceIView = object : EntranceContract.IView {
        override fun setPresenter(iPresenter: EntranceContract.IPresenter) {
            entranceIPresenter = iPresenter
        }

        override fun gotoMainPage() {
        }
    }

    override fun bindPresenter() {
        EntrancePresenter(entranceIView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindPresenter()
        entranceIPresenter.onStandby()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        entranceIPresenter.onActivityResult(requestCode, resultCode)
    }
}