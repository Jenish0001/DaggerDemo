package com.jenu.daggerdemo.di.module

import com.jenu.daggerdemo.retofit.FakerAPI
import com.jenu.daggerdemo.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun providerRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
    @Singleton
    @Provides
    fun provideFakeApi(retrofit: Retrofit) :FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}