package com.rayan.gamifiedtodo.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "sub_tasks",
    foreignKeys = [
        ForeignKey(
            entity = Tasks::class,
            parentColumns = ["id"],
            childColumns = ["task_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class SubTasks(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    @ColumnInfo(name = "task_id")
    val taskId: Int,

    val title: String,

    @ColumnInfo(name = "is_completed")
    val isCompleted: Boolean = false
)
