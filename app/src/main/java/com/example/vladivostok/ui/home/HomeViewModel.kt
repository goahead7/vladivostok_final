package com.example.vladivostok.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "VLADIVOSTOK.App Здесь можно увидеть самые важные места нашего города "
    }
    val text: LiveData<String> = _text

}