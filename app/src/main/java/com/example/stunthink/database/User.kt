package com.example.stunthink.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    var uid: Long,
    var fullName: String,
)