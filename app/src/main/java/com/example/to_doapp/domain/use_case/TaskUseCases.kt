package com.example.to_doapp.domain.use_case

data class TaskUseCases(
    private val addTask: AddTask,
    private val getTask: GetTask,
    private val getTasks: GetTasks,
    private val deleteTask: DeleteTask
)
