package com.fourseasonsweb.fs

import com.fourseasonsweb.fs.Network.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {
    //fun inject(context: Context)
    fun inject(activity: LoginActivity)
    fun inject(activity: RecordAddActivity)
}