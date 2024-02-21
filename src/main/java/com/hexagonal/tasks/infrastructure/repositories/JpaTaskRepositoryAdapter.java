package com.hexagonal.tasks.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;
import com.hexagonal.tasks.infrastructure.entities.TaskEntity;

@Component
public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

    private final JpaTaskRepository jpaTaskRepository;
    
    public JpaTaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
        TaskEntity savedTaskEntity = jpaTaskRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

 @Override
    public Optional<Task> findById(Long id) {
        return jpaTaskRepository.findById(id).map(TaskEntity::toDomainModel);
    }

    @Override
    public List<Task> findAll() {
        return jpaTaskRepository.findAll().stream()
        .map(TaskEntity::toDomainModel)
        .collect(Collectors.toList());
    }

    @Override
    public Optional<Task> update(Task task) {
        if (jpaTaskRepository.existsById(task.getId())) {
            TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
            TaskEntity updateTaskEntity = jpaTaskRepository.save(taskEntity);
            return Optional.of(updateTaskEntity.toDomainModel()); 
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaTaskRepository.existsById(id)) {
            jpaTaskRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
