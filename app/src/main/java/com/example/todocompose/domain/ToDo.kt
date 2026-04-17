package com.example.todocompose.domain

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity
data class ToDo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val content: String,
    val updatedAt: Long,
    val isPinned: Boolean


)
