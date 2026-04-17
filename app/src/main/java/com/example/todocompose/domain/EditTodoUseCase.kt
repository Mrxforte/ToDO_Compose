package com.example.todocompose.domain

class EditTodoUseCase(
    private val repository: TodoRepository
) {
    operator fun invoke(toDo: ToDo) {
        repository.editTodo(toDo)
    }
}