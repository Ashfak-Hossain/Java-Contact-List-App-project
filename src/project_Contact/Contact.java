package project_Contact;

public class Contact {
    //properties
    private final String name;
    private final String phoneNo;
    private final String email;

    //Constructor
    public Contact(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = null;
    }
    public Contact(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    //Override method
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
