package com.jenu.daggerdemo.viewmodels

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory:ViewModelProvider.Factory@Inject {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel()
    }
}