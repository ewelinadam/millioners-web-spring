package com.ewelina.millioners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/wrong-answer")
public class WrongAnswerController {
    @RequestMapping
    ModelAndView getWrongAnswerPage(){
        ModelAndView mnv = new ModelAndView("wrongAnswerPage");
        return mnv;
    }
}
