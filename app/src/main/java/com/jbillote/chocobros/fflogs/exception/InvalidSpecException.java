package com.jbillote.chocobros.fflogs.exception;

/**
 * Thrown whenever an invalid spec ID is provided.
 *
 * @author Jeremy Billote
 */
public class InvalidSpecException extends Exception {
    public InvalidSpecException() {
        super("Invalid spec ID");
    }
}
