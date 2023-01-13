package com.example.api_db.service;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenAiService {

    @Value(value = "${OPENAI_API_KEY}")
    private String apiKey;
    private final int maxTokens = 100;
    private final double temperature = 0.5;
    private final String model = "text-davinci-003";

    public String generateText(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        JsonObject request = new JsonObject();
        request.addProperty("model", model);
        request.addProperty("prompt", prompt);
        request.addProperty("temperature", temperature);
        request.addProperty("max_tokens", maxTokens);

        HttpEntity<String> entity = new HttpEntity<>(request.toString(), headers);

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openai.com/v1/completions";

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        return response.getBody();
    }
}

