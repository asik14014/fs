package com.fourseasonsweb.fs.Data

class BaseResponse {
    private var code: Int? = null
    private var message: String? = null

    fun getCode(): Int? {
        return code
    }

    fun setCode(value: Int?) {
        this.code = value
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(value: String?) {
        this.message = value
    }
}