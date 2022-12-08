package com.skypro.kursovaya3springexamapp.Service;

import com.skypro.kursovaya3springexamapp.Model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Map<Integer, Question> questions = new HashMap<>();

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        questions.put(question1.getId(), question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questions.put(question.getId(), question);
        return question;
    }

    @Override
    public Question remove(int id) {
        return questions.remove(id);
    }

    @Override
    public Collection<Question> getAll() {
        return questions.values();
    }

    @Override
    public Question getRandomQuestion() {
        Random max = new Random(5);
        int i = max.nextInt();
        return questions.get(i);
    }
}
