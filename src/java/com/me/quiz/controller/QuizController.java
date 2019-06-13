
package com.me.quiz.controller;

import com.neu.quiz.pojo.Question;
import com.neu.quiz.pojo.Quiz;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class QuizController extends AbstractController {
    
    public QuizController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        String answerNumber = request.getParameter("ans")==null? "": request.getParameter("ans");
        String answer;
        String ques;

        Quiz quiz = Quiz.getInstance();
        List<Question> questionsList= quiz.getQuiz();
        
        
        if (uri.endsWith("1.htm")&& !uri.endsWith("11.htm"))
        {
            ques = "1";  
        } else if (uri.endsWith("2.htm"))
        {
            ques = "2";
        }else if (uri.endsWith("3.htm"))
        {
            ques = "3";
        } else if (uri.endsWith("4.htm"))
        {
            ques = "4";
        }else if (uri.endsWith("5.htm"))
        {
            ques = "5";
        }else if (uri.endsWith("6.htm"))
        {
            ques = "6";
        }else if (uri.endsWith("7.htm"))
        {
            ques = "7";
        }else if (uri.endsWith("8.htm"))
        {
            ques = "8";
        }else if (uri.endsWith("9.htm"))
        {
            ques = "9";      
        } else if (uri.endsWith("10.htm"))
        {
            ques = "10";
        } else if (uri.endsWith("11.htm"))
        {
            ques = "answers";
            switch(answerNumber){
                case "1": answer = questionsList.get(10).getQue1();break;
                case "2": answer = questionsList.get(10).getQue2();break;
                case "3": answer = questionsList.get(10).getQue3();break;
                case "4": answer = questionsList.get(10).getQue4();break;
                default : answer = "";break;
            }
            session.setAttribute("answer10", answer);

        }else {
            
            return new ModelAndView("redirect:question/1.htm");
        }
        if (!ques.equals("answers")){
            
            switch(answerNumber){
            case "1": answer = questionsList.get(Integer.parseInt(ques)-1).getQue1();break;
            case "2": answer = questionsList.get(Integer.parseInt(ques)-1).getQue2();break;
            case "3": answer = questionsList.get(Integer.parseInt(ques)-1).getQue3();break;
            case "4": answer = questionsList.get(Integer.parseInt(ques)-1).getQue4();break;
            default : answer = "";break;
        }
            System.out.println(answer);
            request.setAttribute("question", questionsList.get(Integer.parseInt(ques)));
            session.setAttribute("answer" + String.valueOf(Integer.parseInt(ques)-1), answer);
        }
        
        return new ModelAndView("quiz-view", "q", ques);
    }
    
}
