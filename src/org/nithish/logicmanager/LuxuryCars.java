package org.nithish.logicmanager;

import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class LuxuryCars extends BillingBaseClass {
	/**
	 * This method calculates Bill for Luxury Cars.This calls super class method
	 * baseCarsBill from BillingBaseClass and charges 2 times to the bill
	 * 
	 * @param date
	 * @param numOfCars
	 * @return
	 */
	public float luxuryCarsBill(Date date, int numOfCars) {
		return (float) (2 * super.baseCarsBill(date, numOfCars));
	}

	// Fields
	private int numOfCars;
	private Date date;

	// Getters and Setters
	public int getNumOfCars() {
		return numOfCars;
	}

	public void setNumOfCars(int numOfCars) {
		this.numOfCars = numOfCars;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
