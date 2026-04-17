package com.example.todocompose.domain

import kotlinx.coroutines.flow.Flow

class SearchToDoUseCase {

    operator fun invoke(query: String): Flow<List<ToDo>> {
        TODO()
    }
}