package com.start.spring.setting_scores;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ScoreController {

    static Score score = new Score(30, 20, 10);

    @GetMapping("/health-check")
    public String getHealthCheck() {
        return "Situation Normal All Fired Up!";
    }

    @GetMapping("/score")
    public Score getScore() {
        return score;
    }

    @GetMapping("/score/wins")
    public int getWins() {
        return score.wins;
    }
}
