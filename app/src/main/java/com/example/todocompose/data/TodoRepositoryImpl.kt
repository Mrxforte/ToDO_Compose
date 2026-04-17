package com.example.todocompose.data

import com.example.todocompose.domain.ToDo
import com.example.todocompose.domain.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl : TodoRepository {
    override var allToDos: Flow<List<ToDo>>
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun addTodo(toDo: ToDo) {
        TODO("Not yet implemented")
    }

    override fun deleteTodo(todoId: Int) {
        TODO("Not yet implemented")
    }

    override fun editTodo(toDo: ToDo) {
        TODO("Not yet implemented")
    }

    override fun getTodo(todoId: Int) {
        TODO("Not yet implemented")
    }

    override fun getAllToDo(): Flow<List<ToDo>> {
        TODO("Not yet implemented")
    }

    override fun searchToDo(query: String): Flow<List<ToDo>> {
        TODO("Not yet implemented")
    }

    override fun switchPinnedStatus(todoId: Int) {
        TODO("Not yet implemented")
    }
}