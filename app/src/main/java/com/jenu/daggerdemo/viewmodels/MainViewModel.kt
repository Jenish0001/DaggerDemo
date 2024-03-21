package com.jenu.daggerdemo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jenu.daggerdemo.model.Product
import com.jenu.daggerdemo.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository): ViewModel() {

    val productRepository :LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch{
            repository.getProduct()
        }
    }
}