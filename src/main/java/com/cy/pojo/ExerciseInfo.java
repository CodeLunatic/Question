package com.cy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 用户的选择答案的实体类，用于做批卷操作
 * 【状态：已测试2018年12月1日09:17:31】
 * By CY
 * Date 2018/11/29 13:55
 */
public class ExerciseInfo implements Serializable {

    @JsonProperty("a")
    private String answer;

    @JsonProperty("q")
    private String questionId;

    @JsonProperty("t")
    private String type;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}