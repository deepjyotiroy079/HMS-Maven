package com.hexaware.util;

import java.util.Scanner;

import com.hexaware.model.Hotel;

/**
 * CliMain
 */
public class CliMain {
    private static Scanner sc = new Scanner(System.in);

    private void mainMenu() throws Exception {
        System.out.println("----------------------------------");
        System.out.println("Welcome to Hotel Management System");
        System.out.println("----------------------------------");
        System.out.println("1. View Hotel Details.");
        System.out.println("2. List all the Hotel Details");
        System.out.println("3. Exit.");
        System.out.println("Enter your choice : ");
        final int choice = sc.nextInt();
        mainMenuDetail(choice);
    }

    private void mainMenuDetail(int choice) throws Exception {
        switch (choice) {
            case 1:
                viewHotelDetails(); 
                break;
            case 2:
                listAllHotelDetails(); 
                break;
            case 3:
                Runtime.getRuntime().halt(0);
            default:
                System.out.println("Please choose a corrent option!");
                break;
        }
        mainMenu();
    }

    private void listAllHotelDetails() {
        Hotel[] hotels = Hotel.listAllHotelDetails();
        for(Hotel hotel : hotels) {
            System.out.println("-------------");
            System.out.println("Hotel Details");
            System.out.println("-------------");
            System.out.println("Hotel ID : "+hotel.getHotelId());
            System.out.println("Hotel Name : "+hotel.getHotelName());
            System.out.println("Hotel City : "+hotel.getHotelCity());
            System.out.println("Hotel State : "+hotel.getHotelState());
            System.out.println("Hotel Zip : "+hotel.getHotelZip());
            System.out.println("------------------------------------");
        }
    }

    private void viewHotelDetails() {
        System.out.println("Enter the hotel id : ");
        int hotelId = sc.nextInt();
        Hotel hotel = Hotel.listHotelById(hotelId);
        if(hotel == null) {
            System.out.println("No Hotel found.");
        } else {
            System.out.println("-------------");
            System.out.println("Hotel Details");
            System.out.println("-------------");
            System.out.println("Hotel ID : "+hotel.getHotelId());
            System.out.println("Hotel Name : "+hotel.getHotelName());
            System.out.println("Hotel City : "+hotel.getHotelCity());
            System.out.println("Hotel State : "+hotel.getHotelState());
            System.out.println("Hotel Zip : "+hotel.getHotelZip());
            System.out.println("------------------------------------");
        }
    }

    public static void main(final String[] args) throws Exception {
        final CliMain cliMain = new CliMain();
        cliMain.mainMenu();
    }
}