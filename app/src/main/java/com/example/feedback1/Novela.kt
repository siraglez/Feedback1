package com.example.feedback1

import androidx.room.*

@Entity
data class Novela(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val titulo: String,
    val autor: String,
    val anio: Int,
    val sinopsis: String,
    val esFavorita: Boolean = false
)
