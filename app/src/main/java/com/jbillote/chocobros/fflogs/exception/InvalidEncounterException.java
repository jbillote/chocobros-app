package com.jbillote.chocobros.fflogs.exception;

/**
 * Created by Jeremy Billote on 9/29/17.
 */

/**
 * Thrown when an invalid encounter ID is given.
 *
 * @author Jeremy Billote
 */
public class InvalidEncounterException extends Exception {

    public InvalidEncounterException() {
        super("Invalid encounter ID");
    }
}
