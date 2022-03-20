package com.example.to_doapp.data.data_source.local

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.to_doapp.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskDao {

    @Query("SELECT * FROM task")
    suspend fun getTasks(): Flow<List<Task>>

    @Query("SELECT * FROM task WHERE id = :id")
    suspend fun getTaskById(id: Int): Task?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)
}