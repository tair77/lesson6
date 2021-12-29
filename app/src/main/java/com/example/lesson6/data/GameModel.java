package com.example.lesson6.data;

import java.io.Serializable;

public class GameModel implements Serializable {
    private  String level;
    private  String quiz;
    private  String answerOne;
    private  String answerTwo;
    private  String answerTree;
    private  String answerFour;


    public GameModel(String level, String quiz, String answerOne, String answerTwo, String answerTree, String answerFour ) {
        this.level = level;
        this.quiz = quiz;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerTree = answerTree;
        this.answerFour = answerFour;

    }

    public String getLevel() {
        return level;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerTree() {
        return answerTree;
    }

    public String getAnswerFour() {
        return answerFour;
    }
}
