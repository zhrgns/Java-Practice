package edu.sabanciuniv.domain;

public class Referee {
    //////////////////////////////////////////////////// ATTRIBUTES
    private String firstName;
    private String lastName;
    private String hometown;
    //////////////////////////////////////////////////// CONSTRUCTORS
    public Referee() {
    }

    public Referee(String firstName, String lastName, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hometown = hometown;
    }

    //////////////////////////////////////////////////// METHODS
    public void printRefereeInfo() {
        System.out.println("Referee is \t" + firstName +" "+ lastName + " from " + hometown);
    }

    //////////////////////////////////////////////////// GETTERS AND SETTERS
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}

