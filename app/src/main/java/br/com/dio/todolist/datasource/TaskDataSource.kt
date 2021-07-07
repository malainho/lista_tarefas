package br.com.dio.todolist.datasource

import br.com.dio.todolist.model.Task

object TaskDataSource {

    private var list = arrayListOf<Task>()

    fun getList() = list.toList()

    fun insertTask(task: Task) {
        if (task.id.toInt() == 0) {
            list.add(task.copy(id = (list.size + 1).toLong()))
        } else {
            list.remove(task)
            list.add(task)
        }
    }

    fun findById(taskId: Long) = list.find { it.id == taskId }

    fun deleteTask(task: Task) {
        list.remove(task)
    }
}