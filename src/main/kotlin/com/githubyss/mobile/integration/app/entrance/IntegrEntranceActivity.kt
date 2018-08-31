package com.githubyss.mobile.integration.app.entrance

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.ui.basemvp.ComuiBaseActivity
import com.githubyss.mobile.integration.app.config.IntegrPageRouterConfig

/**
 * IntegrEntranceActivity
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
@Route(path = IntegrPageRouterConfig.ENTRANCE_ACTIVITY)
class IntegrEntranceActivity : ComuiBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ARouter.getInstance().build(IntegrPageRouterConfig.HOME_ACTIVITY).navigation()
        this@IntegrEntranceActivity.finish()
    }
}
