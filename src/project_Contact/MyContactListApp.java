package project_Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class MyContactListApp {
    /*
    * Menu
    * 1.Create New Contact
    * 2.View All Contact
    * 3.Search Contact
    * 4.Delete Contact
    * 5.Exit
    * Enter Your Choice:
    * */

    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Scanner input = new Scanner(System.in);

        int menuItemNumber;

        do {
            menuView();
            menuItemNumber = input.nextInt();

            switch (menuItemNumber) {
                case 1 -> {
                    Contact contact = creatNewContact(input);
                    contactList.createContact(contact);
                    System.out.println("Successfully Created...");
                    System.out.println();
                }
                case 2 -> showAllContacts(contactList.getContacts());
                case 3 -> searchList(contactList, input);
                case 4 -> deleteContact(contactList, input);
                case 5 -> System.exit(0);
                default -> System.out.println("Please Select a Number Between 1 and 5...");
            }
        }while (true);
    }

    //View Menu Method
    private static void menuView(){
        System.out.println("========================");
        System.out.printf("%5s%3s%n", "1. ", "Create New Contact");
        System.out.printf("%5s%3s%n", "2. ", "View All Contact");
        System.out.printf("%5s%3s%n", "3. ", "Search Contact");
        System.out.printf("%5s%3s%n", "4. ", "Delete Contact");
        System.out.printf("%5s%3s%n", "5. ", "Exit");
        System.out.println("========================");
        System.out.print(" Enter Your Choice: ");
    }

    //Get Input From user and Create a new Contact
    private static Contact creatNewContact(Scanner input){
        String name, email, phoneNo;
        Contact contact;

        input.nextLine();

        System.out.println("Fill The Below Form Correctly");

        System.out.print("Enter Your Name* : ");
        name = input.nextLine();

        System.out.print("Enter Your Phone Number* : ");
        phoneNo = input.nextLine();

        System.out.print("Enter Your Email (Type N if not available) : ");
        email = input.nextLine();

        if (email.equalsIgnoreCase("n")){
            contact = new Contact(name, phoneNo);
        }else {
            contact = new Contact(name, phoneNo, email);
        }

        return contact;
    }

    //Show all contacts method

    private static void showAllContacts(ArrayList<Contact> contacts){
        System.out.println("All Contacts....");
        System.out.println("----------------------");

        int i = 1;
        for (Contact contact : contacts){
            String email = contact.getEmail();
            System.out.printf("%5d%-20s%-15s%-50s%n",i++,  contact.getName(), contact.getPhoneNo(), email == null ? "N/A" : email);
        }
        System.out.println("----------------------");
    }

    //searchList method
    private static void searchList(ContactList contactList, Scanner input ){
        input.nextLine();
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();

        Contact contact = contactList.searchContact(name);

        if ( contact != null){
            String email = contact.getEmail();
            System.out.printf("%-20s%-15s%-50s%n", contact.getName(), contact.getPhoneNo(), email == null ? "N/A" : email);
        }else{
            System.out.println("Contact Not Found");
        }
    }

    //delete contact method
    private static void deleteContact (ContactList contactList, Scanner input){
        showAllContacts(contactList.getContacts());
        System.out.println("Enter Index Number: ");
        int index = input.nextInt();

        contactList.removeContact(index);
        System.out.println("Successfully Removed...");
    }
}
