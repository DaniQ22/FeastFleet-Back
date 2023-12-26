package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.service.OpenAIClientService;
import com.FeastFleet.FeastFleet.persistence.entity.request.ChatRequest;
import com.FeastFleet.FeastFleet.persistence.entity.response.ChatGPTResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gpt3")
public class OpenAIController {

    private static final Logger logger = LoggerFactory.getLogger(OpenAIController.class);


    private final OpenAIClientService openAIClientService;

    @Autowired
    public OpenAIController( OpenAIClientService openAIClientService) {
        this.openAIClientService = openAIClientService;
    }


    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String chat(@RequestBody ChatRequest chatRequest) {
        ChatGPTResponse chatGPTResponse =  openAIClientService.chat(chatRequest);
        String response = "";

        if (chatGPTResponse != null &&
        chatGPTResponse.getChoices() != null
        && !chatGPTResponse.getChoices().isEmpty()){
            response = chatGPTResponse.getChoices().get(0).getMessage().getContent();
        }
        return response;
    }
}
