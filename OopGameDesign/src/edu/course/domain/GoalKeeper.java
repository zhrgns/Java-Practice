package edu.sabanciuniv.domain;

public class GoalKeeper extends Player {
    private String position = "Goalkeeper";

    public GoalKeeper() {
    }

    public GoalKeeper(String firstName, String lastName, int playerNumber, String position) {
        super(firstName, lastName, playerNumber);
        this.position = position;
    }

    public GoalKeeper(String firstName, String lastName, int playerNumber, int height, int weight, int age,
            String position) {
        super(firstName, lastName, playerNumber, height, weight, age);
        this.position = position;
    }

    // to print goslkeeper infos
    @Override
    public String toString() {
        return "\tGoalKeeper>>>\t firstName: " + getFirstName() + "\t lastName: " + getLastName() + "\t playerNumber: "
                + getPlayerNumber() + "\t position: " + this.position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
