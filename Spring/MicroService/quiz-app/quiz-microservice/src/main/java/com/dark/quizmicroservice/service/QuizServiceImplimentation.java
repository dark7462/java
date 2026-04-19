package com.dark.quizmicroservice.service;

import com.dark.quizmicroservice.feign.QuizInterface;
import com.dark.quizmicroservice.model.questionWapper;
import com.dark.quizmicroservice.model.quiz;
import com.dark.quizmicroservice.model.quizDto;
import com.dark.quizmicroservice.model.response;
import com.dark.quizmicroservice.repositoy.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImplimentation implements QuizService{

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    QuizInterface quizInterface;

    @Override
    public ResponseEntity<String> createQuiz(quizDto dto) {
        List<Integer> questions = quizInterface
                .getQuestionsForQuiz(dto.getCategory(), dto.getNumberOfQuestions())
                .getBody();

        if (questions == null || questions.isEmpty()) {
            return new ResponseEntity<>("No questions returned from question service", HttpStatus.BAD_REQUEST);
        }

        quiz newQuiz = new quiz();
        newQuiz.setQuizName(dto.getQuizName());
        newQuiz.setQuestions(questions);
        quizRepository.save(newQuiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<questionWapper>> getQuizQuestions(Integer quizId) {
        quiz storedQuiz = quizRepository.findById(quizId)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + quizId));

        return quizInterface.getQuestionsFromId(storedQuiz.getQuestions());
    }

    @Override
    public ResponseEntity<Integer> calculateResult(Integer quizId, List<response> res) {
        return quizInterface.getScore(res);
    }
}
