package edu.sabanciuniv.domain;

public class Player {

    //////////////////////////////////////////////////// ATTRIBUTES
    private String firstName;
    private String lastName;
    private int playerNumber;
    private int height;
    private int weight;
    private int age;

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Player() {
    }

    public Player(String firstName, String lastName, int playerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNumber = playerNumber;
    }

    public Player(String firstName, String lastName, int playerNumber, int height, int weight, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNumber = playerNumber;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    // to print infos
    @Override
    public String toString() {
        return "\tPlayer>>>\t firstName: " + firstName + "\t lastName: " + lastName + "\t playerNumber: " + playerNumber;
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

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
