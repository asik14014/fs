package com.fourseasonsweb.fs

import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private var context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideResources(context: Context): Resources {
        return context.resources
    }
}