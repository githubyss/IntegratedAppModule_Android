package com.githubyss.mobile.integration.app.entrance

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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ARouter.getInstance().build("/integration/app/homepage/IntegrHomepageActivity").navigation()
        this@IntegrEntranceActivity.finish()
    }
}
