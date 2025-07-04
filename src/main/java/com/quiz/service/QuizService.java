package com.quiz.service;

import com.quiz.model.Question;
import com.quiz.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.Random;


import java.util.List;

@Service
public class QuizService {
    private final QuestionRepository repository;

    public QuizService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Question> getQuestionsByTopic(String topic) {
        return repository.findByTopic(topic);
    }

    public boolean evaluateAnswer(Long questionId, String selectedOption) {
        return repository.findById(questionId)
                .map(q -> q.getCorrectOption().equalsIgnoreCase(selectedOption))
                .orElse(false); // fallback if question not found
    }
    
    public Question getRandomQuestionByTopic(String topic) {
        List<Question> questions = getQuestionsByTopic(topic);
        if (questions.isEmpty()) {
            return null;
        }
        int index = new Random().nextInt(questions.size());
        return questions.get(index);
    }


}
