package com.example.mvvm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

class TrackViewModel(
    trackId: String,
    tracksInteractor: TracksInteractor
) : ViewModel() {
    init {
        Log.d("TEST", "init!: $trackId")
    }

    companion object {
        fun getViewModelFactory(trackId: String): ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val interactor = (this[APPLICATION_KEY] as MyApplication).provideTracksInteractor()
                TrackViewModel(
                    trackId,
                    interactor
                )
            }
        }

    }
}