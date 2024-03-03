package com.example.aiplanner.domain.repository

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun saveAppEntry()
    fun readAppEntry() : Flow<Boolean>
}