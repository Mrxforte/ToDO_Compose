package com.example.todocompose.domain

class SwitchPinnedStatusUseCase(
    private val repository: TodoRepository
) {
    operator fun invoke(todoId: Int) {

        repository.switchPinnedStatus(todoId)
    }
}