package com.skypro.kursovaya3springexamapp;

import com.skypro.kursovaya3springexamapp.Model.Question;
import com.skypro.kursovaya3springexamapp.Service.JavaQuestionService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class JavaQuestionServiceTests {
    private final JavaQuestionService javaQuestionService = new JavaQuestionService();

    @Test
    public void addQuestionWithParameters() {
        Question result = new Question("q1", "a1");
        javaQuestionService.add("q1", "a1");
        Assertions.assertThat(javaQuestionService.getAll())
                .contains(result);
    }

    @Test
    public void addQuestion() {
        Question result = new Question("q1", "a1");
        javaQuestionService.add(result);
        Assertions.assertThat(javaQuestionService.getAll())
                .contains(result);
    }

    @Test
    public void removeQuestion() {
        Question result = javaQuestionService.add(new Question("q1", "a1"));
        Question result2 = javaQuestionService.add(new Question("q2", "a2"));
        javaQuestionService.remove("q1", "a1");
        boolean b = javaQuestionService.getAll().contains(result);
        Assertions.assertThat(!b);
    }

    @Test
    public void getAllTest() {
        Question result = javaQuestionService.add(new Question("q1", "a1"));
        Question result2 = javaQuestionService.add(new Question("q2", "a2"));

        Map<Integer, Question> b = new HashMap<>();
        Question experiment = b.put(0, result);
        Question experiment2 = b.put(1, result2);
        Assertions.assertThat(javaQuestionService.getAll() == b.values());
    }
}
