package com.nexTechInnovations.crudOperations.Job;

import java.util.List;

public interface JobServiceMethods {

    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);
    boolean deletedJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
