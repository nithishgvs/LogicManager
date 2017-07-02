package org.nithish.logicmanager;

/**
 * 
 * @author nithishgvs
 *
 */
public class OrderDetailsDTO {

	// Fields
	private String orderDate;
	private int midSizeCarsOrder;
	private int economyCarsOrder;
	private int luxuryCarsOrder;
	private int suvOrder;
	private int bicycleOrder;
	private int motorCycleOrder;
	private int scooterOrder;
	private int jetskisOrder;
	private int jetSkiesOrderHours;
	private int limousineOrder;
	private boolean premium;
	private int age;
	private boolean offRoad;

	// Setters and Getters
	public int getJetSkiesOrderHours() {
		return jetSkiesOrderHours;
	}

	public void setJetSkiesOrderHours(int jetSkiesOrderHours) {
		this.jetSkiesOrderHours = jetSkiesOrderHours;
	}

	public boolean isPremium() {
		return premium;
	}

	public int getAge() {
		return age;
	}

	public boolean isOffRoad() {
		return offRoad;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public int getMidSizeCarsOrder() {
		return midSizeCarsOrder;
	}

	public int getEconomyCarsOrder() {
		return economyCarsOrder;
	}

	public int getLuxuryCarsOrder() {
		return luxuryCarsOrder;
	}

	public int getSuvOrder() {
		return suvOrder;
	}

	public int getBicycleOrder() {
		return bicycleOrder;
	}

	public int getMotorCycleOrder() {
		return motorCycleOrder;
	}

	public int getScooterOrder() {
		return scooterOrder;
	}

	public int getJetskisOrder() {
		return jetskisOrder;
	}

	public int getLimousineOrder() {
		return limousineOrder;
	}

	public void setMidSizeCarsOrder(int midSizeCarsOrder) {
		this.midSizeCarsOrder = midSizeCarsOrder;
	}

	public void setEconomyCarsOrder(int economyCarsOrder) {
		this.economyCarsOrder = economyCarsOrder;
	}

	public void setLuxuryCarsOrder(int luxuryCarsOrder) {
		this.luxuryCarsOrder = luxuryCarsOrder;
	}

	public void setSuvOrder(int suvOrder) {
		this.suvOrder = suvOrder;
	}

	public void setBicycleOrder(int bicycleOrder) {
		this.bicycleOrder = bicycleOrder;
	}

	public void setMotorCycleOrder(int motorCycleOrder) {
		this.motorCycleOrder = motorCycleOrder;
	}

	public void setScooterOrder(int scooterOrder) {
		this.scooterOrder = scooterOrder;
	}

	public void setJetskisOrder(int jetskisOrder) {
		this.jetskisOrder = jetskisOrder;
	}

	public void setLimousineOrder(int limousineOrder) {
		this.limousineOrder = limousineOrder;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}
}
