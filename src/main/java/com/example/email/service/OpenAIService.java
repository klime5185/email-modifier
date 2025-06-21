package com.example.email.service;

import org.springframework.web.client.RestTemplate;

public class OpenAIService {

    private static final String API_KEY = "your_openai_api_key_here";

    private static final String ENDPOINT = "https://api.openai.com/v1/chat/completions";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getRewrittenEmail(String emailText, String tone) {
        // Later: send this prompt to GPT and return the rewritten email
        return "Pretend this is the rewritten email.";
    }


}
