package com.pc.mvpdemo.feature.main

import com.pc.mvpdemo.data.ApiClient

class MainPresenter(
    private val view: MainContract.View
): MainContract.Presenter {

    private val apiClient = ApiClient()
    override fun performApiCall() {
        TODO("Not yet implemented")
    }

    override fun detachView() {
        TODO("Not yet implemented")
    }
}
