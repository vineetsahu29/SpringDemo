package com.nexTechInnovations.crudOperations.Company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nexTechInnovations.crudOperations.Job.Job;
import com.nexTechInnovations.crudOperations.review.Review;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String Description;

   @JsonIgnore
   @OneToMany(mappedBy = "company")
   private List<Job> jobs;

   @JsonIgnore
   @OneToMany(mappedBy = "company")
   private List<Review> reviews;

    public Company() {
    }


    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
