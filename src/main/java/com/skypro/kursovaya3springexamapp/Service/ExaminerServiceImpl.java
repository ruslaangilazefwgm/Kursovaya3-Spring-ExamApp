package com.skypro.kursovaya3springexamapp.Service;

import com.skypro.kursovaya3springexamapp.Model.Question;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (this.javaQuestionService.getAll().size() < amount) {
            throw new toolargeAmountException("Нет столько вопросов, сколько просите");
        } else {
            Collection<Question> e = new HashSet<>(amount);
            Iterator iterator = e.iterator();
            while (iterator.hasNext()) {
                e.add(this.javaQuestionService.getRandomQuestion());
            }
            return e;
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(toolargeAmountException.class)
    public toolargeAmountException handleException(toolargeAmountException exception) {
        return new toolargeAmountException(exception.getMessage());
    }
}
