package com.hexagonal.tasks.application.usecases;

import java.util.Optional;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.UpdateTasksUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class UpdateTaskUseCaseImpl implements UpdateTasksUseCase{

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
