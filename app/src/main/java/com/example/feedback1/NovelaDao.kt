package com.example.feedback1

import androidx.room.*

@Dao
interface NovelaDao {
    @Query("SELECT * FROM Novela")
    fun getAllNovelas(): List<Novela>

    @Insert
    suspend fun agregar(novela: Novela)

    @Delete
    suspend fun eliminar(novela: Novela)
}