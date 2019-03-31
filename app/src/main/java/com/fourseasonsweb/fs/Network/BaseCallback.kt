package com.fourseasonsweb.fs.Network

import android.content.Context
import android.content.Intent
import com.fourseasonsweb.fs.LoginActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class BaseCallback<T>(private val context: Context) : Callback<T> {

    override fun onResponse(call: Call<T>, response: Response<T>) {
        if (response.code() === 403) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        } else {
            onSuccess(response.body()!!)
        }
    }

    override fun onFailure(call: Call<T>, t: Throwable) {

    }

    internal abstract fun onSuccess(response: T)

}