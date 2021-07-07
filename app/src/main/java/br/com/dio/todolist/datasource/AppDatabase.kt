package br.com.dio.todolist.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.dio.todolist.model.Task

@Database(entities = arrayOf(Task::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}