package com.dark.jobapp.job.implimentations;

import com.dark.jobapp.job.job;
import com.dark.jobapp.job.jobRepository;
import com.dark.jobapp.job.jobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobServiceImplementation implements jobService {
    jobRepository jobRepository;
    public jobServiceImplementation(jobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<job> findAll(){
        return jobRepository.findAll();
    }

    @Override
    public void createJob(job job){
        jobRepository.save(job);
        System.out.println("Job created successfully");
    }

    @Override
    public job getJobById(long id){
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteJobById(long id){
        try{
            jobRepository.deleteById(id);
            System.out.println("Job deleted successfully");
            return true;
        }catch (Exception e){
            System.out.println("Job delete failed");
            return false;
        }
    }

}
