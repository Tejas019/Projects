package com.tejas.helpers.di

import android.content.Context
import com.tejas.helpers.utils.AppExecutors
import com.tejas.helpers.utils.SharedPrefs
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
public class AppModule(var mContext: Context) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return mContext
    }

    @Singleton
    @Provides
    fun provideExecutors(): AppExecutors {
        return AppExecutors()
    }

    @Singleton
    @Provides
    fun providePrefs(): SharedPrefs {
        return SharedPrefs(mContext)
    }
}