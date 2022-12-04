package com.skypro.kursovaya3springexamapp;

import com.skypro.kursovaya3springexamapp.Model.Question;
import com.skypro.kursovaya3springexamapp.Service.ExaminerServiceImpl;
import com.skypro.kursovaya3springexamapp.Service.JavaQuestionService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTests {

    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    @Test
    void getAllQuestionsTest() {

        Collection<Question> questions = Set.of(
                new Question("q1", "a1"),
                new Question("q2", "a2"),
                new Question("q3", "a3")
        );
        Assertions.assertThat(questions.size() == examinerService.getQuestions(3).size());
    }
}
