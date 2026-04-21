package com.dark.basics.Controller;

import com.dark.basics.Service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    @Autowired
    private AiService aiService;

    @GetMapping("/joke")
    public ResponseEntity<String> joke(@RequestParam String topic) {
        return ResponseEntity.ok(aiService.getJoke(topic));
    }
}