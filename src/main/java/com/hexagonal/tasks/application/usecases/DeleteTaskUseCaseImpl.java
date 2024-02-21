package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.ports.input.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase{
    
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long Id) {
        return taskRepositoryPort.deleteById(Id);
    }

    
}
