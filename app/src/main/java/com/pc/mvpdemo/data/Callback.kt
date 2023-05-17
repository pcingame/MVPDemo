package com.pc.mvpdemo.data

interface Callback<T> {
    fun complete(response: Response<T>?)
}
