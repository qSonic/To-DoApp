package com.example.to_doapp.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.to_doapp.domain.model.Task

@Database(
    entities = [Task::class],
    version = 1
)

abstract class TaskDatabase : RoomDatabase() {
    abstract val taskDao: TaskDao

    companion object {
        const val DATABASE_NAME = "task_dao"
    }
}
