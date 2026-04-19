package com.dark.questionmicroservice.service;

import com.dark.questionmicroservice.model.question;
import com.dark.questionmicroservice.model.questionWapper;
import com.dark.questionmicroservice.model.response;
import com.dark.questionmicroservice.repo.questionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class questionServiceImplimentation implements questionService {

    @Autowired
    private questionRepo repo;

    @Override
    public List<question> findAll() {
        return repo.findAll();
    }

    @Override
    public List<question> findAllQuestionsByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public question findQuestionById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public question createQuestion(question question) {
        return repo.save(question);
    }
    
    @Override
    public List<Integer> findRandomQuestionsByCategory(String category, int limit){
        return repo.findRandomQuestionsByCategory(category,limit);
    }
    
    @Override
    public List<questionWapper> fetchAllQuestions(List<Integer> ids){
        List<questionWapper> questionWappers = new ArrayList<>();

        for(Integer id : ids){
            question question = repo.findById(id).orElse(null);
            if(question == null) continue;
            questionWappers.add(new questionWapper(question));
        }
        return questionWappers;
    }

    @Override
    public Integer getScore(List<response> responses) {
        Integer score = 0;
        for (response response : responses) {
            question question = repo.findById(response.getId()).orElse(null);
            if(question == null) continue;
            if(response.getResponse().equals(question.getAnswer())){
                score++;
            }
        }
        return score;
    }
}
