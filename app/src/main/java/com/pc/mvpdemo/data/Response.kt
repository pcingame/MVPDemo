package com.pc.mvpdemo.data

import com.pc.mvpdemo.base.BaseError

class Response<T> constructor(
    val data: T?,
    val error: BaseError?,
    val isSuccess: Boolean = false,
    val isCache: Boolean = false
)
