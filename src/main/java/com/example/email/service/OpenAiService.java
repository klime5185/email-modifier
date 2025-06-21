package com.example.email.service;

import org.springframework.web.client.RestTemplate;

public class OpenAiService {

    private static final String API_KEY = "your_openai_api_key_here";

    private static final String ENDPOINT = "https://api.openai.com/v1/chat/completions";

    private final RestTemplate restTemplate = new RestTemplate();


}
