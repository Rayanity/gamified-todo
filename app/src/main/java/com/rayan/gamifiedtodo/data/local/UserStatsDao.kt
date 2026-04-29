package com.rayan.gamifiedtodo.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserStatsDao {
    // On récupère toujours le profil unique (id = 1)
    @Query("SELECT * FROM user_stats WHERE id = 1")
    fun getUserStats(): Flow<UserStats?> // Peut être null au tout premier lancement de l'app

    // Pour initialiser le profil au premier lancement
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserStats(stats: UserStats)

    // Pour mettre à jour l'XP, le niveau et l'or
    @Update
    suspend fun updateUserStats(stats: UserStats)
}