package com.ewelina.millioners.question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Question {
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private Character correctAnswer;
    
    //TODO: implement equals and hashcode

}
