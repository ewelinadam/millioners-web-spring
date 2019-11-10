package com.ewelina.millioners.controller;

import com.ewelina.millioners.question.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/question")
public class ShowQuestionController {

    private final QuestionService questionService;

    public ShowQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    ModelAndView showQuestion (){
        ModelAndView mnv = new ModelAndView("questionView");
        mnv.addObject("question", questionService.getQuestion());
        return mnv;
    }

}
