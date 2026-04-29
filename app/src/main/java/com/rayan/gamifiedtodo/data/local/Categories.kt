package com.rayan.gamifiedtodo.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class Categories(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    val name: String,

    @ColumnInfo(name = "icon_name")
    val iconName: String,

    @ColumnInfo(name = "color_hex")
    val colorHex: String
)
