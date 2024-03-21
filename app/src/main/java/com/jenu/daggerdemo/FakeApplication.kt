package com.jenu.daggerdemo

import android.app.Application
import com.jenu.daggerdemo.di.ApplicationComponent

class FakeApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }

}