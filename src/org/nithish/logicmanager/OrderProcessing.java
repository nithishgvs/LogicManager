package org.nithish.logicmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderProcessing {

	public void vaildDateReceived(String orderDate) throws ParseException, DateException {
		Date currentDate = new Date();

		try {
			Date start = dateFormatter(currentDate.toString());
			Date end = dateFormatter(orderDate);
			if (start.compareTo(end) > 0) {
				throw new DateException("Order Date:" + orderDate);
			}
		} catch (DateException e) {
			System.out.println("Order cant proceed.Please select a valid Date, " + e.getMessage());
			System.exit(0);
		}

	}

	@SuppressWarnings("deprecation")
	public void prepareBillForOrder(List<OrderDetailsDTO> ordersDTO) throws ParseException, DateException {
		float totalBill = 0;
		for (OrderDetailsDTO dto : ordersDTO) {
			String orderDate = dto.getOrderDate();
			if (orderDate != null) {
				vaildDateReceived(orderDate);
			}else{
				System.out.println("Order can't be processed without Date.");
				System.exit(0);
			}
			if (dto.getMidSizeCarsOrder() > 0) {
				MidSizeCars midSizecars = new MidSizeCars();
				totalBill = totalBill + midSizecars.midSizeCarsBill(new Date(orderDate), dto.getMidSizeCarsOrder());
			}
			if (dto.getEconomyCarsOrder() > 0) {
				EconomyCars econCars = new EconomyCars();
				totalBill = totalBill + econCars.economyCarsBill(new Date(orderDate), dto.getEconomyCarsOrder());
			}
			if (dto.getSuvOrder() > 0) {
				SUVCars suvCars = new SUVCars();
				totalBill = totalBill + suvCars.suvCarsBill(new Date(orderDate), dto.getSuvOrder(), dto.isOffRoad());
			}
			if (dto.getLuxuryCarsOrder() > 0) {
				LuxuryCars luxuryCars = new LuxuryCars();
				totalBill = totalBill + luxuryCars.luxuryCarsBill(new Date(orderDate), dto.getLuxuryCarsOrder());
			}
			if (dto.getLimousineOrder() > 0) {
				Limousines limousines = new Limousines();
				totalBill = totalBill
						+ limousines.LimousineBill(dto.isPremium(), dto.getLimousineOrder(), new Date(orderDate));
			}
			if (dto.getBicycleOrder() > 0) {
				Bicycles bicycles = new Bicycles();
				totalBill = totalBill
						+ bicycles.bicyclesBill(dto.getSuvOrder() > 0 ? true : false, dto.getBicycleOrder());
			}
			if (dto.getScooterOrder() > 0) {
				Scooters scooters = new Scooters();
				totalBill = totalBill + scooters.scootersBill(dto.getScooterOrder());
			}
			if (dto.getMotorCycleOrder() > 0) {
				MotorCycles motorCycles = new MotorCycles();
				totalBill = totalBill
						+ motorCycles.motorCyclesBill(new Date(orderDate), dto.getMotorCycleOrder(), dto.getAge());
			}
			if (dto.getJetskisOrder() > 0 && dto.getJetSkiesOrderHours() > 0) {
				JetSkies jetskies = new JetSkies();
				totalBill = totalBill + jetskies.jetSkiesBill(dto.getJetSkiesOrderHours(), dto.getJetskisOrder());
			}
		}
		System.out.println("TotalBill:" + totalBill);
	}

	public static void main(String args[]) throws ParseException, DateException {
		Date day = new Date("2016/06/29");
		OrderDetailsDTO order1 = new OrderDetailsDTO();
		Date date = new Date("08/06/2018");
		// String dateOrder = dateFormatter(date);
		order1.setOrderDate(date.toString());
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
		List<OrderDetailsDTO> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order1);
		OrderProcessing or = new OrderProcessing();
		or.prepareBillForOrder(orders);

	}

	@SuppressWarnings({ "unused", "deprecation" })
	private static Date dateFormatter(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
		Date currentdate = sdf.parse(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
		return new Date(sdf2.format(currentdate));
	}

}
