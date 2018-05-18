package com.githubyss.mobile.integration.app.entrance

/**
 * EntrancePresenter.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 17:25:37
 */
class EntrancePresenter(iView: EntranceContract.IView) {
    private var entranceIView = iView
    private var entranceIPresenter = object : EntranceContract.IPresenter {
        override fun onStandby() {
            entranceIView.gotoMainPage()
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int) {
        }
    }

    init {
        entranceIView.setPresenter(entranceIPresenter)
    }
}