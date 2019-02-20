package com.fourseasonsweb.fs.Data.User

class TokenModel {
    private var access_token: String? =null
    private var token_type: String? =null
    private var expires_in: Long? =null
    private var refresh_token: String? =null


    fun getAccess_token(): String? {
        return access_token
    }

    fun setAccess_token(value: String?) {
        this.access_token = value
    }

    fun getToken_type(): String? {
        return token_type
    }

    fun setToken_type(value: String?) {
        this.token_type = value
    }

    fun getExpires_in(): Long? {
        return expires_in
    }

    fun setExpires_in(value: Long?) {
        this.expires_in = value
    }

    fun getRefresh_token(): String? {
        return refresh_token
    }

    fun setRefresh_token(value: String?) {
        this.refresh_token = value
    }
}