package com.dark.jobapp.job;

import java.util.List;

public interface jobService {
    List<job> findAll();
    void createJob(job job);
    job getJobById(long id);
    Boolean deleteJobById(long id);
}
