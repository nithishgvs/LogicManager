package org.nithish.logicmanager;

import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class SuvCars extends BillingBaseClass {

	/**
	 * This method calculates Bill for SUV's.This calls super class method
	 * baseCarsBill from BillingBaseClass which takes a parameter offRoad
	 * 
	 * @param date
	 * @param numOfCars
	 * @param offRoad
	 * @return
	 */
	public float suvCarsBill(Date date, int numOfCars, boolean offRoad) {
		
		return super.baseCarsBill(date, numOfCars, offRoad);
	}

	// Fields
	private int numOfCars;
	private Date date;
	private boolean offRoad;

	// Getters and Setters
	public boolean isOffRoad() {
		return offRoad;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}

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
