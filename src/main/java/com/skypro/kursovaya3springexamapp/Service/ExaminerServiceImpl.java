package com.skypro.kursovaya3springexamapp.Service;

import com.skypro.kursovaya3springexamapp.Model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    Random random;
    JavaQuestionService javaQuestionService;

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> e = new HashSet<>(amount);
        Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            e.add(this.javaQuestionService.getRandomQuestion());
        }
        return e;
    }
}
