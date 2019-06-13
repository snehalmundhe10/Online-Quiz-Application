
package com.neu.quiz.pojo;


public class Question {
    
    private String que1;
    private String que2;  
    private String que3;
    private String que4;  
    private String question;
    
    public Question(String que1, String que2, String que3, String que4, String question) {
        this.que1 = que1;
        this.que2 = que2;
        this.que3 = que3;
        this.que4 = que4;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getQue1() {
        return que1;
    }

    public String getQue2() {
        return que2;
    }

    public String getQue3() {
        return que3;
    }

    public String getQue4() {
        return que4;
    }
    
}
