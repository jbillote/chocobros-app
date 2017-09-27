package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jeremy Billote on 9/26/17.
 */

public class Report {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("owner")
    private String owner;

    @SerializedName("start")
    private double start;

    @SerializedName("end")
    private double end;

    @SerializedName("zone")
    private int zone;

    public Report(String id, String title, String owner, double start, double end, int zone) {
        this.id = id;
        this.title = title;
        this.owner = owner;
        this.start = start;
        this.end = end;
        this.zone = zone;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getStart() {
        return this.start;
    }

    public double getEnd() {
        return this.end;
    }

    public int getZone() {
        return this.zone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
