package project_Contact;

public class Tester {
    //Contact List App
    //we can create list of contact
    //view contact
    //search contact
    //delete contact
    //name, email, phone no
    //contact array
    //Insert, search and delete

    public static void main(String[] args) {

        Contact contact = new Contact("Evan", "01000000000");
        Contact contact1 = new Contact("Ammu", "01999999999", "test@gmail.com");

        ContactList contactList = new ContactList();

        contactList.createContact(contact);
        contactList.createContact(contact1);

        //contactList.removeContact(0);

        System.out.println(contactList.getTotalContact());
        System.out.println(contactList);

        Contact searchContact = contactList.searchContact("evan");
        if (searchContact != null) {
            System.out.println(searchContact);
        }else {
            System.out.println("Contact Not Found");
        }

    }

}
