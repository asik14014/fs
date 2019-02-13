package com.fourseasonsweb.fs.Network

import com.fourseasonsweb.fs.Data.User
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AccountingApiService {

    @POST("api/user/login")
    @FormUrlEncoded
    fun login(@Field("emial") login: String, @Field("password") password: String): Call<User>


//    @GET("3/search/movie?language=en-US&page=1")
//    fun setPassword(@Query("query") searchQuery: String): Observable<MoviesWraper>

}