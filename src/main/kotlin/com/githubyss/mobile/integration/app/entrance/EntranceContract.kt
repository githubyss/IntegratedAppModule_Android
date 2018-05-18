package com.githubyss.mobile.integration.app.entrance

import com.githubyss.mobile.integration.app.base.IBasePresenter
import com.githubyss.mobile.integration.app.base.IBaseView

/**
 * EntranceContract.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 17:21:48
 */
interface EntranceContract {
    interface IView : IBaseView<IPresenter> {
        fun gotoMainPage()
    }

    interface IPresenter : IBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
    }
}