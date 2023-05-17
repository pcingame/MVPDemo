package com.pc.mvpdemo.base

interface BaseView {

    fun showError(error: BaseError, functionName: String? = null)
}
