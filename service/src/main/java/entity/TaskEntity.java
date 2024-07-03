package entity;

import java.util.List;

public class TaskEntity {
    private String name;
    private String description;
    private boolean done;
    private List<String> jobIdList;
    private List<String> workerIdList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public List<String> getJobIdList() {
        return jobIdList;
    }

    public void setJobIdList(List<String> jobIdList) {
        this.jobIdList = jobIdList;
    }

    public List<String> getWorkerIdList() {
        return workerIdList;
    }

    public void setWorkerIdList(List<String> workerIdList) {
        this.workerIdList = workerIdList;
    }
}
