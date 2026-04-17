package com.example.todocompose.domain

class GetTodoUseCase(
    private val repository: TodoRepository
) {
    operator fun invoke(todoId: Int) {
        return repository.getTodo(todoId)
    }
}