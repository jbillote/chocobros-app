package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class Class {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("specs")
    private List<Spec> specs;

    public Class(int id, String name, List<Spec> specs) {
        this.id = id;
        this.name = name;
        this.specs = specs;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Spec> getSpecs() {
        return this.specs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }
}
