package com.jbillote.chocobros.fflogs.model;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Encounter {
    private int id;
    private String name;

    public Encounter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
