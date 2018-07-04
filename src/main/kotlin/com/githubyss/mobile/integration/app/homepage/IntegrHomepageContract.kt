package com.githubyss.mobile.integration.app.homepage

import com.githubyss.mobile.common.ui.basemvp.ComuiIBasePresenter
import com.githubyss.mobile.common.ui.basemvp.ComuiIBaseView

/**
 * IntegrHomepageContract.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
interface IntegrHomepageContract {
    interface IView : ComuiIBaseView<IPresenter> {
        fun gotoMorseCodePage()
        fun gotoPasswordBankPage()
    }

    interface IPresenter : ComuiIBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
        fun onMorseCodeBtnClick()
        fun onPasswordBankBtnClick()
    }
}
