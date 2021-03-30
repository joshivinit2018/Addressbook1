package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class addressbook {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final int zip;
    private final String phone;
    private final String email;

    public addressbook(String firstName, String lastName, String address, String city,
                       String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "\tFirst Name: " + firstName + "\n\tLast Name: " + lastName + "\n\tAddress: " +
                address + "\n\tCity: " + city + "\n\tState: " + state + "\n\tZIP: " + zip +
                "\n\tPhone: " + phone + "\n\temail: " + email;
    }

    public static String[] main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array Declaration
        addressbook[] content = new addressbook[1];
        //Instance variables
        int entries, zip;
        String first, last, address, city, state, phone, email, choice;

        //Asking User for 1 or more Entries
        System.out.println("How many new Entries do you require in AddressBook: ");
        entries = sc.nextInt();
        // Initialising Array
        if ( entries > 0)
            content = new addressbook[entries];
        else {
            System.out.println("Must Create atleast 1 Entry");
            System.exit(0);
        }

        System.out.println("\t*****Address Book*****\t");
        for ( int i = 0 ; i < entries ; i++ ) {
            System.out.println("Entry: "+(i+1));
            System.out.print("First name? ");
            first = sc.next();
            System.out.print("Last name? ");
            last = sc.next();
            System.out.print("Address? ");
            address = sc.next();
            System.out.print("City? ");
            city = sc.next();
            System.out.print("State? ");
            state = sc.next();
            System.out.print("ZIP? ");
            zip = sc.nextInt();
            System.out.print("Phone? ");
            phone = sc.next();
            System.out.print("Email? ");
            email = sc.next();
            content[i] = new addressbook(first, last, address, city, state, zip, phone, email);
        }

        for ( int i = 0 ; i < entries ; i++ ) {
            System.out.println("\t*****Address Book*****\t");
            System.out.println("Entry: "+(i+1));
            System.out.println(content[i]);
        }



        System.out.println("Do you want to edit any Entries u just created? (y/n)");
        choice = sc.next();
        if (choice.equals("Y") || choice.equals("y")) {
            String name;
            System.out.println("Please enter the first name of Person u want to edit: ");
            name = sc.next();
            for (int i = 0; i < entries; i++) {
                if (Objects.equals(content[i].firstName, name)) {
                    System.out.print("First name? ");
                    first = sc.next();
                    System.out.print("Last name? ");
                    last = sc.next();
                    System.out.print("Address? ");
                    address = sc.next();
                    System.out.print("City? ");
                    city = sc.next();
                    System.out.print("State? ");
                    state = sc.next();
                    System.out.print("ZIP? ");
                    zip = sc.nextInt();
                    System.out.print("Phone? ");
                    phone = sc.next();
                    System.out.print("Email? ");
                    email = sc.next();
                    content[i] = new addressbook(first, last, address, city, state, zip, phone, email);
                } else
                    System.out.println("Person Not found at Entry " + (i + 1) + " with Person FirstName: " + name);
            }
            for (int i = 0; i < entries; i++) {
                System.out.println("\t*****Address Book*****\t");
                System.out.println("(Edited)Entry: " + (i + 1));
                System.out.println(content[i]);
            }
        }
        else
            System.out.println("Thank You!!");

        System.out.println("Do you want to delete any Entries u just created? (y/n)");
        choice = sc.next();
        if (choice.equals("Y") || choice.equals("y")) {
            addressbook[] removedArray = new addressbook[content.length-1];
            String name;
            System.out.println("Please enter the first name of Person u want to edit: ");
            name = sc.next();
            for (int i = 0, k=0; i < entries; i++) {
                if (Objects.equals(content[i].firstName, name)) {
                    continue;
                }
                removedArray[k++] = content[i];
            }
            entries = entries-1;
            System.arraycopy(removedArray, 0, content, 0, entries);
            for (int i = 0; i < entries; i++) {
                System.out.println("\t*****Address Book*****\t");
                System.out.println("Entry: " + (i + 1));
                System.out.println(content[i]);
            }
        }
        else
            System.out.println("******Thank You******");
    }




        public String[] Person() {
            Scanner input = new Scanner(System.in);
            String[] contact = new String[8];
            System.out.println("Enter your First Name");
            String first_name = input.next();
            contact[0] = first_name;
            System.out.println("Enter your Last Name");
            String last_name = input.next();
            contact[1] = last_name;
            System.out.println("Enter your House number");
            String house_no = input.next();
            contact[2] = house_no;
            System.out.println("Enter your City name");
            String city = input.next();
            contact[3] = city;
            System.out.println("Enter your State name");
            String state = input.next();
            contact[4] = state;
            System.out.println("Enter your Pin Code");
            String pin_code = input.next();
            contact[5] = pin_code;
            System.out.println("Enter your Phone number");
            String phone_number = input.next();
            contact[6] = phone_number;
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
            contact[7] = email;
            return contact;

        }

        public void edit(String[] contact) {
            System.out.println("If you want to edit then press 1 else press 0");//yso sysout  ctr+Space
            Scanner sc = new Scanner(System.in);
            int read = sc.nextInt();
            if (read == 1) {
                System.out.println("Press the respective number you want to edit\n1  First Name\n2 Last Name\n3 House no.\n4 City\n5 State\n6 Pin Code\n7 phone number\n8 email");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Enter your new First Name");
                        String newFirstName = sc.next();
                        contact[0] = newFirstName;
                        break;
                    case 2:
                        System.out.println("Enter your new Last Name");
                        String newLastName = sc.next();
                        contact[1] = newLastName;
                        break;
                    case 3:
                        System.out.println("Enter your new House Number");
                        String newHouseNumber = sc.next();
                        contact[2] = newHouseNumber;
                        break;
                    case 4:
                        System.out.println("Enter your new City");
                        String newCity = sc.next();
                        contact[3] = newCity;
                        break;
                    case 5:
                        System.out.println("Enter your new State");
                        String newState = sc.next();
                        contact[4] = newState;
                        break;
                    case 6:
                        System.out.println("Enter your new Pin Code");
                        String newPinCode = sc.next();
                        contact[5] = newPinCode;
                        break;
                    case 7:
                        System.out.println("Enter your new Phone number");
                        String newPhoneNumber = sc.next();
                        contact[6] = newPhoneNumber;
                        break;
                    case 8:
                        System.out.println("Enter your new email");
                        String newEmail = sc.next();
                        contact[7] = newEmail;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println("Your new details are as follows");
                for (int j = 0; j < contact.length; j++) {
                    System.out.println(contact[j]);
                }
            }
            else if (read == 0) {
                for (int j = 0; j < contact.length; j++) {
                    System.out.println(contact[j]);
                }

            }
            else
                System.out.println("Invalid Input");
        }

    public void delete(String[] contact) {
        System.out.println("Enter the first name of the contact you want to delete");
        Scanner sc = new Scanner(System.in);
        String person_name = sc.next();
        if (contact[0].equals(person_name)) {
            for (int j = 0; j < contact.length; j++) {
                contact[j] = " ";
                System.out.println(contact[j]);
            }
            System.out.println("Your contact has been deleted");
        }
        else {
            System.out.println("Contact name not available");
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("WELCOME to Address Book Program");
            addressbook contact = new addressbook();
            contact.Person();

            String[] info = contact.Person();
            contact.edit(info);
            System.out.println("Type the following numbers if you want to perform the corresponding action");
            System.out.println("1. EDIT\n2. DELETE\n3. NONE");
            int action = sc.nextInt();
            switch(action) {
                case 1:
                    contact.edit(info);
                    break;
                case 2:
                    contact.delete(info);
                    break;
            }
            System.out.println("******THANK YOU******");
        }

}
