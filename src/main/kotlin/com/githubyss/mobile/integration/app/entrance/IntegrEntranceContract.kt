package com.githubyss.mobile.integration.app.entrance

import com.githubyss.mobile.common.kit.base.ComkitIBasePresenter
import com.githubyss.mobile.common.kit.base.ComkitIBaseView

/**
 * IntegrEntranceContract.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
interface IntegrEntranceContract {
    interface IView : ComkitIBaseView<IPresenter> {
        fun gotoHomepage()
    }

    interface IPresenter : ComkitIBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
    }
}
