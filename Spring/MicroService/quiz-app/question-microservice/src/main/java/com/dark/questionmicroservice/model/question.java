package com.dark.questionmicroservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer questionId;
    private String questionTitle;
    private String answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String category;
    private String difficultyLevel;
}
