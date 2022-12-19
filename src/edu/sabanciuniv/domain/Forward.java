package edu.sabanciuniv.domain;

public class Forward extends Player {
    //////////////////////////////////////////////////// ATTRIBUTES
    private String position = "Forward";

    //////////////////////////////////////////////////// CCONSTRUCTORS
    public Forward() {
    }

    public Forward(String firstName, String lastName, int playerNumber, String position) {
        super(firstName, lastName, playerNumber);
        this.position = position;
    }

    public Forward(String firstName, String lastName, int playerNumber, int height, int weight, int age,
            String position) {
        super(firstName, lastName, playerNumber, height, weight, age);
        this.position = position;
    }

    //////////////////////////////////////////////////// METHODS
    // to print infos
    @Override
    public String toString() {
        return "\tForward>>>\t firstName: " + getFirstName() + "\t lastName: " + getLastName() + "\t playerNumber: "
                + getPlayerNumber() + "\t position: " + this.position;
    }

    //////////////////////////////////////////////////// GETTER SETTER
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
