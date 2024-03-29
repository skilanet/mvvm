package com.example.mvvm

object Creator {
    fun provideTracksInteractor(): TracksInteractor = TracksInteractorImpl()
}