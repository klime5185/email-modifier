package com.example.email.controller;

import com.example.email.model.EmailRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.email.service.OpenAIService;


@RestController
@RequestMapping("/api")
public class RewriteController {

    private final OpenAIService openAIService;

    public RewriteController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/rewrite")
    public ResponseEntity<String> rewriteEmail(@RequestBody EmailRequest request) {
        // This is where we call the method
        String rewritten = openAIService.getRewrittenEmail(
                request.getEmailText(),
                request.getTone()
        );

        return ResponseEntity.ok(rewritten);
    }
}
