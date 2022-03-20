package com.example.to_doapp.domain.use_case

import com.example.to_doapp.domain.model.Task
import com.example.to_doapp.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class GetTasks(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(): Flow<List<Task>> = repository.getTasks()
}
