package com.jbillote.chocobros.fflogs.model;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class EncounterRanking {
    private String name;
    private double total;
    private int classID;
    private int spec;
    private String guild;
    private String server;
    private String region;
    private double duration;
    private double startTime;
    private double patch;
    private String reportID;
    private double fightID;
    private int exploit;
    private int hidden;

    public EncounterRanking(String name, int classID, int spec, double total, double duration,
                            double startTime, double fightID, String reportID, String guild,
                            String server, String region, int hidden, double patch, int exploit) {
        this.name = name;
        this.classID = classID;
        this.spec = spec;
        this.total = total;
        this.duration = duration;
        this.startTime = startTime;
        this.fightID = fightID;
        this.reportID = reportID;
        this.guild = guild;
        this.server = server;
        this.region = region;
        this.hidden = hidden;
        this.patch = patch;
        this.exploit = exploit;
    }

    public String getName() {
        return this.name;
    }

    public int getClassID() {
        return this.classID;
    }

    public int getSpec() {
        return this.spec;
    }

    public double getTotal() {
        return this.total;
    }

    public double getDuration() {
        return this.duration;
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getFightID() {
        return this.fightID;
    }

    public String getReportID() {
        return this.reportID;
    }

    public String getGuild() {
        return this.guild;
    }

    public String getServer() {
        return this.server;
    }

    public String getRegion() {
        return this.region;
    }

    public int getHidden() {
        return this.hidden;
    }

    public double getPatch() {
        return this.patch;
    }

    public int getExploit() {
        return this.exploit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setclassID(int classID) {
        this.classID = classID;
    }

    public void setSpec(int spec) {
        this.spec = spec;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setFightID(int fightID) {
        this.fightID = fightID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public void setPatch(double patch) {
        this.patch = patch;
    }

    public void setExploit(double exploit) {
        this.exploit = exploit;
    }
}
