package com.rayan.gamifiedtodo.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SubTasks(
    // TODO: Ajouter des noms de colonnes plus parlant pour la BDD
    @PrimaryKey val id: Int,

    //TODO: Deviendra une references vers la table tasks
    val taskId: Int,

    val title: String,
    val isCompleted: Boolean
)
