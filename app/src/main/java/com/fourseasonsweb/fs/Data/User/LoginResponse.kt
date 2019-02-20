package com.fourseasonsweb.fs.Data.User

class LoginResponse {
    private var token: TokenModel? = null
    private var user: UserModel? = null
    private var message: String? = null

    fun getToken(): TokenModel? {
        return token
    }

    fun setToken(value: TokenModel?) {
        this.token = value
    }

    fun getUser(): UserModel? {
        return user
    }

    fun setUser(value: UserModel?) {
        this.user = value
    }

    fun getMessge(): String? {
        return message
    }

    fun setMessge(value: String?) {
        this.message = value
    }
}