package com.FeastFleet.FeastFleet.domain.service;
import com.FeastFleet.FeastFleet.persistence.entity.Message;
import com.FeastFleet.FeastFleet.persistence.entity.request.ChatGPTRequest;
import com.FeastFleet.FeastFleet.persistence.entity.request.ChatRequest;
import com.FeastFleet.FeastFleet.persistence.entity.response.ChatGPTResponse;
import com.FeastFleet.FeastFleet.web.config.OpenAIClient;
import com.FeastFleet.FeastFleet.web.config.OpenAIClientConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service
public class OpenAIClientService {

    private final OpenAIClient openAIClient;
    private final OpenAIClientConfig openAIClientConfig;

    private final static String ROLE_USE = "user";

    @Autowired
    public OpenAIClientService(OpenAIClient openAIClient, OpenAIClientConfig openAIClientConfig) {
        this.openAIClient = openAIClient;
        this.openAIClientConfig = openAIClientConfig;
    }


    public ChatGPTResponse chat(ChatRequest chatRequest){
        Message message = Message.builder().role(ROLE_USE).content(chatRequest.getQuestion()).build();

        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder().model(openAIClientConfig.getModel())
                .messages(Collections.singletonList(message)).build();

        return openAIClient.chat(chatGPTRequest);
    }
}