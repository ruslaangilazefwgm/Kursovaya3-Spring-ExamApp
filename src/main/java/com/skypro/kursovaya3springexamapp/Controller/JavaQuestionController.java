package com.skypro.kursovaya3springexamapp.Controller;

import com.skypro.kursovaya3springexamapp.Model.Question;
import com.skypro.kursovaya3springexamapp.Service.JavaQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @PostMapping("/add")  ////?question=QuestionText&answer=QuestionAnswer
    public Question createQuestion(@RequestParam("question") String question,
                                   @RequestParam("answer") String answer) {
        return this.javaQuestionService.add(question, answer);
    }

    @DeleteMapping("/remove")  /////?question=QuestionText&answer=QuestionAnswer
    public Question removeQuestion(@RequestParam("id") int id,
                                    @RequestParam("question") String question
    ) {
        return this.javaQuestionService.remove(id, question);
    }

    @GetMapping("/java")
    public Collection<Question> getAllQuestion() {
        return this.javaQuestionService.getAll();
    }

}
