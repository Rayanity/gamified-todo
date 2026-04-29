package com.rayan.gamifiedtodo.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoriesDao {
    @Query("SELECT * FROM categories")
    fun getAllCategories(): Flow<List<Categories>>

    @Query("SELECT * FROM categories WHERE id = :categoryId")
    fun getCategoryById(categoryId: Int): Flow<Categories>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Categories)

    @Update
    suspend fun updateCategory(category: Categories)

    @Delete
    suspend fun deleteCategory(category: Categories)
}