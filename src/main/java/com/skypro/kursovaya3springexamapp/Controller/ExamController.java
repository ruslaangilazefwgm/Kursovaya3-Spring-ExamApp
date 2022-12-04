package com.skypro.kursovaya3springexamapp.Controller;

import com.skypro.kursovaya3springexamapp.Model.Question;
import com.skypro.kursovaya3springexamapp.Service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {

    ExaminerServiceImpl examinerServiceImpl;

    @GetMapping("/exam/get")
    public Collection<Question> getQuestions(@RequestParam("amount") int amount) {
        return this.examinerServiceImpl.getQuestions(amount);
    }
}
