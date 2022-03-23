package com.infogalaxy;

import java.util.ArrayList;
import java.util.Scanner;
public class AdderssBook {
    ArrayList<Contact> ContactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void getContact() {
        Contact contact = new Contact();
        System.out.println("Enter the First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        System.out.println("Enter the Mobile No :");
        contact.setMobno(sc.next());
        System.out.println("Enter the Email Id :");
        contact.setEmail(sc.next());
        System.out.println("Enter the Zip Code : ");
        contact.setZip(sc.next());
        ContactList.add(contact);
    }

    public void displaycontact() {
        for (int i = 0; i < ContactList.size(); i++) {
            Contact contact = ContactList.get(i);
            System.out.println(contact.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdderssBook adderssBook = new AdderssBook();
        int choice;
        do {
            System.out.println("*** CONTACT INVENTORY MANAGEMENT ***");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EXIT ");
            System.out.println("ENTER YOUR CHOICE :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adderssBook.getContact();
                    break;
                case 2:
                    adderssBook.displaycontact();
                    break;
            }
        } while (choice != 3);
    }
}










