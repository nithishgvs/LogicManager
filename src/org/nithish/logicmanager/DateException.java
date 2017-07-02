package org.nithish.logicmanager;

@SuppressWarnings("serial")
/**
 * Custom Exception class which will be thrown if Date given in the order is
 * invalid
 * 
 * @author nithishgvs
 *
 */
public class DateException extends Exception {
	public DateException(String message) {
		super(message);
	}

}
