package com.jbillote.chocobros.fflogs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Zone {
    private int id;
    private String name;
    private boolean frozen;
    private List<Encounter> encounters;
    private List<Bracket> brackets;

    public Zone(int id, String name, boolean frozen, List<Encounter> encounters,
                List<Bracket> brackets) {
        this.id = id;
        this.name = name;
        this.frozen = frozen;
        this.encounters = new ArrayList<>(encounters);
        this.brackets = new ArrayList<>(brackets);
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getFrozen() {
        return this.frozen;
    }

    public List<Encounter> getEncounters() {
        return this.encounters;
    }

    public List<Bracket> getBrackets() {
        return this.brackets;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = new ArrayList<>(encounters);
    }

    public void setBrackets(List<Bracket> brackets) {
        this.brackets = new ArrayList<>(brackets);
    }
}
