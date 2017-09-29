package com.jbillote.chocobros.fflogs.util;

import com.jbillote.chocobros.fflogs.exception.InvalidSpecException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jeremy Billote on 9/29/17.
 */

public class ClassUtilTest {

    @Test(expected = InvalidSpecException.class)
    public void getClassTest() throws InvalidSpecException {
        assertEquals("Astrologian", ClassUtil.getClass(1));
        assertEquals("Bard", ClassUtil.getClass(2));
        assertEquals("Black Mage", ClassUtil.getClass(3));
        assertEquals("Dark Knight", ClassUtil.getClass(4));
        assertEquals("Dragoon", ClassUtil.getClass(5));
        assertEquals("Machinist", ClassUtil.getClass(6));
        assertEquals("Monk", ClassUtil.getClass(7));
        assertEquals("Ninja", ClassUtil.getClass(8));
        assertEquals("Paladin", ClassUtil.getClass(9));
        assertEquals("Scholar", ClassUtil.getClass(10));
        assertEquals("Summoner", ClassUtil.getClass(11));
        assertEquals("Warrior", ClassUtil.getClass(12));
        assertEquals("White Mage", ClassUtil.getClass(13));
        assertEquals("Red Mage", ClassUtil.getClass(14));
        assertEquals("Samurai", ClassUtil.getClass(15));
        ClassUtil.getClass(16);
        ClassUtil.getClass(-1);
        ClassUtil.getClass(0);
    }
}
