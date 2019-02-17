package com.fourseasonsweb.fs

import android.app.Application
import android.os.StrictMode
import com.fourseasonsweb.fs.Network.NetworkModule

class BaseApplication: Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        StrictMode.enableDefaults()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule())
            .build()
    }

    fun getApplicationComponent(): AppComponent {
        return appComponent
    }

    companion object {
        lateinit var instance: BaseApplication private set
    }
}