package model;

import java.util.List;

public class JobModel {
    private String id;

    private String name;

    private String description;

    private String location;

    private List<String> workerIdList;

    private List<String> taskIdList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getWorkerIdList() {
        return workerIdList;
    }

    public void setWorkerIdList(List<String> workerIdList) {
        this.workerIdList = workerIdList;
    }

    public List<String> getTaskIdList() {
        return taskIdList;
    }

    public void setTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
    }
}
