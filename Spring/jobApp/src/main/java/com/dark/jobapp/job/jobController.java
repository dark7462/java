package com.dark.jobapp.job;

import com.dark.jobapp.job.implimentations.jobServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobController {
    private final jobService service;

    public jobController(jobServiceImplementation jobService) {
        this.service = jobService;
    }

    // get all jobs
    @GetMapping("/jobs")
    public  ResponseEntity<List<job>> findAll() {
        if(service.findAll() != null){
            return ResponseEntity.ok().body(service.findAll());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

    }

    // insert a job
    @PostMapping("/jobs")
    public ResponseEntity<String> addJob(@RequestBody job job){
        service.createJob(job);
        return new ResponseEntity<>("Job created", HttpStatus.CREATED);
    }

    // find a job by id
    @GetMapping("/jobs/{id}")
    // with the responseEntity I can control my http responses better
    public ResponseEntity<job> getJobById(@PathVariable long id){
        job job = service.getJobById(id);
        if(job != null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable long id){
        if(service.deleteJobById(id)){
            return ResponseEntity.ok("Job deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }
}
