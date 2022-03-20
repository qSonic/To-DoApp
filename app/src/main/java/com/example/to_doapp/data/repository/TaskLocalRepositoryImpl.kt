package com.example.to_doapp.data.repository

import com.example.to_doapp.data.data_source.local.TaskDao
import com.example.to_doapp.domain.model.Task
import com.example.to_doapp.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class TaskLocalRepositoryImpl(
    private val dao: TaskDao
) : TaskRepository {
    override suspend fun getTasks(): Flow<List<Task>> = dao.getTasks()

    override suspend fun getTaskById(id: Int): Task? = dao.getTaskById(id = id)

    override suspend fun addTask(task: Task) = dao.addTask(task = task)

    override suspend fun deleteTask(task: Task) = dao.deleteTask(task = task)
}
