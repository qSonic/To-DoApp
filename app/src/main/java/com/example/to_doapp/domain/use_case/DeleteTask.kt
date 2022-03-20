package com.example.to_doapp.domain.use_case

import com.example.to_doapp.domain.model.Task
import com.example.to_doapp.domain.repository.TaskRepository

class DeleteTask(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) = repository.deleteTask(task = task)
}
