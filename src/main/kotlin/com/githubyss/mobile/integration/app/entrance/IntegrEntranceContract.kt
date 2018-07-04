package com.githubyss.mobile.integration.app.entrance

import com.githubyss.mobile.common.ui.basemvp.ComuiIBasePresenter
import com.githubyss.mobile.common.ui.basemvp.ComuiIBaseView

/**
 * IntegrEntranceContract.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
interface IntegrEntranceContract {
    interface IView : ComuiIBaseView<IPresenter> {
        fun gotoHomepage()
    }

    interface IPresenter : ComuiIBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
    }
}
