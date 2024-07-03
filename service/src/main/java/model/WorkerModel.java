package model;

import java.util.List;

public class WorkerModel {
    private String id;

    private String name;

    private String email;

    private String profile;

    private List<String> jobIdList;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<String> getJobIdList() {
        return jobIdList;
    }

    public void setJobIdList(List<String> jobIdList) {
        this.jobIdList = jobIdList;
    }
}
