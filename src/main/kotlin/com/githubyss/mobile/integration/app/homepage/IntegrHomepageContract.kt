package com.githubyss.mobile.integration.app.homepage

import com.githubyss.mobile.common.kit.base.ComkitIBasePresenter
import com.githubyss.mobile.common.kit.base.ComkitIBaseView

/**
 * IntegrHomepageContract.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
interface IntegrHomepageContract {
    interface IView : ComkitIBaseView<IPresenter> {
        fun gotoMorseCodePage()
        fun gotoPasswordBankPage()
    }

    interface IPresenter : ComkitIBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
        fun onMorseCodeBtnClick()
        fun onPasswordBankBtnClick()
    }
}
