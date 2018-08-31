package com.githubyss.mobile.integration.app.homepage

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.githubyss.mobile.common.ui.basemvp.ComuiBaseActivity
import com.githubyss.mobile.integration.app.R
import com.githubyss.mobile.integration.app.config.IntegrPageRouterConfig

/**
 * IntegrHomepageActivity
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
@Route(path = IntegrPageRouterConfig.HOME_ACTIVITY)
class IntegrHomepageActivity : ComuiBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addFragment(IntegrHomepageFragment(), IntegrHomepageFragment.TAG, false)
    }

    override fun onResume() {
        super.onResume()

        setToolbarTitle(R.string.integrHomepageTitle)
    }
}
