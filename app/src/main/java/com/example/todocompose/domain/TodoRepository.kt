package com.example.todocompose.domain

import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    var allToDos: Flow<List<ToDo>>

    fun addTodo(toDo: ToDo)
    fun deleteTodo(todoId: Int)
    fun editTodo(toDo: ToDo)
    fun getTodo(todoId: Int)
    fun getAllToDo(): Flow<List<ToDo>>
    fun searchToDo(query: String): Flow<List<ToDo>>
    fun switchPinnedStatus(todoId: Int)
}