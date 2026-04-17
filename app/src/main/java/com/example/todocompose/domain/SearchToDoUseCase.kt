package com.example.todocompose.domain

import kotlinx.coroutines.flow.Flow

class SearchToDoUseCase(
    private val repository: TodoRepository
) {

    operator fun invoke(query: String): Flow<List<ToDo>> {
        return repository.searchToDo(query)
    }
}