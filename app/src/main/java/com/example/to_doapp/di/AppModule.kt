package com.example.to_doapp.di

import android.app.Application
import androidx.room.Room
import com.example.to_doapp.data.data_source.local.TaskDatabase
import com.example.to_doapp.data.repository.TaskLocalRepositoryImpl
import com.example.to_doapp.domain.repository.TaskRepository
import com.example.to_doapp.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            TaskDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskRepository(db: TaskDatabase): TaskRepository {
        return TaskLocalRepositoryImpl(dao = db.taskDao)
    }

    @Provides
    @Singleton
    fun provideTaskUseCases(repository: TaskRepository): TaskUseCases {
        return TaskUseCases(
            addTask = AddTask(repository = repository),
            getTask = GetTask(repository = repository),
            getTasks = GetTasks(repository = repository),
            deleteTask = DeleteTask(repository = repository)
        )
    }
}
