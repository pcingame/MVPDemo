package com.pc.mvpdemo.feature.main

interface MainContract {
    interface View{
        fun showLoading()
        fun hideLoading()
        fun showResult(result: String)
        fun show(error: String)
    }

    interface Presenter{
        fun performApiCall()
        fun detachView()
    }
}
