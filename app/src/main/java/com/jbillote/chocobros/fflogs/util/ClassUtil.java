package com.jbillote.chocobros.fflogs.util;

import com.jbillote.chocobros.fflogs.exception.InvalidSpecException;

/**
 * Created by Jeremy Billote on 9/29/17.
 */

/**
 * This class provides class-based utilities for FFLogs values.
 *
 * @author Jeremy Billote
 */
public class ClassUtil {

    private static String ASTROLOGIAN = "Astrologian";
    private static String BARD = "Bard";
    private static String BLACK_MAGE = "Black Mage";
    private static String DARK_KNIGHT = "Dark Knight";
    private static String DRAGOON = "Dragoon";
    private static String MACHINIST = "Machinist";
    private static String MONK = "Monk";
    private static String NINJA = "Ninja";
    private static String PALADIN = "Paladin";
    private static String SCHOLAR = "Scholar";
    private static String SUMMONER = "Summoner";
    private static String WARRIOR = "Warrior";
    private static String WHITE_MAGE = "White Mage";
    private static String RED_MAGE = "Red Mage";
    private static String SAMURAI = "Samurai";

    private ClassUtil() {}

    /**
     * Return a string representing a Final Fantasy XIV class given an FFLog spec.
     *
     * @param spec The FFLog spec to get a string representation of
     * @return A string representation of a Final Fantasy XIV class
     * @throws InvalidSpecException if the spec does not have a valid string representation
     */
    public static String getClass(int spec) throws InvalidSpecException {
        switch (spec) {
            case 1:
                return ASTROLOGIAN;
            case 2:
                return BARD;
            case 3:
                return BLACK_MAGE;
            case 4:
                return DARK_KNIGHT;
            case 5:
                return DRAGOON;
            case 6:
                return MACHINIST;
            case 7:
                return MONK;
            case 8:
                return NINJA;
            case 9:
                return PALADIN;
            case 10:
                return SCHOLAR;
            case 11:
                return SUMMONER;
            case 12:
                return WARRIOR;
            case 13:
                return WHITE_MAGE;
            case 14:
                return RED_MAGE;
            case 15:
                return SAMURAI;
            default:
                throw new InvalidSpecException();
        }
    }
}
