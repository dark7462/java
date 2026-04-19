package com.dark.questionmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class questionWapper {
    private Integer questionId;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public questionWapper(question question) {
        this.questionId = question.getQuestionId();
        this.questionTitle = question.getQuestionTitle();
        this.option1 = question.getOption1();
        this.option2 = question.getOption2();
        this.option3 = question.getOption3();
        this.option4 = question.getOption4();
    }
}
