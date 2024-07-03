package controller;

import model.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.TaskService;

import java.util.List;

@RestController
public class TaskRestController {

    @Autowired
    TaskService taskService;

    @GetMapping("/task")
    public List<TaskModel> getTask(@RequestParam(value = "id", defaultValue = "") String id) {
        return taskService.getTask(id);
    }
}
