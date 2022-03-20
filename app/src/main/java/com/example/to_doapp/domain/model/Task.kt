package com.example.to_doapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    val title: String,
    val content: String,
    val date: Long,
    @PrimaryKey val id: Int? = null
)
