package com.quiz.controller;

import com.quiz.model.Question;
import com.quiz.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/questions")
    public List<Question> getQuestions(@RequestParam String topic) {
        return quizService.getQuestionsByTopic(topic);
    }

    @PostMapping("/evaluate")
    public Map<String, Object> evaluate(@RequestBody Map<String, String> payload) {
        Long id = Long.parseLong(payload.get("questionId"));
        String answer = payload.get("answer");
        boolean correct = quizService.evaluateAnswer(id, answer);
        return Map.of("correct", correct);
    }
    
    @GetMapping("/question/random")
    public Question getRandomQuestion(@RequestParam String topic) {
        return quizService.getRandomQuestionByTopic(topic);
    }

}
