package com.pc.mvpdemo.data

import com.squareup.okhttp.Callback
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request

class ApiClient {
    private val client: OkHttpClient = OkHttpClient()

    fun makeApiCall(endpoint: String, callback: Callback) {
        val url = BASE_URL + endpoint
        val request = Request.Builder()
            .url(url)
            .build()
        client.newCall(request).enqueue(callback)
    }

    companion object {
        const val BASE_URL = ""
    }
}
