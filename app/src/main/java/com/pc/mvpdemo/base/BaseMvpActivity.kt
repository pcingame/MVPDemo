package com.pc.mvpdemo.base

abstract class BaseMvpActivity<V : BaseView, P : BasePresenter<V>> : BaseActivity(), BaseView {
    var presenter: P? = null
    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    private fun attachView() {
        if (presenter == null) {
            presenter = initMvpPresenter()
        }
    }

    private fun detachView() {
        presenter?.detachView()
    }

    abstract fun initMvpPresenter(): P

    override fun showError(error: BaseError, functionName: String?) {
        //
    }

}
