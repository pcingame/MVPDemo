package com.pc.mvpdemo.base

import java.lang.ref.WeakReference

abstract class BasePresenterImpl<V : BaseView> : BasePresenter<V> {
    private val isViewAttached: Boolean
        get() = weekView != null && weekView?.get() != null

    private var weekView: WeakReference<V>? = null

    internal val view: V?
        get() = weekView?.get()

    override fun attachView(view: V) {
        if (!isViewAttached) {
            weekView = WeakReference(view)
        }
    }

    override fun detachView() {
        weekView?.clear()
        weekView = null
    }
}
