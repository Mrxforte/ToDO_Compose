import com.example.todocompose.domain.TodoRepository

class DeleteTodoUseCase(
    private val repository: TodoRepository
) {
    operator fun invoke(toDoId: Int) {
        repository.deleteTodo(toDoId)
    }
}