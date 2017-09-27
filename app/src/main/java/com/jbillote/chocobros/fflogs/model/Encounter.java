package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Encounter {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public Encounter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
