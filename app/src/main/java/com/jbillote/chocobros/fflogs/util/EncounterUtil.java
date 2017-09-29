package com.jbillote.chocobros.fflogs.util;

import com.jbillote.chocobros.fflogs.exception.InvalidEncounterException;

/**
 * Created by Jeremy Billote on 9/29/17.
 */

/**
 * This class provides class-based utilities for FFLogs values.
 *
 * @author Jeremy Billote
 */
public class EncounterUtil {

    private static String NEVERREAP = "Neverreap";
    private static String FRACTAL_CONTINUUM = "The Fractal Continuum";
    private static String SAINT_MOCIANNES_ARBORETUM = "Saint Mocianne's Arboretum";
    private static String PHAROS_SIRIUS_HARD = "Pharos Sirius (Hard)";
    private static String ANTITOWER = "The Antitower";
    private static String LOST_CITY_OF_AMDAPOR_HARD = "The Lost City of Amdapor (Hard)";
    private static String SOHR_KAI = "Sohr Kai";
    private static String HULLBREAKER_ISLE_HARD = "Hullbreaker Isle (Hard)";
    private static String XELPHATOL = "Xelphatol";
    private static String GREAT_GUBAL_LIBRARY_HARD = "The Great Gubal Library (Hard)";
    private static String BISMARCK = "Bismarck";
    private static String RAVANA = "Ravana";
    private static String THORDAN = "Thordan";
    private static String SEPHIROT = "Sephirot";
    private static String NIDHOGG = "Nidhogg";
    private static String SOPHIA = "Sophia";
    private static String ZURVAN = "Zurvan";
    private static String CETUS = "Cetus";
    private static String IRMINSUL = "Irminsul";
    private static String CUCHULAINN = "Cuchulainn";
    private static String ECHIDNA = "Echidna";
    private static String OPPRESSOR = "Oppressor";
    private static String CUFF_OF_THE_FATHER = "The Cuff of the Father";
    private static String LIVING_LIQUID = "Living Liquid";
    private static String MANIPULATOR = "The Manipulator";
    private static String FAUST = "Faust";
    private static String ARACHNE_EVE = "Arachne Eve";
    private static String FORGALL = "Forgall";
    private static String OZMA = "Ozma";
    private static String CALOFISTERI = "Calofisteri";
    private static String RATFINX_TWINKLEDINKS = "Ratfinx Twinkledinks";
    private static String VORTEXER = "Vortexer";
    private static String QUICKTHINX_ALLTHOUGHTS = "Quickthinx Allthoughts";
    private static String BRUTE_JUSTICE = "Brute Justice";
    private static String HUMMELFAUST = "Hummelfaust";
    private static String BLASTER = "Blaster";
    private static String BRAWLER = "Brawler";
    private static String SWINDLER = "Swindler";
    private static String CUFF_OF_THE_SON = "The Cuff of the Son";
    private static String REFURBISHER_ZERO = "Refurbisher 0";
    private static String LAMEBRIX_STRIKELOCKS = "Lamebrix Strikebocks";
    private static String CRUISE_CHASER = "Cruise Chaser";
    private static String ALEXANDER_PRIME = "Alexander Prime";
    private static String FAUST_Z = "Faust Z";
    private static String ALA_MHIGO = "Ala Mhigo";
    private static String KUGANE_CASTLE = "Kugane Castle";
    private static String TEMPLE_OF_THE_FIST = "The Temple of the Fist";
    private static String SUSANO = "Susano";
    private static String LAKSHIMI = "Lakshimi";
    private static String ALTE_ROITE = "Alte Roite";
    private static String CATASTROPHE = "Catastrophe";
    private static String HALICARNASSUS = "Halicarnassus";
    private static String EXDEATH = "Exdeath";
    private static String NEO_EXDEATH = "Neo Exdeath";

    public static String getEncounterName(int id) throws InvalidEncounterException {
        switch (id) {
            case 4500:
                return NEVERREAP;
            case 4501:
                return FRACTAL_CONTINUUM;
            case 4502:
                return SAINT_MOCIANNES_ARBORETUM;
            case 4503:
                return PHAROS_SIRIUS_HARD;
            case 4504:
                return ANTITOWER;
            case 4505:
                return LOST_CITY_OF_AMDAPOR_HARD;
            case 4506:
                return SOHR_KAI;
            case 4507:
                return HULLBREAKER_ISLE_HARD;
            case 4508:
                return XELPHATOL;
            case 4509:
                return GREAT_GUBAL_LIBRARY_HARD;
            case 1027:
                return BISMARCK;
            case 1028:
                return RAVANA;
            case 1029:
                return THORDAN;
            case 1031:
                return SEPHIROT;
            case 1033:
                return NIDHOGG;
            case 1034:
                return SOPHIA;
            case 1035:
                return ZURVAN;
            case 2000:
                return CETUS;
            case 2001:
                return IRMINSUL;
            case 2002:
                return CUCHULAINN;
            case 2003:
                return ECHIDNA;
            case 14:
                return OPPRESSOR;
            case 15:
                return CUFF_OF_THE_FATHER;
            case 16:
                return LIVING_LIQUID;
            case 17:
                return MANIPULATOR;
            case 5000:
                return FAUST;
            case 18:
                return OPPRESSOR;
            case 19:
                return CUFF_OF_THE_FATHER;
            case 20:
                return LIVING_LIQUID;
            case 21:
                return MANIPULATOR;
            case 5001:
                return FAUST;
            case 2004:
                return ARACHNE_EVE;
            case 2005:
                return FORGALL;
            case 2006:
                return OZMA;
            case 2007:
                return CALOFISTERI;
            case 22:
                return RATFINX_TWINKLEDINKS;
            case 23:
                return VORTEXER;
            case 24:
                return QUICKTHINX_ALLTHOUGHTS;
            case 25:
                return BRUTE_JUSTICE;
            case 5002:
                return HUMMELFAUST;
            case 5003:
                return BLASTER;
            case 5004:
                return BRAWLER;
            case 5005:
                return SWINDLER;
            case 26:
                return RATFINX_TWINKLEDINKS;
            case 27:
                return CUFF_OF_THE_SON;
            case 28:
                return QUICKTHINX_ALLTHOUGHTS;
            case 29:
                return BRUTE_JUSTICE;
            case 5006:
                return HUMMELFAUST;
            case 30:
                return REFURBISHER_ZERO;
            case 31:
                return LAMEBRIX_STRIKELOCKS;
            case 32:
                return CRUISE_CHASER;
            case 33:
                return ALEXANDER_PRIME;
            case 5007:
                return FAUST_Z;
            case 34:
                return REFURBISHER_ZERO;
            case 35:
                return LAMEBRIX_STRIKELOCKS;
            case 36:
                return CRUISE_CHASER;
            case 37:
                return ALEXANDER_PRIME;
            case 5008:
                return FAUST_Z;
            case 4510:
                return ALA_MHIGO;
            case 4511:
                return KUGANE_CASTLE;
            case 4512:
                return TEMPLE_OF_THE_FIST;
            case 1036:
                return SUSANO;
            case 1037:
                return LAKSHIMI;
            case 38:
                return ALTE_ROITE;
            case 39:
                return CATASTROPHE;
            case 40:
                return HALICARNASSUS;
            case 41:
                return EXDEATH;
            case 42:
                return ALTE_ROITE;
            case 43:
                return CATASTROPHE;
            case 44:
                return HALICARNASSUS;
            case 45:
                return EXDEATH;
            case 46:
                return NEO_EXDEATH;
            default:
                throw new InvalidEncounterException();
        }
    }
}
