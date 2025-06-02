package com.example.ligaspanyolapp;

import com.example.LigaSpayolApp.Team;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TeamResponse {
    @SerializedName("teams")
    private List<com.example.ligaspanyolapp.Team> teams;

    public List<com.example.ligaspanyolapp.Team> getTeams() {
        return teams;
    }
}