package com.example.aiplanner.domain.usecases.app_entry

import com.example.aiplanner.domain.repository.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
){
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}