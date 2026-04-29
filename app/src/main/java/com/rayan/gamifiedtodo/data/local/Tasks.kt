package com.rayan.gamifiedtodo.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "tasks",
    foreignKeys = [
        ForeignKey(
            entity = Categories::class,
            parentColumns = ["id"],
            childColumns = ["category_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class Tasks(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    @ColumnInfo(name = "category_id")
    val categoryId: Int?,

    val title: String,
    val description: String,

    //TODO: Créer l'enum (facile, moyen, difficile)
    val difficulty: Int,

    val deadline: Long?,

    @ColumnInfo(name = "is_completed")
    val isCompleted: Boolean = false,

    @ColumnInfo(name = "is_recurring")
    val isRecurring: Boolean,

    //Daily, Weekly ou None
    @ColumnInfo(name = "recurrence_type")
    val recurrenceType: String,
)
