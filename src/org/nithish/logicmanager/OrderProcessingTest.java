package org.nithish.logicmanager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
/**
 * Test Class to test the Order Processing Logic
 * @author nithishgvs
 *
 */
public class OrderProcessingTest {

	public static void main(String args[]) throws ParseException, DateException {
		OrderDetailsDTO order1 = order1Dto();
		OrderDetailsDTO order2 = order2Dto();
		List<OrderDetailsDTO> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		OrderProcessing or = new OrderProcessing();
		or.prepareBillForOrder(orders);

	}

	private static OrderDetailsDTO order1Dto() {
		OrderDetailsDTO order1 = new OrderDetailsDTO();
		String date = "08/06/2018";
		order1.setOrderDate(date);
		order1.setBicycleOrder(2);
		order1.setEconomyCarsOrder(2);
		order1.setJetskisOrder(3);
		order1.setLimousineOrder(3);
		order1.setLuxuryCarsOrder(3);
		order1.setMidSizeCarsOrder(3);
		order1.setMotorCycleOrder(5);
		order1.setScooterOrder(4);
		order1.setSuvOrder(4);
		order1.setAge(55);
		order1.setPremium(true);
		order1.setOffRoad(true);
		order1.setJetSkiesOrderHours(20);
		return order1;
	}
	private static OrderDetailsDTO order2Dto() {
		OrderDetailsDTO order1 = new OrderDetailsDTO();
		String date = "08/06/2018";
		order1.setOrderDate(date);
		order1.setBicycleOrder(2);
		order1.setEconomyCarsOrder(2);
		order1.setJetskisOrder(3);
		order1.setLimousineOrder(1);
		order1.setLuxuryCarsOrder(3);
		order1.setMidSizeCarsOrder(3);
		order1.setMotorCycleOrder(5);
		order1.setScooterOrder(6);
		order1.setSuvOrder(0);
		order1.setAge(21);
		order1.setPremium(true);
		order1.setOffRoad(true);
		order1.setJetSkiesOrderHours(20);
		return order1;
	}
	private static OrderDetailsDTO setInputOrderDTOBadDate() {
		OrderDetailsDTO order1 = new OrderDetailsDTO();
		String date = "08/06/2016";
		order1.setOrderDate(date);
		order1.setBicycleOrder(2);
		order1.setEconomyCarsOrder(2);
		order1.setJetskisOrder(3);
		order1.setLimousineOrder(1);
		order1.setLuxuryCarsOrder(3);
		order1.setMidSizeCarsOrder(3);
		order1.setMotorCycleOrder(5);
		order1.setScooterOrder(6);
		order1.setSuvOrder(0);
		order1.setAge(21);
		order1.setPremium(true);
		order1.setOffRoad(true);
		order1.setJetSkiesOrderHours(20);
		return order1;
	}

}
