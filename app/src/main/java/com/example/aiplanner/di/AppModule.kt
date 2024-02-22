package com.example.aiplanner.di

import android.app.Application
import com.example.aiplanner.data.manager.LocalUserManagerImpl
import com.example.aiplanner.domain.manager.LocalUserManager
import com.example.aiplanner.domain.usecases.app_entry.AppEntryUseCases
import com.example.aiplanner.domain.usecases.app_entry.ReadAppEntry
import com.example.aiplanner.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesLocalUserManager(
        application: Application
    ): LocalUserManager {
        return LocalUserManagerImpl(context = application)
    }

    @Provides
    @Singleton
    fun providesAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}