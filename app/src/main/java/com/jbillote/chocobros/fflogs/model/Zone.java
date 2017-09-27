package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Zone {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("frozen")
    private boolean frozen;

    @SerializedName("encounters")
    private List<Encounter> encounters;

    @SerializedName("brackets")
    private List<Bracket> brackets;

    public Zone(int id, String name, boolean frozen, List<Encounter> encounters, List<Bracket> brackets) {
        this.id = id;
        this.name = name;
        this.frozen = frozen;
        this.encounters = encounters;
        this.brackets = brackets;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isFrozen() {
        return this.frozen;
    }

    public List<Encounter> getEncounters() {
        return this.encounters;
    }

    public List<Bracket> getBrackets() {
        return this.brackets;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }

    public void setBrackets(List<Bracket> brackets) {
        this.brackets = brackets;
    }
}
