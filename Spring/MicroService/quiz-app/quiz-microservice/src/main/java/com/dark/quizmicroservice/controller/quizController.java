package com.dark.quizmicroservice.controller;
import com.dark.quizmicroservice.model.questionWapper;
import com.dark.quizmicroservice.model.quizDto;
import com.dark.quizmicroservice.model.response;
import com.dark.quizmicroservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/quiz")
public class quizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody quizDto quizDto){
        return quizService.createQuiz(quizDto);
    }

    @PostMapping("get/{id}")
    public ResponseEntity<List<questionWapper>> getQuizQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<response> responses){
        return quizService.calculateResult(id, responses);
    }
}