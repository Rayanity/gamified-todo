package com.rayan.gamifiedtodo.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TasksDao {
    // Récupère toutes les tâches. Le "Flow" permet de mettre à jour l'UI en temps réel.
    @Query("SELECT * FROM tasks")
    fun getAllTasks(): Flow<List<Tasks>>

    @Query("SELECT * FROM tasks WHERE id = :taskId")
    fun getTaskById(taskId: Int): Flow<Tasks>

    // On utilise "suspend" pour que ces requêtes s'exécutent en arrière-plan.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(vararg tasks: Tasks)

    @Update
    suspend fun updateTask(vararg tasks: Tasks)

    @Delete
    suspend fun deleteTask(vararg tasks: Tasks)
}