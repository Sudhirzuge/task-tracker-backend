package net.javaguides.task.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.task.dto.TaskDto;
import net.javaguides.task.entity.Task;
import net.javaguides.task.mapper.TaskMapper;
import net.javaguides.task.repository.TaskRepository;
import net.javaguides.task.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        Task task = TaskMapper.mapToTask(taskDto);
        Task savedTask = taskRepository.save(task);
        return TaskMapper.mapToTaskDto(savedTask);
    }

    @Override
    public TaskDto getTaskById(Long taskId) {
        return null;
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return null;
    }

    @Override
    public TaskDto updateTask(Long taskId, TaskDto updateTask) {
        return null;
    }

    @Override
    public void deleteTask(Long taskId) {

    }
}


