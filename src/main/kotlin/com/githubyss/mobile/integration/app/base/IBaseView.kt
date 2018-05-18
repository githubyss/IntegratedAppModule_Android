package com.githubyss.mobile.integration.app.base

/**
 * IBaseView.kt
 * <功能>
 * <详细>
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2018/5/17 17:19:31
 */
interface IBaseView<in P> {
    fun setPresenter(iPresenter: P)
}