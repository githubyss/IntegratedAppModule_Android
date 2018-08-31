package com.githubyss.mobile.integration.app.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.launcher.ARouter
import com.githubyss.mobile.common.ui.basemvp.ComuiBaseFragment
import com.githubyss.mobile.experiment.app.config.ExpPageRouterConfig
import com.githubyss.mobile.integration.app.R
import com.githubyss.mobile.morsecode.app.config.McappPageRouterConfig
import kotlinx.android.synthetic.main.integr_fragment_homepage.*

/**
 * IntegrHomepageFragment
 * <Description>
 * <Details>
 *
 * @author Ace Yan
 * @github githubyss
 */
class IntegrHomepageFragment : ComuiBaseFragment() {
    companion object {
        val TAG = IntegrHomepageFragment::class.java.simpleName
    }


    private var rootView: View? = null

    private val onClickListener = View.OnClickListener { v ->
        when (v.id) {
            R.id.btnMorseCodeApp -> {
                ARouter.getInstance().build(McappPageRouterConfig.HOMEPAGE_ACTIVITY).navigation()
            }

            R.id.btnPasswordBankApp -> {
            }

            R.id.btnExperimentApp -> {
                ARouter.getInstance().build(ExpPageRouterConfig.HOMEPAGE).navigation()
            }

            else -> {
            }
        }
    }


    override fun initView() {
        btnMorseCodeApp.setOnClickListener(onClickListener)
        btnPasswordBankApp.setOnClickListener(onClickListener)
        btnExperimentApp.setOnClickListener(onClickListener)
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater?.inflate(R.layout.integr_fragment_homepage, container, false) ?: rootView
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }
}
