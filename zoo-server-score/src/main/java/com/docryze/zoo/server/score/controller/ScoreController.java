package com.docryze.zoo.server.score.controller;

import com.docryze.zoo.server.score.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("score")
public class ScoreController {
    @Autowired
    private IScoreService scoreService;
}
