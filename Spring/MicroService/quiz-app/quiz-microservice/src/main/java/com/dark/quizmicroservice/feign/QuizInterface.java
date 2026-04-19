package com.dark.quizmicroservice.feign;

import com.dark.quizmicroservice.model.questionWapper;
import com.dark.quizmicroservice.model.response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("question-microservice")
public interface QuizInterface {
    @GetMapping("api/question/questions")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz
            (@RequestParam("category") String category, @RequestParam("limit") Integer limit);

    @PostMapping("api/question/questions")
    public ResponseEntity<List<questionWapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

    @PostMapping("api/question/score")
    public ResponseEntity<Integer> getScore(@RequestBody List<response> responses);

}