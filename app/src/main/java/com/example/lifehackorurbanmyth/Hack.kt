package com.example.lifehackorurbanmyth

import androidx.annotation.StringRes

data class Hack (
    @param:StringRes val statement: Int,
    val isTrue: Boolean,
    @param:StringRes val explanation: Int
)
