package com.example.todocompose.domain

import kotlinx.coroutines.flow.Flow



class GetAllToDoUseCase(
    private val repository: TodoRepository
) {

    operator fun invoke(): Flow<List<ToDo>> {
        return repository.getAllToDo()
    }
}
