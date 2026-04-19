package service;

import model.question;
import model.questionWapper;
import model.response;
import repo.questionRepo;

import java.util.ArrayList;
import java.util.List;

public class questionServiceImplimentation implements questionService {

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
            questionWappers.add(new questionWapper(findQuestionById(id)));
        }
        return questionWappers;
    }

    @Override
    public Integer getScore(List<response> responses) {
        Integer score = 0;
        for (response response : responses) {
            if(response.getResponse().equals(repo.findById(response.getId()).get().getAnswer())){
                score++;
            }
        }
        return score;
    }
}
