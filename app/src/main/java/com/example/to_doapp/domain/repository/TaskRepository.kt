package com.example.to_doapp.domain.repository

import com.example.to_doapp.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    suspend fun getTasks(): Flow<List<Task>>

    suspend fun getTaskById(id: Int): Task?

    suspend fun addTask(task: Task)

    suspend fun deleteTask(task: Task)
}
