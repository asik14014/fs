package com.fourseasonsweb.fs.Network

import com.fourseasonsweb.fs.Data.User.ChangePasswordModel
import com.fourseasonsweb.fs.Data.User.LoginResponse
import com.fourseasonsweb.fs.Data.User.RegistrationModel
import com.fourseasonsweb.fs.Data.User.RegistrationResponse
import retrofit2.Call
import retrofit2.http.*

interface AccountingApiService {

    @POST("api/user/login")
    @FormUrlEncoded
    fun login(@Field("email") login: String, @Field("password") password: String): Call<LoginResponse>

    @POST("api/user/register")
    @FormUrlEncoded
    fun register(@Body param: RegistrationModel): Call<RegistrationResponse>

    @GET("api/user/logout")
    fun logout(): Call<Void>

    @POST("api/user/changepassword")
    @FormUrlEncoded
    fun changePassword(@Body param: ChangePasswordModel): Call<Void>

    @GET("api/user/ResetPassword")
    fun resetPassword(@Field("username") login: String): Call<Void>

    @GET("api/user/SetPassword")
    fun setPassword(@Field("password") password: String): Call<Void>
}