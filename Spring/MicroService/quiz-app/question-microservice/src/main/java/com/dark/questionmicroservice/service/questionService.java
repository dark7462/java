package com.dark.questionmicroservice.service;

import com.dark.questionmicroservice.model.question;
import com.dark.questionmicroservice.model.questionWapper;
import com.dark.questionmicroservice.model.response;

import java.util.List;

public interface questionService {
    public List<question> findAll();
    public List<question> findAllQuestionsByCategory(String category);
    public question findQuestionById(int id);
    public question createQuestion(question question);
    public List<Integer> findRandomQuestionsByCategory(String category, int limit);
    public List<questionWapper> fetchAllQuestions(List<Integer> ids);
    Integer getScore(List<response> responses);
}
