package org.opp1;

public class Person {

    //fild--
    private int ID;
    private String firstName;
    private String lastName;
    private String email;

    //--constructor----
    public Person(int ID, String firstName, String lastName, String email) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Person(int id, String johnDoe, String mail) {
        this.ID = id;
        this.firstName = johnDoe;
        this.lastName = mail;
        this.email = mail;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSummary() {
        return "{id: " + ID + ", Firstname: " + firstName +", Lestname: " + lastName+ ", email: " + email + "}";
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}