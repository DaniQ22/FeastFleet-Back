package com.FeastFleet.FeastFleet.persistence.entity.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ChatGPTResponse implements Serializable {

    private String id;

    private String object;

    private  String model;

    private LocalDate created;

    private List<Choise> choices;

    private Usage usage;

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public List<Choise> getChoices() {
        return choices;
    }

    public void setChoices(List<Choise> choices) {
        this.choices = choices;
    }
}
