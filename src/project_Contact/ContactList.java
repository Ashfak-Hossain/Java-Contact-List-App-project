package project_Contact;

import java.util.ArrayList;

public class ContactList {
    private final ArrayList <Contact> contacts;

    public ContactList(){
        this.contacts = new ArrayList<>();
    }

    public void createContact(Contact contact){
        contacts.add(contact);
    }

    //to count total stored contact
    public int getTotalContact(){
        return contacts.size();
    }
    //remove contact
    public void removeContact (int index){
        contacts.remove(index);
    }
    
    public Contact searchContact(String name){
        for (Contact c : contacts){
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    //view contact
    public ArrayList<Contact> getContacts (){
        return contacts;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contacts=" + contacts +
                '}';
    }
}
