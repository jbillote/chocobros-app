package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeremy Billote on 9/20/17.
 */

public class EncounterRanking {

    public class Ranking {
        @SerializedName("name")
        private String name;

        @SerializedName("total")
        private double total;

        @SerializedName("class")
        private int classID;

        @SerializedName("spec")
        private int spec;

        @SerializedName("guild")
        private String guild;

        @SerializedName("server")
        private String server;

        @SerializedName("region")
        private String region;

        @SerializedName("duration")
        private double duration;

        @SerializedName("startTime")
        private double startTime;

        @SerializedName("patch")
        private double patch;

        @SerializedName("reportID")
        private String reportID;

        @SerializedName("fightID")
        private double fightID;

        @SerializedName("exploit")
        private int exploit;

        @SerializedName("hidden")
        private int hidden;

        public Ranking(String name, int classID, int spec, double total, double duration,
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

        public void setExploit(int exploit) {
            this.exploit = exploit;
        }
    }

    @SerializedName("total")
    private int total;

    @SerializedName("rankings")
    private List<Ranking> rankings;

    public EncounterRanking(int total, List<Ranking> rankings) {
        this.total = total;
        this.rankings = rankings;
    }

    public int getTotal() {
        return this.total;
    }

    public List<Ranking> getRankings() {
        return this.rankings;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRankings(List<Ranking> rankings) {
        this.rankings = rankings;
    }
}
