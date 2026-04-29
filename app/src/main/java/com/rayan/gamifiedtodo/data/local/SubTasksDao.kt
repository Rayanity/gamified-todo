package com.rayan.gamifiedtodo.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SubTasksDao {
    // On récupère uniquement les sous-tâches liées à la tâche cliquée
    @Query("SELECT * FROM sub_tasks WHERE task_id = :taskId")
    fun getSubTasksForTask(taskId: Int): Flow<List<SubTasks>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubTask(subTask: SubTasks)

    @Update
    suspend fun updateSubTask(subTask: SubTasks)

    @Delete
    suspend fun deleteSubTask(subTask: SubTasks)
}