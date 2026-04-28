package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserStats(
    // TODO: Ajouter des noms de colonnes plus parlant pour la BDD

    @PrimaryKey val id: Int,

    val level: Int,
    val currentXp: Int,
    val totalXp: Int,
    val goldCoins: Int
)
