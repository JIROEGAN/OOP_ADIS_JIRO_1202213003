public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phonenumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
public void register () {
    System.out.println("Register Success!");
    System.out.println("Name: "+ name);
    System.out.println("Phone Number: "+ phonenumber);
}
}
