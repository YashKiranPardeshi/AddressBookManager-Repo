package com.infogalaxy;

import java.util.Scanner;

public class AdderssBook {
    Scanner sc = new Scanner (System.in);
    Contact Contact = new Contact();

    public void getContact(){
        System.out.println("Enter the First Name : ");
        Contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name : ");
        Contact.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        Contact.setAddress(sc.next());
        System.out.println("Enter the City : ");
        Contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        Contact.setState(sc.next());
        System.out.println("Enter the Mobile No :");
        Contact.setMobno(sc.next());
        System.out.println("Enter the Email Id :");
        Contact.setEmail(sc.next());
        System.out.println("Enter the Zip Code : ");
        Contact.setZip(sc.next());
    }
    public void displaycontact(){
        System.out.println(Contact.toString());
    }
    public static void main(String[] args){
        AdderssBook adderssBook = new AdderssBook();
        adderssBook.getContact();
        adderssBook.displaycontact();
    }

};










