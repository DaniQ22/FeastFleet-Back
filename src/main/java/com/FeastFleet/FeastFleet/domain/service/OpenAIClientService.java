package com.FeastFleet.FeastFleet.domain.service;
import com.FeastFleet.FeastFleet.persistence.entity.Message;
import com.FeastFleet.FeastFleet.persistence.entity.request.ChatGPTRequest;
import com.FeastFleet.FeastFleet.persistence.entity.request.ChatRequest;
import com.FeastFleet.FeastFleet.persistence.entity.response.ChatGPTResponse;
import com.FeastFleet.FeastFleet.persistence.entity.response.Choise;
import com.FeastFleet.FeastFleet.web.config.OpenAIClient;
import com.FeastFleet.FeastFleet.web.config.OpenAIClientConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


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

        //Creamos el objeto mensaje que llevara la pregunta que el usuario envia
        Message message = Message.builder().role(ROLE_USE).content(chatRequest.getQuestion()).build();

        //Creamos el objeto ChatGPTRequest que contendra el modelo y el mensaje
        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder().model(openAIClientConfig.getModel())
                .messages(Collections.singletonList(message)).build();

        //LLamamos al metodo chat del cliente OpenAICliente
        ChatGPTResponse chatGPTResponse =  openAIClient.chat(chatGPTRequest);

         //Aqui obetenemos la respuesta que no envia chat gpt
         List<Choise> choises = chatGPTResponse.getChoices();

         //Verificamos si nuestra respuesta no esta vacia para obtener el contenido del mensaje
        String responseContent = "";
        if (choises !=null && !choises.isEmpty()){
            Choise firtChoice = choises.get(0);
            if (firtChoice != null){
                Message choiceMessage = firtChoice.getMessage();
                if (choiceMessage!=null){
                    responseContent = choiceMessage.getContent();
                }

            }
        }
        return chatGPTResponse;
    }
}