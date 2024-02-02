//package net.javaguides.task.mapper;
//
//import net.javaguides.task.dto.TaskDto;
//import net.javaguides.task.entity.Task;
//
//import java.util.Date;
//
//public class TaskMapper {
//    public static TaskDto mapToTaskDto(Task task){
//        return new TaskDto(
//                task.getId(),
//                task.getTitle(),
//                task.getDescription(),
//                task.getDueDate(),
//                task.getStatus()
//
//        );
//    }
//
//    public static Task mapToTask(TaskDto taskDto){
//        return new Task(
//                taskDto.getId(),
//                taskDto.getTitle(),
//                taskDto.getDescription(),
//                taskDto.getDueDate(),
//                taskDto.getStatus()
//        );
//    }
//}
