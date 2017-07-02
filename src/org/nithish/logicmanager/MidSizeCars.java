package org.nithish.logicmanager;

import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class MidSizeCars extends BillingBaseClass {
	/**
	 * This method calculates Bill for Luxury Cars.This calls super class method
	 * baseCarsBill from BillingBaseClass which is actual case for mid size cars
	 * 
	 * @param date
	 * @param numOfCars
	 * @return
	 */
	public float midSizeCarsBill(Date date, int numOfCars) {
		return super.baseCarsBill(date, numOfCars);
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
