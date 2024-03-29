package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope

class TrackActivity : ComponentActivity() {
    private val viewModel by lazy {
        ViewModelProvider(this, TrackViewModel.getViewModelFactory("123"))[TrackViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track)
        viewModel.viewModelScope
    }
}