package com.example.api_db.controller;

import com.example.api_db.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OpenAiController {
    @Autowired
    private OpenAiService openAiService;

    @PostMapping("/openai")
    public ResponseEntity<String> generateText(@RequestBody String prompt) {
        String response = openAiService.generateText(prompt);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}


