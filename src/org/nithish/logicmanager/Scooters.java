package org.nithish.logicmanager;

/**
 * 
 * @author nithishgvs
 *
 */
public class Scooters {
	/**
	 * Scooters have flat rate as my Logic processes order on basis of date this
	 * method returns bill for as many scooters in the order with base scooter
	 * bill
	 * 
	 * @param numOfScooters
	 * @return
	 */
	public float scootersBill(int numOfScooters) {
		return (float) 25 * numOfScooters;
	}
    //Fields
	private int numOfScooters;
	
    //Getters and Setters
	
	public int getNumOfScooters() {
		return numOfScooters;
	}

	public void setNumOfScooters(int numOfScooters) {
		this.numOfScooters = numOfScooters;
	}

}
