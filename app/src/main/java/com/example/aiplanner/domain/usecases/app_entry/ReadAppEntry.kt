package com.example.aiplanner.domain.usecases.app_entry

import com.example.aiplanner.domain.repository.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke() : Flow<Boolean>{
        return localUserManager.readAppEntry()
    }
}