package controller;

import model.WorkerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.JobService;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    JobService jobService;

    @GetMapping("/job")
    public List<WorkerModel> getJobs(@RequestParam(value = "id", defaultValue = "") String id) {
        return jobService.getJobs(id);
    }
}
