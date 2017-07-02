package org.nithish.logicmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author nithishgvs
 *
 */
public class OrderProcessing {

	/**
	 * Api method to check if user puts valid date for the order
	 * 
	 * @param orderDate
	 * @throws ParseException
	 * @throws DateException
	 */
	public void vaildDateReceived(String orderDate) throws ParseException, DateException {
		Date currentDate = new Date();

		try {
			Date start = dateFormatterCurrentDate(currentDate.toString());
			Date end = dateFormatterInputDate(orderDate);
			if (start.compareTo(end) > 0) {
				throw new DateException("Order Date:" + orderDate);
			}
		} catch (DateException ex) {
			System.out.println("Order cant proceed.Please select a valid Date, " + ex.getMessage());
			System.exit(0);
		}

	}

	/**
	 * Processing method which takes list of orders from Customer and generates
	 * the bill
	 * 
	 * @param ordersDTO
	 * @throws ParseException
	 * @throws DateException
	 */
	@SuppressWarnings("deprecation")
	public void prepareBillForOrder(List<OrderDetailsDTO> ordersDTO) throws ParseException, DateException {
		float totalBill = 0;
		for (OrderDetailsDTO dto : ordersDTO) {
			String orderDate = dto.getOrderDate();
			if (orderDate != null) {
				vaildDateReceived(orderDate);
			} else {
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
				SuvCars suvCars = new SuvCars();
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
		System.out.print("Total Bill for your Order: $");
		System.out.printf("%.2f", totalBill);
	}

	@SuppressWarnings({ "unused", "deprecation" })
	/**
	 * Method to format Dates received from the order
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private Date dateFormatterCurrentDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
		Date currentdate = sdf.parse(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd,yyyy");
		return new Date(sdf2.format(currentdate));
	}

	@SuppressWarnings({ "unused", "deprecation" })
	/**
	 * Method to format Dates received from the order
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private Date dateFormatterInputDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date currentdate = sdf.parse(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd,yyyy");
		return new Date(sdf2.format(currentdate));
	}

}
