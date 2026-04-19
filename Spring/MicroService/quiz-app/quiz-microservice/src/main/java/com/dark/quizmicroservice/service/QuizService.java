package com.dark.quizmicroservice.service;

import com.dark.quizmicroservice.model.questionWapper;
import com.dark.quizmicroservice.model.quizDto;
import com.dark.quizmicroservice.model.response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizService{
    ResponseEntity<String> createQuiz(quizDto dto);
    ResponseEntity<List<questionWapper>> getQuizQuestions(Integer quizId);
    ResponseEntity<Integer> calculateResult(Integer quizId, List<response> res);
}
