package org.nithish.logicmanager;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author nithishgvs
 *
 */
public class Limousines {
	/**
	 * This method calculates Limousines bill
	 * 
	 * @param premium
	 * @param numOfLimousines
	 * @param date
	 * @return
	 */
	public float LimousineBill(boolean premium, int numOfLimousines, Date date) {
		float bill = 0;
		int day = getDayOfWeek(date);
		// Friday,Saturday->regular price plus premium,premium-40%
		if (day == 6 || day == 7) {
			bill = LimousineBill(premium);
			bill = (float) (bill + (0.4 * bill));
		}
		// Sunday Flat Rate
		else if (day == 1) {
			bill = 100;
		}
		// Monday-Thursday-Regular+premium
		else {
			bill = LimousineBill(premium);
		}
		return numOfLimousines * bill;
	}

	/**
	 * This method calculates per Limousine Bill b/w Monday-Thursday
	 * 
	 * @param premium
	 * @return
	 */
	private float LimousineBill(boolean premium) {
		float bill;
		bill = 100 + 150;
		if (premium) {
			bill = bill + 75;
		}
		return bill;
	}

	// Fields
	private Date date;
	private int numOfLimousines;
	private boolean premium;

	// Setters and Getters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumOfLimousines() {
		return numOfLimousines;
	}

	public void setNumOfLimousines(int numOfLimousines) {
		this.numOfLimousines = numOfLimousines;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	/**
	 * This method takes Date as input and returns integer b/w
	 * 1-7(Sunday-Saturday)
	 * 
	 * @param date
	 * @return
	 */
	private int getDayOfWeek(Date date) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

}
