package br.com.dio.todolist.datasource

import androidx.room.*
import br.com.dio.todolist.model.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getTasks(): List<Task>

    @Query("SELECT * FROM task WHERE id IN (:id)")
    fun getTaskPorId(id: Long): Task

    @Insert
    fun inserir(vararg task: Task)

    @Update
    fun alterar(vararg task : Task)

    @Delete
    fun apagar(task: Task)

    @Query("SELECT max(id) FROM task")
    fun getMaxTask(): Long

}