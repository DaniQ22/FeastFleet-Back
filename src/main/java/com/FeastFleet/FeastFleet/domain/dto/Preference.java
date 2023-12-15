package com.FeastFleet.FeastFleet.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.ScrollableResults;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.mapstruct.control.MappingControl;

public class Preference {
    private int preferenceId;

    private String userId;

    private String preference;

    private User user;


    public int getPreferenceId() {
        return preferenceId;
    }

    public void setPreferenceId(int preferenceId) {
        this.preferenceId = preferenceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
