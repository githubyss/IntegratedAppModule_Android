package com.githubyss.mobile.integration.app.homepage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.kit.base.ComkitBaseFragment
import com.githubyss.mobile.integration.app.R
import kotlinx.android.synthetic.main.integr_fragment_homepage.*

/**
 * IntegrHomepageFragment.kt
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
@Route(path = "/integration/app/homepage/IntegrHomepageFragment")
class IntegrHomepageFragment : ComkitBaseFragment() {
    companion object {
        val TAG = "IntegrHomepageFragment"
    }

    private lateinit var rootView: View

    private lateinit var integrHomepageIPresenter: IntegrHomepageContract.IPresenter
    private var integrHomepageIView = object : IntegrHomepageContract.IView {
        override fun setPresenter(iPresenter: IntegrHomepageContract.IPresenter) {
            this@IntegrHomepageFragment.integrHomepageIPresenter = iPresenter
        }

        override fun gotoMorseCodePage() {
        }

        override fun gotoPasswordBankPage() {
        }
    }

    private val onClickListener = View.OnClickListener { v ->
        val id = v.id
        when (id) {
            R.id.btnMorseCodeSdk -> {
                ARouter.getInstance().build("/morsecode/app/homepage/MscdHomepageActivity").navigation()
            }

            R.id.btnPasswordBankSdk -> {
            }

            else -> {
            }
        }
    }

    override fun bindPresenter() {
        IntegrHomepagePresenter(this@IntegrHomepageFragment.integrHomepageIView)
    }

    override fun initView() {
        btnMorseCodeSdk.setOnClickListener(this@IntegrHomepageFragment.onClickListener)
        btnPasswordBankSdk.setOnClickListener(this@IntegrHomepageFragment.onClickListener)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindPresenter()
        this@IntegrHomepageFragment.integrHomepageIPresenter.onStandby()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.integr_fragment_homepage, container, false) ?: this@IntegrHomepageFragment.rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        this@IntegrHomepageFragment.integrHomepageIPresenter.onActivityResult(requestCode, resultCode)
    }
}
