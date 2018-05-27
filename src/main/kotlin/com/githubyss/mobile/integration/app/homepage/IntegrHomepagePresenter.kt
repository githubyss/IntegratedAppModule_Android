package com.githubyss.mobile.integration.app.homepage

/**
 * IntegrHomepagePresenter.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
class IntegrHomepagePresenter(iView: IntegrHomepageContract.IView) {
    private var integrHomepageIView = iView
    private var integrHomepageIPresenter = object : IntegrHomepageContract.IPresenter {
        override fun onStandby() {
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int) {
        }

        override fun onMorseCodeBtnClick() {
            integrHomepageIView.gotoMorseCodePage()
        }

        override fun onPasswordBankBtnClick() {
            integrHomepageIView.gotoPasswordBankPage()
        }
    }

    init {
        integrHomepageIView.setPresenter(integrHomepageIPresenter)
    }
}
