package org.nithish.logicmanager;

import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class MotorCycles extends BillingBaseClass {
	/**
	 * This method calculates Bill for Luxury Cars.This calls super class method
	 * baseCarsBill from BillingBaseClass which has extra age parameter
	 * 
	 * @param date
	 * @param numOfCars
	 * @param age
	 * @return
	 */
	public float motorCyclesBill(Date date, int numOfCars, int age) {
		float bill = super.baseCarsBill(date, numOfCars, age);
		return bill;
	}

	// Fields
	private int numOfMotorCycles;
	private int age;
	private Date date;

	// Getters and Setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumOfMotorCycles() {
		return numOfMotorCycles;
	}

	public void setNumOfMotorCycles(int numOfMotorCycles) {
		this.numOfMotorCycles = numOfMotorCycles;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
