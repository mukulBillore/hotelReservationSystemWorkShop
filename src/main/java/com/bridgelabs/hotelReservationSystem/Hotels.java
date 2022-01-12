package com.bridgelabs.hotelReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotels {
	String hotelName;
	int rating;
	float regularCustomerRate;
	Scanner sc = new Scanner(System.in);
	ArrayList<HotelClassification> hotelList = new ArrayList<HotelClassification>();
	HotelClassification hotel;
	public void addHotel() {
		System.out.println("How many hotels you want to add");
		int numOfHotels = sc.nextInt();
		while(numOfHotels > 0) {
			System.out.println("Enter hotel name:");
			hotelName = sc.next();
			System.out.println("Enter hotel rating:");
			rating = sc.nextInt();
			System.out.println("Enter regular customer rate:");
			regularCustomerRate = sc.nextFloat();
			hotel = new HotelClassification();
			hotelList.add(hotel);
			numOfHotels--;
		}
	}
	public int getHotelListSize() {
		return hotelList.size();
	}
	
	public void printHotelList() {
		System.out.println(hotelList);
	}
}
