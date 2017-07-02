package org.nithish.logicmanager;
/**
 * 
 * @author nithishgvs
 *
 */
public class Bicycles {
	/**
	 * This method calculates bill for Bicycles and deducts one bicycle bill if
	 * order has a SUV
	 * 
	 * @param ifSUV
	 * @param numOfBicycles
	 * @return
	 */
	public float bicyclesBill(boolean ifSUV, int numOfBicycles) {
		float bill = 0;
		if (ifSUV) {
			bill = 0;
			numOfBicycles = numOfBicycles - 1;
			System.out.println("SUV order gives you one Free bicyle");
		}
		bill = bill + numOfBicycles * 10;
		return bill;
	}

	// Fields
	private int numOfBicycles;
	private boolean ifSUV;

	// Getters and Setters
	public int getNumOfBicycles() {
		return numOfBicycles;
	}

	public void setNumOfBicycles(int numOfBicycles) {
		this.numOfBicycles = numOfBicycles;
	}

	public boolean isIfSUV() {
		return ifSUV;
	}

	public void setIfSUV(boolean ifSUV) {
		this.ifSUV = ifSUV;
	}

}
