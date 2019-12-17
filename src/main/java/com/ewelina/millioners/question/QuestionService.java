package com.ewelina.millioners.question;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
@Getter
@Setter

//@Scope(WebApplicationContext.SCOPE_SESSION)
public class QuestionService {

    private final QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public static int correctAnswerCounter = 0;


    public Question generateQuestion() {

        List<Question> listOfQuestions = questionDao.questions;

        int limit = listOfQuestions.size();

        Random random = new Random();

        return listOfQuestions.get(random.nextInt(limit));
    }


    public boolean checkIfAnswerIsWright(Question q, Character answer) {
        return answer.equals(q.getCorrectAnswer());
    }

}
