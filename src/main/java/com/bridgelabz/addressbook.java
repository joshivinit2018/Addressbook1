package com.bridgelabz;

import java.util.Scanner;

public class addressbook {
    private String first_name;
    private String last_name;
    private int House_no;
    private String city;
    private String state;
    private int pin_code;
    private String phone_number;
    private String email;

    public addressbook(String first_name, String last_name, int House_no, String city, String state, int pin_code, String phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.House_no = House_no;
        this.city = city;
        this.state = state;
        this.pin_code = pin_code;
        this.phone_number = phone_number;
        this.email = email;
    }

    public addressbook() {

    }

    public void Person() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String first_name = input.next();
        System.out.println("Enter your Last Name");
        String last_name = input.next();
        System.out.println("Enter your House number");
        String house_no = input.next();
        System.out.println("Enter your City name");
        String city = input.next();
        System.out.println("Enter your State name");
        String state = input.next();
        System.out.println("Enter your Pin Code");
        String pin_code = input.next();
        System.out.println("Enter your Phone number");
        String phone_number = input.next();
        System.out.println("Enter your e-mail address");
        String email = input.next();
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("House Number: " + house_no);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Pin Code: " + pin_code);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("E-Mail: " + email);
    }


    public static void main(String[] args) {
        System.out.println("WELCOME to Address Book Program");
        addressbook entry = new addressbook("Vinit", "Joshi", 102, "kapshi", "maharashtra", 416218, "5465651463", "joshivinit@gmail.com");
        System.out.println("First name: " + entry.first_name);
        System.out.println("Last name: " + entry.last_name);
        System.out.println("House number: " + entry.House_no);
        System.out.println("City: " + entry.city);
        System.out.println("State: " + entry.state);
        System.out.println("Pin code: " + entry.pin_code);
        System.out.println("Phone number: " + entry.phone_number);
        System.out.println("E-Mail: " + entry.email);
        addressbook contact = new addressbook();
        contact.Person();
    }
}
