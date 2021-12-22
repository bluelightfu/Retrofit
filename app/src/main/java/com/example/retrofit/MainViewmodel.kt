package com.example.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.retrofit.Model.Post
import com.example.retrofit.Repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse :MutableLiveData<Response<Post>> = MutableLiveData()
    fun getPost(){
            viewModelScope.launch {
                val response = repository.getPost()
                myResponse.value = response
            }
    }
}

class MainViewModelFactory(private val repository: Repository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}