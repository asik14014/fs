package com.fourseasonsweb.fs.Network

import com.fourseasonsweb.fs.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    val CONNECT_TIMEOUT_IN_MS = 30000

    @Provides
    @Singleton
    internal fun requestInterceptor(interceptor: RequestInterceptor): Interceptor {
        return interceptor
    }

    @Provides
    @Singleton
    internal fun provideOkHttpClient(requestInterceptor: RequestInterceptor): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(CONNECT_TIMEOUT_IN_MS.toLong(), TimeUnit.MILLISECONDS)
            .addInterceptor(requestInterceptor)

        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(loggingInterceptor)
        }

        return builder.build()
    }

    @Singleton
    @Provides
    internal fun retrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    internal fun tmdbWebService(retrofit: Retrofit): AccountingApiService {
        return retrofit.create(AccountingApiService::class.java)
    }

    companion object {
        val CONNECT_TIMEOUT_IN_MS = 30000
    }

}