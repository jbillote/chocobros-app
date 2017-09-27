package com.jbillote.chocobros.fflogs;

import com.google.gson.reflect.TypeToken;
import com.jbillote.chocobros.fflogs.model.CharacterParse;
import com.jbillote.chocobros.fflogs.model.CharacterRanking;
import com.jbillote.chocobros.fflogs.model.Class;
import com.jbillote.chocobros.fflogs.model.EncounterRanking;
import com.jbillote.chocobros.fflogs.model.Report;
import com.jbillote.chocobros.fflogs.model.Zone;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is a wrapper for the FFLogs API.
 *
 * @author Jeremy Billote
 */
public class FFLogsAPI {

    /**
     * Base URL for the FFLogs API.
     */
    private final String FFLOGS_API_URL = "https://www.fflogs.com:443/v1";

    /**
     * Public API key to use in FFLogs API calls.
     */
    private String apiKey;

    /**
     * Initialize a new instance of the FFLogs API wrapper, using the given API key.
     *
     * @param apiKey Public API key to use for all API calls
     */
    public FFLogsAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Get a {@link java.util.List} of all available Zones.
     *
     * @return List of all available Zones.
     * @throws IOException if the HTTP call fails
     */
    public List<Zone> getZones() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/classes?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<Zone>>(){}.getType();
        return gson.fromJson(reader, classType);
    }

    /**
     * Get a {@link java.util.List} of all available {@link com.jbillote.chocobros.fflogs.model.Class}es.
     *
     * @return {@link java.util.List} of all available {@link com.jbillote.chocobros.fflogs.model.Class}es.
     * @throws IOException if the HTTP call fails
     */
    public List<Class> getClasses() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/classes?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<Class>>(){}.getType();
        return gson.fromJson(reader, classType);
    }

    /**
     * Get the rankings associated with a specific encounter.
     *
     * @param encounterID ID of the encounter to get rankings for
     * @return {@link com.jbillote.chocobros.fflogs.model.EncounterRanking} for the given encounter.
     * @throws IOException if the HTTP call fails
     */
    public EncounterRanking getRanking(int encounterID) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/rankings/encounter/" + encounterID + "?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        return gson.fromJson(reader, EncounterRanking.class);
    }

    /**
     * Get the rankings for a character.
     *
     * @param characterName Name of the character to get rankings for
     * @param server Server the character resides in
     * @param region Region the server belongs to
     * @return {@link java.util.List} of {@link com.jbillote.chocobros.fflogs.model.CharacterRanking} for the given character.
     * @throws IOException
     */
    public List<CharacterRanking> getRanking(String characterName, String server, String region) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/rankings/character/" + characterName + "/" + server + "/" + region + "?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<CharacterRanking>>(){}.getType();
        return gson.fromJson(reader, classType);
    }

    /**
     * Get the parses for a character.
     *
     * @param characterName Name of the character to get parses for
     * @param server Server the character resides in
     * @param region Region the server belongs to
     * @return {@link java.util.List} of {@link com.jbillote.chocobros.fflogs.model.CharacterParse} for the given character.
     * @throws IOException if the HTTP request fails
     */
    public List<CharacterParse> getParses(String characterName, String server, String region) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/parses/character/" + characterName + "/" + server + "/" + region + "?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<CharacterParse>>(){}.getType();
        return gson.fromJson(reader, classType);
    }

    /**
     * Get the reports for a given guild.
     *
     * @param guild Name of the guild to get reports for
     * @param server Server the guild is in
     * @param region Region the server belongs to
     * @return {@link java.util.List} of {@link com.jbillote.chocobros.fflogs.model.Report} for the given guild.
     * @throws IOException if the HTTP request fails
     */
    public List<Report> getReports(String guild, String server, String region) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/reports/guild/" + guild + "/" + server + "/" + region + "?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<Report>>(){}.getType();
        return gson.fromJson(reader, classType);
    }

    /**
     * Get the reports for a given user. Note that this is an FFLogs user, not character.
     *
     * @param username User to get reports for
     * @return {@link java.util.List} of {@link com.jbillote.chocobros.fflogs.model.Report} for the given user.
     * @throws IOException if the HTTP request fails
     */
    public List<Report> getReports(String username) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(FFLOGS_API_URL + "/reports/user/" + username + "?api_key=" + this.apiKey).build();

        Reader reader = new InputStreamReader(client.newCall(request).execute().body().source().inputStream());
        Gson gson = new Gson();

        Type classType = new TypeToken<ArrayList<Report>>(){}.getType();
        return gson.fromJson(reader, classType);
    }
}
