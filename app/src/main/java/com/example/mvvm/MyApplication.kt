package com.example.mvvm

import android.app.Application

class MyApplication: Application() {
    fun provideTracksInteractor(): TracksInteractor = TracksInteractorImpl()

}