package com.FeastFleet.FeastFleet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class chatGptMessage {

    private int chatId;

    private String userId;

    private String content;

    private LocalDateTime date;


}
