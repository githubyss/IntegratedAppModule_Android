package com.githubyss.mobile.integration.app.entrance

import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.ui.basemvp.ComuiBaseActivity

/**
 * IntegrEntranceActivity.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
@Route(path = "/integration/app/entrance/IntegrEntranceActivity")
class IntegrEntranceActivity : ComuiBaseActivity() {
    private lateinit var integrEntranceIPresenter: IntegrEntranceContract.IPresenter
    private var integrEntranceIView = object : IntegrEntranceContract.IView {
        override fun setPresenter(iPresenter: IntegrEntranceContract.IPresenter) {
            integrEntranceIPresenter = iPresenter
        }

        override fun gotoHomepage() {
            ARouter.getInstance().build("/integration/app/homepage/IntegrHomepageActivity").navigation()
            this@IntegrEntranceActivity.finish()
        }
    }

    override fun bindPresenter() {
        IntegrEntrancePresenter(integrEntranceIView)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindPresenter()
        integrEntranceIPresenter.onStandby()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        integrEntranceIPresenter.onActivityResult(requestCode, resultCode)
    }
}
