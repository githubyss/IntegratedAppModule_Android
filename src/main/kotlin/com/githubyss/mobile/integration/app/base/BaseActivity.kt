package com.githubyss.mobile.integration.app.base

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.githubyss.mobile.integration.app.R

/**
 * BaseActivity.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 16:10:44
 */
abstract class BaseActivity : AppCompatActivity() {
    /** Bind Presenter. by Ace Yan, at 2018/05/18 10:57:55 */
    abstract fun bindPresenter()

    /** Init Views, Listeners, Adapters, and so on. by Ace Yan, at 2018/05/18 10:58:46 */
    open fun initView() {}

    /** Init default value of Top-level variables, and so on. by Ace Yan, at 2018/05/18 11:07:25 */
    open fun initData() {}

    /** Refresh Views. by Ace Yan, at 2018/05/18 11:08:52 */
    open fun refreshView() {}

    protected fun addFragment(fragment: Fragment, tag: String? = null, addToBackStack: Boolean) {
        fragment.arguments = intent.extras
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fl_fragment_content, fragment, tag)
        if (addToBackStack) {
            fragmentTransaction.addToBackStack(null)
        }
        fragmentTransaction.commitAllowingStateLoss()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}