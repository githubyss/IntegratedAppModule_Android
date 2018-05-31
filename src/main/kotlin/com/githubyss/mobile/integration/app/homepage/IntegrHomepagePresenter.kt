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
            this@IntegrHomepagePresenter.integrHomepageIView.gotoMorseCodePage()
        }

        override fun onPasswordBankBtnClick() {
            this@IntegrHomepagePresenter.integrHomepageIView.gotoPasswordBankPage()
        }
    }

    init {
        this@IntegrHomepagePresenter.integrHomepageIView.setPresenter(this@IntegrHomepagePresenter.integrHomepageIPresenter)
    }
}
