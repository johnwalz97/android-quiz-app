package com.johnwwalz.androidquiz;

/**
 * Created by john on 1/15/2016.
 */
public class Question {
    private String question;
    private boolean isAndroid;
    public Question(String question, boolean isAndroid) {
        this.question = question;
        this.isAndroid = isAndroid;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public boolean isAndroid() {
        return isAndroid;
    }
    public void setIsAndroid(boolean isAndroid) {
        this.isAndroid = isAndroid;
    }
}