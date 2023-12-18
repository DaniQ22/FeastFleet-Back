package com.FeastFleet.FeastFleet.web.config;

import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Indexed;

/*La función de esta clase será que todas las llamadas a la API de OpenAI deban
de pasar el parámetro de Authorization en el encabezado Header de solicitud con el
 valor del API KEY,aqui   declararamos
el método apiKeyInterceptor y retornar un RequestInterceptor*/

@Configuration
@ConfigurationProperties
@Indexed
@Slf4j
public class OpenAIClientConfig {

    @Value("${openai-service.http-client.read-timeout}")
    private int readTimeOut;

    @Value("${openai-service.http-client.connect-timeout}")
    private int connectTimeOut;

    @Value("${openai-service.api-key}")
    private String apiKey;

    @Value("${openai-service.gpt-model}")
    private String model;

    @Bean
    public RequestInterceptor apiKeyInterceptor(){
        return request -> request.header("Authorization", "Bearer " + apiKey);
    }

    public int getReadTimeOut() {
        return readTimeOut;
    }

    public void setReadTimeOut(int readTimeOut) {
        this.readTimeOut = readTimeOut;
    }

    public int getConnectTimeOut() {
        return connectTimeOut;
    }

    public void setConnectTimeOut(int connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
