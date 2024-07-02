package controller;

import model.WorkerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.WorkerService;

import java.util.List;

@RestController
public class WorkerRestController {

    @Autowired
    WorkerService workerService;

    @GetMapping("/worker")
    public List<WorkerModel> getWorkers(@RequestParam(value = "id", defaultValue = "") String id) {
        return workerService.getWorkers(id);
    }
}
