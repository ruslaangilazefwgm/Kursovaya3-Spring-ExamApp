package com.skypro.kursovaya3springexamapp.Service;

import com.skypro.kursovaya3springexamapp.Model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(int id);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
