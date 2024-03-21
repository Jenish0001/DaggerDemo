package com.jenu.daggerdemo.di

import com.jenu.daggerdemo.MainActivity
import com.jenu.daggerdemo.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}