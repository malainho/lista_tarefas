package br.com.dio.todolist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    var title: String,
    var hour: String,
    var date: String,
    @PrimaryKey var id: Long = 0L
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Task

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.toInt()
    }
}