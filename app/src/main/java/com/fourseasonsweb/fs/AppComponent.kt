package com.fourseasonsweb.fs

import android.content.Context
import com.fourseasonsweb.fs.Network.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {
    fun inject(context: Context)
}