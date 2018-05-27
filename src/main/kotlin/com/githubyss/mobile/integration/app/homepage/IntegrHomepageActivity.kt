package com.githubyss.mobile.integration.app.homepage

import android.app.Fragment
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.kit.base.ComkitBaseActivity
import com.githubyss.mobile.integration.app.R

/**
 * IntegrHomepageActivity.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
@Route(path = "/integration/app/homepage/IntegrHomepageActivity")
class IntegrHomepageActivity : ComkitBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment = ARouter.getInstance().build("/integration/app/homepage/IntegrHomepageFragment").navigation() as Fragment
        addFragment(fragment, "/integration/app/homepage/IntegrHomepageFragment", false)
    }

    override fun onResume() {
        super.onResume()

        setToolbarTitle(R.string.integrHomepageTitle)
    }
}
