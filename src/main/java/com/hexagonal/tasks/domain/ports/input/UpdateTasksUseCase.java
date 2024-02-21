package com.hexagonal.tasks.domain.ports.input;

import java.util.Optional;

import com.hexagonal.tasks.domain.models.Task;

public interface UpdateTasksUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}


