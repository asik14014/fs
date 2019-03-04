package com.fourseasonsweb.fs.Network

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RequestInterceptor @Inject
constructor() : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url()

        val url = originalHttpUrl.newBuilder()
            //.addQueryParameter("api_key", BuildConfig.FS_API_KEY)
            .build()

        val request = original.newBuilder()
            .addHeader("Authorization", "Bearer " + "")//token
            .url(url)
            .build()
        return chain.proceed(request)
    }
}