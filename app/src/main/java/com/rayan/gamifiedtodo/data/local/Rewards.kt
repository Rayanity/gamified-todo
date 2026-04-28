package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Rewards(
    // TODO: Ajouter des noms de colonnes plus parlant pour la BDD
    @PrimaryKey val id: Int,

    val title: String,
    val description: String,
    val price: Int
)
