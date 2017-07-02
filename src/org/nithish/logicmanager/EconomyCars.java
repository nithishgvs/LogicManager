package org.nithish.logicmanager;

import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class EconomyCars extends BillingBaseClass {

	/**
	 * This method calculates Bill for Economy Cars.This calls super class
	 * method baseCarsBill from BillingBaseClass and deducts 50% from its bill
	 * 
	 * @param date
	 * @param numOfCars
	 * @return
	 */
	public float economyCarsBill(Date date, int numOfCars) {
		return (float) (0.5 * super.baseCarsBill(date, numOfCars));
	}

	// Fields
	private int numOfCars;
	private Date date;

	// Setters and Getters
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
