package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categories(
    // TODO: Ajouter des noms de colonnes plus parlant pour la BDD
    @PrimaryKey val id: Int,

    val name: String,
    val icon_name: String,
    val color_hex: String
)
