package com.pc.mvpdemo.base

interface BasePresenter<in V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}
