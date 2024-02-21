package com.hexagonal.tasks.application.services;

import java.util.List;
import java.util.Optional;


import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.CreateTaskUseCase;
import com.hexagonal.tasks.domain.ports.input.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.hexagonal.tasks.domain.ports.input.RetrieveTaskUseCase;
import com.hexagonal.tasks.domain.ports.input.UpdateTasksUseCase;

public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTasksUseCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTasksUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase,
            UpdateTasksUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase,
            GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
    }

    @Override
    public boolean deleteTask(Long Id) {
        return deleteTaskUseCase.deleteTask(Id);
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }
    
}
