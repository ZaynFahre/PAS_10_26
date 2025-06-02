package com.example.ligaspanyolapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SportsApi {
    @GET("search_all_teams.php")
    Call<TeamResponse> getTeams(
            @Query("s") String sport,
            @Query("c") String country
    );
}