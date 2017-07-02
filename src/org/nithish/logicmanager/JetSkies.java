package org.nithish.logicmanager;

/**
 * 
 * @author nithishgvs
 *
 */
public class JetSkies {
	/**
	 * This method takes input of number of hours booking for Jetskies and num
	 * of skies in the order to generate the bill
	 * 
	 * @param hours
	 * @param numOfSkies
	 * @return
	 */
	public float jetSkiesBill(int hours, int numOfSkies) {
		return hours * numOfSkies * 25;
	}

	// Fields
	private int numOfSkies;
	private int hours;

	// Setters and Getters
	public int getNumOfSkies() {
		return numOfSkies;
	}

	public void setNumOfSkies(int numOfSkies) {
		this.numOfSkies = numOfSkies;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
