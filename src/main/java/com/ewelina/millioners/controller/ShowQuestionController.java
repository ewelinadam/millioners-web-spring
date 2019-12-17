package com.ewelina.millioners.controller;

import com.ewelina.millioners.question.Question;
import com.ewelina.millioners.question.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@Controller
@RequestMapping("/question")
public class ShowQuestionController {

    private final QuestionService questionService;

    public ShowQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @RequestMapping
    ModelAndView showQuestion() {

        ModelAndView mnv = new ModelAndView("viewQuestion");
        mnv.addObject("question", questionService.generateQuestion());

        return mnv;
    }

    @PostMapping
    String takeAnswerFromPlayer(HttpServletRequest request) {
        String answer = request.getParameter("answerFromPlayer");
        return "redirect:wrong-answer";
    }
}
