package com.skypro.kursovaya3springexamapp.Service;

import com.skypro.kursovaya3springexamapp.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
