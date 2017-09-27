package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

/**
 * This class represents a bracket an encounter can belong to. This is typically a patch in an
 * expansion that the encounter can be done in.
 *
 * @author Jeremy Billote
 */
public class Bracket {

    /**
     * A unique identifier representing the bracket.
     */
    @SerializedName("id")
    private int id;

    /**
     * An explanation of what the bracket contains. This is typically the patch number.
     */
    @SerializedName("name")
    private String name;

    public Bracket(int id, String name) {
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
