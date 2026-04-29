package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rewards")
data class Rewards(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    val title: String,
    val description: String,
    val price: Int
)
