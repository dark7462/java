package service;

import model.question;
import model.questionWapper;
import model.response;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface questionService {
    public List<question> findAll();
    public List<question> findAllQuestionsByCategory(String category);
    public question findQuestionById(int id);
    public question createQuestion(question question);
    public List<Integer> findRandomQuestionsByCategory(String category, int limit);
    public List<questionWapper> fetchAllQuestions(List<Integer> ids);
    Integer getScore(List<response> responses);
}
