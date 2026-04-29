package com.rayan.gamifiedtodo.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface RewardsDao {
    @Query("SELECT * FROM rewards")
    fun getAllRewards(): Flow<List<Rewards>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReward(reward: Rewards)

    @Update
    suspend fun updateReward(reward: Rewards)

    @Delete
    suspend fun deleteReward(reward: Rewards)
}