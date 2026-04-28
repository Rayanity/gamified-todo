package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tasks(
    // TODO: Ajouter des noms de colonnes plus parlant pour la BDD
    @PrimaryKey val id: Int,

    //TODO: Transformer en clé étrangère
    val catagoryId: Int,

    val title: String,
    val description: String,

    //TODO: Créer l'enum (facile, moyen, difficile)
    val difficulty: Int,

    val deadline: Long,
    val isCompleted: Boolean,
    val isRecurring: Boolean,

    //Daily, Weekly ou None
    val recurrenceType: String,
)
