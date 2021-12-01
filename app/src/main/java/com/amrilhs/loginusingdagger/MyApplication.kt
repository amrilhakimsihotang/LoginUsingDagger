package com.amrilhs.loginusingdagger

import android.app.Application
import com.amrilhs.loginusingdagger.di.AppComponent
import com.amrilhs.loginusingdagger.di.DaggerAppComponent


open class MyApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
        applicationContext)
    }
}