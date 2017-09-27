package com.jbillote.chocobros.fflogs;

import com.jbillote.chocobros.fflogs.model.CharacterParse;
import com.jbillote.chocobros.fflogs.model.CharacterRanking;
import com.jbillote.chocobros.fflogs.model.Class;
import com.jbillote.chocobros.fflogs.model.EncounterRanking;
import com.jbillote.chocobros.fflogs.model.Report;
import com.jbillote.chocobros.fflogs.model.Zone;

import java.util.List;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jbillote on 9/22/17.
 */

public class FFLogsAPITest {

    // TODO: Maybe find better way to test if API endpoints are still valid

    private FFLogsAPI api;

    @Before
    public void setup() {
        this.api = new FFLogsAPI("5dfb8a713b0eb301eba693194c00c83b");
    }

    @Test
    public void getZonesTest() {
        try {
            List<Zone> zones = api.getZones();

            assertNotNull(zones);
            assertNotEquals(0, zones.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getClassesTest() {
        try {
            List<Class> classes = api.getClasses();

            assertNotNull(classes);
            assertNotEquals(0, classes.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEncounterRankingTest() {
        try {
            EncounterRanking ranking = api.getRanking(46);

            assertNotNull(ranking);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getCharacterRankingTest() {
        try {
            List<CharacterRanking> ranking = api.getRanking("touka tsuwamono", "faerie", "na");

            assertNotNull(ranking);
            assertNotEquals(0, ranking.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getParsesTest() {
        try {
            List<CharacterParse> parses = api.getParses("touka tsuwamono", "faerie", "na");

            assertNotNull(parses);
            assertNotEquals(0, parses.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getReportsByGuildTest() {
        try {
            List<Report> reports = api.getReports("chocobros", "faerie", "na");

            assertNotNull(reports);
            assertNotEquals(0, reports.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void getReportsByUserTest() {
        try {
            List<Report> reports = api.getReports("vanrionfalanae");

            assertNotNull(reports);
            assertNotEquals(0, reports.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
