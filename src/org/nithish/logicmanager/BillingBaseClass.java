package org.nithish.logicmanager;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class BillingBaseClass {

	/**
	 * This method is the base case for generating bill.Therefore this
	 * calculates Midsize cars bill
	 * 
	 * @param date
	 * @param numOfCars
	 * @return
	 */
	public float baseCarsBill(Date date, int numOfCars) {
		float bill = 0;
		int day = getDayOfWeek(date);
		// Premium-25%-Saturday,Friday
		if (day == 6 || day == 7) {
			bill = (float) (30 + (30 * 0.25));
		}
		// Sunday-20% Discount
		else if (day == 1) {
			bill = (float) (30 - (30 * 0.20));
		}
		// Regular Pricing
		else {
			bill = 30;
		}
		return bill * numOfCars;
	}

	/**
	 * This method is the base case for generating bill for SUV's.Therefore this
	 * calculates Midsize cars bill and multiplies 1.5 to its bill.This takes
	 * one more parameter OffRoad and adds bill according to the value
	 * 
	 * @param date
	 * @param numOfCars
	 * @param offRoad
	 * @return
	 */
	public float baseCarsBill(Date date, int numOfCars, boolean offRoad) {
		float bill = (float) (1.5 * baseCarsBill(date, numOfCars));
		if (offRoad) {
			bill = bill + 15;
		}
		return bill;
	}

	/**
	 * This method calculates Bill for Luxury Cars.This calls method
	 * baseCarsBill from BillingBaseClass and adds extra Insurance fee based n
	 * age
	 * 
	 * @param date
	 * @param numOfCars
	 * @param age
	 * @return
	 */
	public float baseCarsBill(Date date, int numOfCars, int age) {
		float bill = baseCarsBill(date, numOfCars);
		if (age >= 18 && age <= 25) {
			bill = bill + 50;
		} else if (age >= 26 && age <= 32) {
			bill = bill + 35;
		} else if (age >= 33 && age < 45) {
			bill = bill + 15;
		} else if (age >= 45) {
			bill = bill + 0;
		}
		return bill;
	}

	/**
	 * This method takes Date as input and returns integer b/w
	 * 1-7(Sunday-Saturday)
	 * 
	 * @param date
	 * @return
	 */
	private static int getDayOfWeek(Date date) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

}
