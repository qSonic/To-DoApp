package com.example.to_doapp.domain.use_case

import com.example.to_doapp.domain.model.Task
import com.example.to_doapp.domain.repository.TaskRepository

class GetTask(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(id: Int): Task? = repository.getTaskById(id = id)
}
