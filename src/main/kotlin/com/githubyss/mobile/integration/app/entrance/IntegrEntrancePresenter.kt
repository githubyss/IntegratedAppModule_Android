package com.githubyss.mobile.integration.app.entrance

/**
 * IntegrEntrancePresenter.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
class IntegrEntrancePresenter(iView: IntegrEntranceContract.IView) {
    private var integrEntranceIView = iView
    private var integrEntranceIPresenter = object : IntegrEntranceContract.IPresenter {
        override fun onStandby() {
            integrEntranceIView.gotoHomepage()
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int) {
        }
    }

    init {
        integrEntranceIView.setPresenter(integrEntranceIPresenter)
    }
}
