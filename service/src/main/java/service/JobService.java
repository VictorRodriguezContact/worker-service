package service;

import model.JobModel;

import java.util.List;

public interface JobService {
    List<JobModel> getJob(String id);
}
