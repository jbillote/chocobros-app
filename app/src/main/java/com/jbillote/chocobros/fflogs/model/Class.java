package com.jbillote.chocobros.fflogs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Class {
    private int id;
    private String name;
    private List<Spec> specs;

    public Class(int id, String name, List<Spec> specs) {
        this.id = id;
        this.name = name;
        this.specs = new ArrayList<>(specs);
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Spec> getSpecs() {
        return this.specs;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = new ArrayList<>(specs);
    }
}
