package com.dark.quizmicroservice.model;

import lombok.Data;

@Data
public class quizDto {
    private String category;
    private String quizName;
    private Integer numberOfQuestions;
}
