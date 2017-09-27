package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jbillote on 9/22/17.
 */

public class CharacterRanking {

    @SerializedName("encounter")
    private int encounterID;

    @SerializedName("class")
    private int classID;

    @SerializedName("spec")
    private int spec;

    @SerializedName("guild")
    private String guild;

    @SerializedName("rank")
    private int rank;

    @SerializedName("outOf")
    private int outOf;

    @SerializedName("duration")
    private long duration;

    @SerializedName("startTime")
    private long startTime;

    @SerializedName("reportID")
    private String reportID;

    @SerializedName("fightID")
    private int fightID;

    @SerializedName("difficulty")
    private int difficulty;

    @SerializedName("size")
    private int size;

    @SerializedName("itemLevel")
    private double patch;

    @SerializedName("total")
    private double total;

    @SerializedName("estimated")
    private boolean estimated;

    public CharacterRanking(int encounterID, int classID, int spec, String guild, int rank,
                            int outOf, long duration, long startTime, String reportID, int fightID,
                            int difficulty, int size, double patch, double total,
                            boolean estimated) {
        this.encounterID = encounterID;
        this.classID = classID;
        this.spec = spec;
        this.guild = guild;
        this.rank = rank;
        this.outOf = outOf;
        this.duration = duration;
        this.startTime = startTime;
        this.reportID = reportID;
        this.fightID = fightID;
        this.difficulty = difficulty;
        this.size = size;
        this.patch = patch;
        this.total = total;
        this.estimated = estimated;
    }

    public int getEncounterID() {
        return this.encounterID;
    }

    public int getClassID() {
        return this.classID;
    }

    public int getSpec() {
        return this.spec;
    }

    public String getGuild() {
        return this.guild;
    }

    public int getRank() {
        return this.rank;
    }

    public int getOutOf() {
        return this.outOf;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getReportID() {
        return this.reportID;
    }

    public int getFightID() {
        return this.fightID;
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public int getSize() {
        return this.size;
    }

    public double getPatch() {
        return this.patch;
    }

    public double getTotal() {
        return this.total;
    }

    public boolean isEstimated() {
        return this.estimated;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public void setSpec(int spec) {
        this.spec = spec;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setOutOf(int outOf) {
        this.outOf = outOf;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public void setFightID(int fightID) {
        this.fightID = fightID;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPatch(double patch) {
        this.patch = patch;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setEstimated(boolean estimated) {
        this.estimated = estimated;
    }
}
