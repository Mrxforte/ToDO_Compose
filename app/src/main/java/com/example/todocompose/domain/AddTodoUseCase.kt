package com.example.todocompose.domain

class AddTodoUseCase(
    private val repository: TodoRepository
) {

    operator fun invoke(toDo: ToDo) {
        repository.addTodo(toDo)
    }
}