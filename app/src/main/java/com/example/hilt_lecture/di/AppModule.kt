package com.example.hilt_lecture.di

import com.example.hilt_lecture.di.qualifier.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @AppHash
    @Provides
    fun provideHash() = hashCode().toString()
}