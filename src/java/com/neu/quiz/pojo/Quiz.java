
package com.neu.quiz.pojo;

import java.util.ArrayList;
import java.util.List;


public class Quiz {
    
    private static Quiz single_instance = null;
    
    private List<Question> quiz;
    private Question ques0;
    private Question ques1;
    private Question ques2;
    private Question ques3;
    private Question ques4;
    private Question ques5;
    private Question ques6;
    private Question ques7;
    private Question ques8;
    private Question ques9;
    private Question ques10;
    
    public Quiz() {
        this.quiz = new ArrayList<Question>();

        this.ques0 = new Question("","","","","");
        this.ques1 = new Question("service", "init", "doGet", "doPost","Which lifecycle method make ready the servlet for garbage collection?");
        this.ques2 = new Question("service", "init", "doGet", "doPost","Which method does not exist in HttpServlet Class?");
        this.ques3 = new Question("servlet", "servlet-mapping", "web-app", "servlet-mappings","Which tag of DD maps internal name of servlet to public URL pattern?");
        this.ques4 = new Question("servlet", "servlet-mapping", "web-app", "servlet-mappings","Which method is called when client request comes?");
        this.ques5 = new Question("session", "request", "response", "application","Which of the following JSP variables are not available within a JSP expression? ");
        this.ques6 = new Question("servlet", "servlet-mapping", "web-app", "servlet-mappings","Which interface contain servlet lifecycle methods? ");
        this.ques7 = new Question("servlet", "servlet-mapping", "web-app", "servlet-mappings","Which lifecycle method is called once in servlet lifecycle? ");
        this.ques8 = new Question("include", "scope", "error-page", "debug","Which of these are legal attributes of page directive? ");
        this.ques9 = new Question("java.util.Date", "java.sql.Date", "int", "long","Whichis the return type of getLastModified of HttpServelt? ");
        this.ques10 = new Question("a", "b", "c", "d","What is the signature method jspInit of jspPage ");
        
        quiz.add(ques0);
        quiz.add(ques1);
        quiz.add(ques2);
        quiz.add(ques3);
        quiz.add(ques4);
        quiz.add(ques5);
        quiz.add(ques6);
        quiz.add(ques7);
        quiz.add(ques8);
        quiz.add(ques9);
        quiz.add(ques10);
    }

    public static Quiz getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Quiz(); 
  
        return single_instance; 
    } 
    
    public List<Question> getQuiz() {
        return quiz;
    }    
}
