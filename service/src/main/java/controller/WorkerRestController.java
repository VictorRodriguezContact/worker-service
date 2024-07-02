package controller;

import model.WorkerModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerRestController {

    @GetMapping("/worker")
    public List<WorkerModel> getWorkers(@RequestParam(value = "id", defaultValue = "") String id) {
        return null;
    }
}
