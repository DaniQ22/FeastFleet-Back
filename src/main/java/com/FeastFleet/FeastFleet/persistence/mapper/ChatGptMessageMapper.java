package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.chatGptMessage;
import com.FeastFleet.FeastFleet.persistence.entity.MensajeChatGPT;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {UserMapperr.class})
public interface ChatGptMessageMapper {

    @Mappings({
            @Mapping(source = "idChat", target ="chatId"),
            @Mapping(source = "idUsuario", target ="userId"),
            @Mapping(source = "contenido", target ="content"),
            @Mapping(source = "fechaHora", target ="date"),
            @Mapping(source = "usuario", target ="user")
    })
    chatGptMessage toGptMessage(MensajeChatGPT mensajeChatGPT);


    @InheritInverseConfiguration
    MensajeChatGPT toMensajeGpt (chatGptMessage chatGptMessage);
}
