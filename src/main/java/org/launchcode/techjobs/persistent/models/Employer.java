package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location required.")
    @Size(max = 50, message = "This location is too long. Try a shorter term.")
    private String location;

    @JoinColumn(name="employer_id")
    @OneToMany
    private List<Job> jobs = new ArrayList<>();

    public Employer(String location){
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }


}
