package com.hexagonal.tasks.application.usecases;

import java.util.List;
import java.util.Optional;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.RetrieveTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase{
    
    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }

    
}
