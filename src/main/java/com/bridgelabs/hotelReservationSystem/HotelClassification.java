package com.bridgelabs.hotelReservationSystem;

public class HotelClassification {
private String nameOfHotel ;
private int  ratingOfHotel;
private float rateForRegularCust;
public String getNameOfHotel() {
	return nameOfHotel;
}
public void setNameOfHotel(String nameOfHotel) {
	this.nameOfHotel = nameOfHotel;
}
public int getRatingOfHotel() {
	return ratingOfHotel;
}
public void setRatingOfHotel(int ratingOfHotel) {
	this.ratingOfHotel = ratingOfHotel;
}
public float getRateForRegularCust() {
	return rateForRegularCust;
}
public void setRateForRegularCust(float rateForRegularCust) {
	this.rateForRegularCust = rateForRegularCust;
}
@Override
public String toString() {
	return "HotelClassification [nameOfHotel=" + nameOfHotel + ", ratingOfHotel=" + ratingOfHotel
			+ ", rateForRegularCust=" + rateForRegularCust + "]";
}


}
