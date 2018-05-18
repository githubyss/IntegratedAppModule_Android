package com.githubyss.mobile.integration.app.main

/**
 * MainPresenter.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 23:24:00
 */
class MainPresenter(iView: MainContract.IView) {
    private var mainIView = iView
    private var mainIPresenter = object : MainContract.IPresenter {
        override fun onStandby() {
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int) {
        }

        override fun onMorseCodeTrainingBtnClick() {
            mainIView.gotoMorseCodeTrainingPage()
        }

        override fun onPasswordBankBtnClick() {
            mainIView.gotoPasswordBankPage()
        }
    }

    init {
        mainIView.setPresenter(mainIPresenter)
    }
}