package com.ewelina.millioners.question;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Repository
@Getter
@Setter
@NoArgsConstructor
public class QuestionDao {

    private final String PATH = "D:\\kurs_java\\projects\\millioners\\src\\main\\resources\\static\\question.txt";

    public final List<Question> questions = createListOfQuestionObjects();

    //TODO: Write some tests!!


    //reads data from txt file and
    private List<String> listFromTxt() throws IOException {
        List<String> list = new ArrayList<>();

        FileReader file = new FileReader(PATH);
        BufferedReader read = new BufferedReader(file);
        String line = read.readLine();
        while (line != null) {
            list.add(line);
            line = read.readLine();
        }
        return list;
    }

    //creates List of Question Objects
   List<Question> createListOfQuestionObjects() {
        List<Question> questionList = new ArrayList<>();

        List<String> lines = null;
        try {
            lines = listFromTxt();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert lines != null;
        for (int i = 0; i < lines.size(); i += 6) {
            String question = lines.get(i);
            String answerA = lines.get(i + 1);
            String answerB = lines.get(i + 2);
            String answerC = lines.get(i + 3);
            String answerD = lines.get(i + 4);
            Character correctAnswer = lines.get(i + 5).charAt(0);

            Question q = new Question(question, answerA, answerB, answerC, answerD, correctAnswer);

            questionList.add(q);
        }
        return questionList;
    }

    }
