package com.jbillote.chocobros.fflogs.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeremy Billote on 9/26/17.
 */

public class CharacterParse {

    public class ParseSpec {

        public class SpecData {

            @SerializedName("character_id")
            private long characterID;

            @SerializedName("character_name")
            private String characterName;

            @SerializedName("persecondamount")
            private float perSecondAmount;

            @SerializedName("ilvl")
            private float patch;

            @SerializedName("duration")
            private long duration;

            @SerializedName("start_time")
            private long startTime;

            @SerializedName("report_code")
            private String reportCode;

            @SerializedName("report_fight")
            private int reportFight;

            @SerializedName("ranking_id")
            private long rankingID;

            @SerializedName("guild")
            private String guild;

            @SerializedName("total")
            private float total;

            @SerializedName("rank")
            private String rank;

            @SerializedName("percent")
            private double percent;

            @SerializedName("exploit")
            private int exploit;

            @SerializedName("banned")
            private boolean banned;

            @SerializedName("historical_count")
            private int historicalCount;

            @SerializedName("historical_percent")
            private float historicalPercent;

            public SpecData(long characterID, String characterName, float perSecondAmount,
                            float patch, long duration, long startTime, String reportCode,
                            int reportFight, long rankingID, String guild, float total,
                            String rank, double percent, int exploit, boolean banned,
                            int historicalCount, float historicalPercent) {
                this.characterID = characterID;
                this.characterName = characterName;
                this.perSecondAmount = perSecondAmount;
                this.patch = patch;
                this.duration = duration;
                this.startTime = startTime;
                this.reportCode = reportCode;
                this.reportFight = reportFight;
                this.rankingID = rankingID;
                this.guild = guild;
                this.total = total;
                this.rank = rank;
                this.percent = percent;
                this.exploit = exploit;
                this.banned = banned;
                this.historicalCount = historicalCount;
                this.historicalPercent = historicalPercent;
            }

            public long getCharacterID() {
                return this.characterID;
            }

            public String getCharacterName() {
                return this.characterName;
            }

            public float getPerSecondAmount() {
                return this.perSecondAmount;
            }

            public float getPatch() {
                return this.patch;
            }

            public long getDuration() {
                return this.duration;
            }

            public long getStartTime() {
                return this.startTime;
            }

            public String getReportCode() {
                return this.reportCode;
            }

            public int getReportFight() {
                return this.reportFight;
            }

            public long getRankingID() {
                return this.rankingID;
            }

            public String getGuild() {
                return this.guild;
            }

            public float getTotal() {
                return this.total;
            }

            public String getRank() {
                return this.rank;
            }

            public double getPercent() {
                return this.percent;
            }

            public int getExploit() {
                return this.exploit;
            }

            public boolean isBanned() {
                return this.banned;
            }

            public int getHistoricalCount() {
                return this.historicalCount;
            }

            public float getHistoricalPercent() {
                return this.historicalPercent;
            }

            public void setCharacterID(long characterID) {
                this.characterID = characterID;
            }

            public void setCharacterName(String characterName) {
                this.characterName = characterName;
            }

            public void setPerSecondAmount(float perSecondAmount) {
                this.perSecondAmount = perSecondAmount;
            }

            public void setPatch(float patch) {
                this.patch = patch;
            }

            public void setDuration(long duration) {
                this.duration = duration;
            }

            public void setStartTime(long startTime) {
                this.startTime = startTime;
            }

            public void setReportCode(String reportCode) {
                this.reportCode = reportCode;
            }

            public void setReportFight(int reportFight) {
                this.reportFight = reportFight;
            }

            public void setRankingID(long rankingID) {
                this.rankingID = rankingID;
            }

            public void setGuild(String guild) {
                this.guild = guild;
            }

            public void setTotal(float total) {
                this.total = total;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public void setPercent(double percent) {
                this.percent = percent;
            }

            public void setExploit(int exploit) {
                this.exploit = exploit;
            }

            public void setBanned(boolean banned) {
                this.banned = banned;
            }

            public void setHistoricalCount(int historicalCount) {
                this.historicalCount = historicalCount;
            }

            public void setHistoricalPercent(float historicalPercent) {
                this.historicalPercent = historicalPercent;
            }
        }

        @SerializedName("class")
        private String className;

        @SerializedName("spec")
        private String specName;

        @SerializedName("combined")
        private boolean combined;

        @SerializedName("data")
        private List<SpecData> data;

        public ParseSpec(String className, String specName, boolean combined, List<SpecData> data) {
            this.className = className;
            this.specName = specName;
            this.combined = combined;
            this.data = data;
        }

        public String getClassName() {
            return this.className;
        }

        public String getSpecName() {
            return this.specName;
        }

        public boolean isCombined() {
            return this.combined;
        }

        public List<SpecData> getData() {
            return this.data;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public void setSpecName(String specName) {
            this.specName = specName;
        }

        public void setCombined(boolean combined) {
            this.combined = combined;
        }

        public void setData(List<SpecData> data) {
            this.data = data;
        }
    }

    @SerializedName("difficulty")
    private long difficulty;

    @SerializedName("size")
    private int size;

    @SerializedName("name")
    private String zoneName;

    @SerializedName("specs")
    private List<ParseSpec> specs;

    public CharacterParse(long difficulty, int size, String zoneName, List<ParseSpec> specs) {
        this.difficulty = difficulty;
        this.size = size;
        this.zoneName = zoneName;
        this.specs = specs;
    }

    public long getDifficulty() {
        return this.difficulty;
    }

    public int getSize() {
        return this.size;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public List<ParseSpec> getSpecs() {
        return this.specs;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setSpecs(List<ParseSpec> specs) {
        this.specs = specs;
    }
}
