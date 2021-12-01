package com.amrilhs.loginusingdagger.di

import android.content.Context
import com.amrilhs.loginusingdagger.HomeActivity
import com.amrilhs.loginusingdagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: HomeActivity)
}