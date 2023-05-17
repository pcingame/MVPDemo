package com.pc.mvpdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseMvpFragment<V : BaseView, P : BasePresenter<V>> : BaseFragment(), BaseView {
    var presenter: P? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        attachView()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        detachView()
        super.onDestroy()
    }

    private fun attachView() {
        if (presenter == null) {
            presenter = initMvpPresenter()
        }
        presenter?.attachView(this as V)
    }

    private fun detachView() {
        presenter?.detachView()
    }

    abstract fun initMvpPresenter(): P

    override fun showError(error: BaseError, functionName: String?) {
        //
    }
}

