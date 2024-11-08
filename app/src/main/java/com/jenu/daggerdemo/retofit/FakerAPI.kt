package com.jenu.daggerdemo.retofit

import com.jenu.daggerdemo.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}