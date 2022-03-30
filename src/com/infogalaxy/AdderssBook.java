package com.infogalaxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class AdderssBook {
    Contact contact = new Contact();
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

    public void editcontact() {
        System.out.println("Enter the FirstName : ");
        String Fname = sc.next();
        int flag = 0;
        for (int i = 0; i < ContactList.size(); i++) {
            Contact contact = ContactList.get(i);
            if (Fname.equals(contact.getFirstName())) {
                System.out.println("Contact is Found.");
                flag = 1;
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
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Contact is Not Found.");
        }
    }

    public void findState() {
        System.out.println("Enter You Want To Search State Name :");
        String stateName = sc.next();
        for (int i = 0; i < ContactList.size(); i++) {
            Contact contact = ContactList.get(i);
            if (stateName.equals(contact.getState())) {
                System.out.println(contact.getFirstName());
                System.out.println(contact.getMobno());

            }
        }

    }

    public void delete() {
        System.out.println("Enter Delete Name");
        String delete = sc.next();
        for (int i = 0; i < ContactList.size(); i++) {
            Contact contact = ContactList.get(i);
            if (delete.equals(contact.getFirstName())) {
                ContactList.remove(i);
            }
        }
    }
    public void backupToFile(){
        String contactData = null;
        for(int i = 0; i < ContactList . size(); i++){
            Contact contact = ContactList.get(i);
            contactData = contact.getFirstName()+","+contact.getLastName()+","+contact.getAddress()+","+contact.getCity()+","+contact.getState()+","+
                    contact.getMobno()+","+contact.getEmail()+","+contact.getZip()+"\n"+contactData;
        }
        Path file = Paths.get("MYData.txt");
        byte[] filedata = contactData.getBytes();
        try {
            Files.write(file, filedata);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdderssBook adderssBook = new AdderssBook();
        int choice;
        do {
            System.out.println("*** CONTACT INVENTORY MANAGEMENT ***");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. editName \n4. Find State  \n5. delete \n6. BACKUP TO FILE \n7. Exit ");
            System.out.println("ENTER YOUR CHOICE :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adderssBook.getContact();
                    break;
                case 2:
                    adderssBook.displaycontact();
                    break;
                case 3:
                    adderssBook.editcontact();
                    break;
                case 4:
                    adderssBook.findState();
                    break;
                case 5:
                    adderssBook.delete();
                    break;
                case 6:
                    adderssBook.backupToFile();
                    break;
            }
        } while (choice != 6);
    }
}










