package com.bridgelabs.hotelReservationSystem;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello welcome to hotel Reservation system " );
        HotelClassification lakewood = new HotelClassification();
        lakewood.setNameOfHotel("Lakewood");
        lakewood.setRateForRegularCust(110);
        lakewood.setRatingOfHotel(3);
        HotelClassification brigewood = new HotelClassification();
        brigewood.setNameOfHotel("brigewood");
        brigewood.setRateForRegularCust(160);
        brigewood.setRatingOfHotel(4);
        HotelClassification ridgewood = new HotelClassification();
        ridgewood.setNameOfHotel("Lakewood");
        ridgewood.setRateForRegularCust(110);
        ridgewood.setRatingOfHotel(3);
    
    }
}
