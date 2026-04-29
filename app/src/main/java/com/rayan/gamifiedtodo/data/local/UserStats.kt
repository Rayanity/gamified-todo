package com.rayan.gamifiedtodo.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_stats")
data class UserStats(
    @PrimaryKey val id: Int = 1,

    val level: Int,

    @ColumnInfo(name = "current_xp")
    val currentXp: Int,

    @ColumnInfo(name = "total_xp")
    val totalXp: Int,

    @ColumnInfo(name = "gold_coins")
    val goldCoins: Int
)
