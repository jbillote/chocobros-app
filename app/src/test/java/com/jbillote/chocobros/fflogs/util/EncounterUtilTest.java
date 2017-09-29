package com.jbillote.chocobros.fflogs.util;

import com.jbillote.chocobros.fflogs.exception.InvalidEncounterException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jeremy Billote on 9/29/17.
 */

public class EncounterUtilTest {

    @Test(expected = InvalidEncounterException.class)
    public void testGetEncounterName() throws InvalidEncounterException {
        assertEquals("Neverreap", EncounterUtil.getEncounterName(4500));
        assertEquals("The Fractal Continuum", EncounterUtil.getEncounterName(4501));
        assertEquals("Saint Mocianne's Arboretum", EncounterUtil.getEncounterName(4502));
        assertEquals("Pharos Sirius (Hard)", EncounterUtil.getEncounterName(4503));
        assertEquals("The Antitower", EncounterUtil.getEncounterName(4504));
        assertEquals("The Lost City of Amdapor (Hard)", EncounterUtil.getEncounterName(4505));
        assertEquals("Sohr Kai", EncounterUtil.getEncounterName(4506));
        assertEquals("Hullbreaker Isle (Hard)", EncounterUtil.getEncounterName(4507));
        assertEquals("Xelphatol", EncounterUtil.getEncounterName(4508));
        assertEquals("The Great Gubal Library (Hard)", EncounterUtil.getEncounterName(4509));
        assertEquals("Bismarck", EncounterUtil.getEncounterName(1027));
        assertEquals("Ravana", EncounterUtil.getEncounterName(1028));
        assertEquals("Thordan", EncounterUtil.getEncounterName(1029));
        assertEquals("Sephirot", EncounterUtil.getEncounterName(1031));
        assertEquals("Nidhogg", EncounterUtil.getEncounterName(1033));
        assertEquals("Sophia", EncounterUtil.getEncounterName(1034));
        assertEquals("Zurvan", EncounterUtil.getEncounterName(1035));
        assertEquals("Cetus", EncounterUtil.getEncounterName(2000));
        assertEquals("Irminsul", EncounterUtil.getEncounterName(2001));
        assertEquals("Cuchulainn", EncounterUtil.getEncounterName(2002));
        assertEquals("Echidna", EncounterUtil.getEncounterName(2003));
        assertEquals("Oppressor", EncounterUtil.getEncounterName(14));
        assertEquals("The Cuff of the Father", EncounterUtil.getEncounterName(15));
        assertEquals("Living Liquid", EncounterUtil.getEncounterName(16));
        assertEquals("The Manipulator", EncounterUtil.getEncounterName(17));
        assertEquals("Faust", EncounterUtil.getEncounterName(5000));
        assertEquals("Oppressor", EncounterUtil.getEncounterName(18));
        assertEquals("The Cuff of the Father", EncounterUtil.getEncounterName(19));
        assertEquals("Living Liquid", EncounterUtil.getEncounterName(20));
        assertEquals("The Manipulator", EncounterUtil.getEncounterName(21));
        assertEquals("Faust", EncounterUtil.getEncounterName(5001));
        assertEquals("Arachne Eve", EncounterUtil.getEncounterName(2004));
        assertEquals("Forgall", EncounterUtil.getEncounterName(2005));
        assertEquals("Ozma", EncounterUtil.getEncounterName(2006));
        assertEquals("Calofisteri", EncounterUtil.getEncounterName(2007));
        assertEquals("Ratfinx Twinkledinks", EncounterUtil.getEncounterName(22));
        assertEquals("Vortexer", EncounterUtil.getEncounterName(23));
        assertEquals("Quickthinx Allthoughts", EncounterUtil.getEncounterName(24));
        assertEquals("Brute Justice", EncounterUtil.getEncounterName(25));
        assertEquals("Hummelfaust", EncounterUtil.getEncounterName(5002));
        assertEquals("Blaster", EncounterUtil.getEncounterName(5003));
        assertEquals("Brawler", EncounterUtil.getEncounterName(5004));
        assertEquals("Swindler", EncounterUtil.getEncounterName(5005));
        assertEquals("Ratfinx Twinkledinks", EncounterUtil.getEncounterName(26));
        assertEquals("The Cuff of the Son", EncounterUtil.getEncounterName(27));
        assertEquals("Quickthinx Allthoughts", EncounterUtil.getEncounterName(28));
        assertEquals("Brute Justice", EncounterUtil.getEncounterName(29));
        assertEquals("Hummelfaust", EncounterUtil.getEncounterName(5006));
        assertEquals("Refurbisher 0", EncounterUtil.getEncounterName(30));
        assertEquals("Lamebrix Strikebocks", EncounterUtil.getEncounterName(31));
        assertEquals("Cruise Chaser", EncounterUtil.getEncounterName(32));
        assertEquals("Alexander Prime", EncounterUtil.getEncounterName(33));
        assertEquals("Faust Z", EncounterUtil.getEncounterName(5007));
        assertEquals("Refurbisher 0", EncounterUtil.getEncounterName(34));
        assertEquals("Lamebrix Strikebocks", EncounterUtil.getEncounterName(35));
        assertEquals("Cruise Chaser", EncounterUtil.getEncounterName(36));
        assertEquals("Alexander Prime", EncounterUtil.getEncounterName(37));
        assertEquals("Faust Z", EncounterUtil.getEncounterName(5008));
        assertEquals("Ala Mhigo", EncounterUtil.getEncounterName(4510));
        assertEquals("Kugane Castle", EncounterUtil.getEncounterName(4511));
        assertEquals("The Temple of the Fist", EncounterUtil.getEncounterName(4512));
        assertEquals("Susano", EncounterUtil.getEncounterName(1036));
        assertEquals("Lakshimi", EncounterUtil.getEncounterName(1037));
        assertEquals("Alte Roite", EncounterUtil.getEncounterName(38));
        assertEquals("Catastrophe", EncounterUtil.getEncounterName(39));
        assertEquals("Halicarnassus", EncounterUtil.getEncounterName(40));
        assertEquals("Exdeath", EncounterUtil.getEncounterName(41));
        assertEquals("Alte Roite", EncounterUtil.getEncounterName(42));
        assertEquals("Catastrophe", EncounterUtil.getEncounterName(43));
        assertEquals("Halicarnassus", EncounterUtil.getEncounterName(44));
        assertEquals("Exdeath", EncounterUtil.getEncounterName(45));
        assertEquals("Neo Exdeath", EncounterUtil.getEncounterName(46));

        EncounterUtil.getEncounterName(-1);
    }
}
