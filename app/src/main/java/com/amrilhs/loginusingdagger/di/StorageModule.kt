package com.amrilhs.loginusingdagger.di

import android.content.Context
import com.amrilhs.loginusingdagger.SessionManager
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideSessionManager(context: Context):SessionManager = SessionManager(context)
}