package service;

import model.WorkerModel;

import java.util.List;

public interface JobService {
    List<WorkerModel> getJobs(String id);
}
