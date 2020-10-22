package com.example.hilt_lecture.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.hilt_lecture.data.MyRepository

class MainViewModel  @ViewModelInject constructor(
    private val repo : MyRepository)
    :ViewModel(){

    fun getRepo() = repo.hashCode().toString()
}