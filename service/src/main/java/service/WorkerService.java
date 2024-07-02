package service;

import model.WorkerModel;

import java.util.List;

public interface WorkerService {
    List<WorkerModel> getWorkers(String id);
}
