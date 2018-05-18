package com.githubyss.mobile.integration.app.main

import com.githubyss.mobile.integration.app.base.IBasePresenter
import com.githubyss.mobile.integration.app.base.IBaseView

/**
 * MainContract.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 23:23:33
 */
interface MainContract {
    interface IView : IBaseView<IPresenter> {
        fun gotoMorseCodeTrainingPage()
        fun gotoPasswordBankPage()
    }

    interface IPresenter : IBasePresenter {
        fun onActivityResult(requestCode: Int, resultCode: Int)
        fun onMorseCodeTrainingBtnClick()
        fun onPasswordBankBtnClick()
    }
}