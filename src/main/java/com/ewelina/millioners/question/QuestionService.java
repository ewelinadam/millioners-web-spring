package com.ewelina.millioners.question;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class QuestionService {

    private final QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question getQuestion (){
        return questionDao.generateQuestionSet().iterator().next();
    }

    public boolean checkIfAnswerIsWright(Question q, Character answer){
            return answer.equals(q.getCorrectAnswer());
    }
}
