package com.dark.questionmicroservice.controller;

import com.dark.questionmicroservice.model.question;
import com.dark.questionmicroservice.model.questionWapper;
import com.dark.questionmicroservice.model.response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dark.questionmicroservice.service.questionService;

import java.util.List;

@RestController
@RequestMapping("api/question")
public class questionController {

    @Autowired
    private questionService questionService;

    @GetMapping("/all")
    public ResponseEntity<List<question>> getAllQuestions() {
        return new ResponseEntity<>(questionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<question> findQuestionById(@PathVariable int id) {
        return new ResponseEntity<>(questionService.findQuestionById(id), HttpStatus.OK);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<question>> getAllQuestionsByCategory(@PathVariable String category) {
        return new ResponseEntity<>(questionService.findAllQuestionsByCategory(category), HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<question> addQuestion(@RequestBody question question) {
        return new ResponseEntity<>(questionService.createQuestion(question), HttpStatus.CREATED);
    }

    //list of questions
    @GetMapping("/questions")
    public ResponseEntity<List<Integer>> getQuizQuestions(@RequestParam String category, @RequestParam Integer limit) {
        return new ResponseEntity<>(questionService.findRandomQuestionsByCategory(category,limit), HttpStatus.OK);
    }
    // list fo questionnaires
    @PostMapping("/questions")
    public ResponseEntity<List<questionWapper>> createQuestion(@RequestBody List<Integer> ids) {
        return new ResponseEntity<>(questionService.fetchAllQuestions(ids) , HttpStatus.OK);
    }
    //score
    @PostMapping("/score")
    public ResponseEntity<Integer> getResponseScore(@RequestBody List<response> responses) {
        return new ResponseEntity<>(questionService.getScore(responses), HttpStatus.OK);
    }
}
