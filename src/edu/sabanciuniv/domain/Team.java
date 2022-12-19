package edu.sabanciuniv.domain;

import java.util.ArrayList;

public class Team {
    //////////////////////////////////////////////////// ATTRIBUTES
    private String countryName;
    private String manager;
    private ArrayList<Player> clubPlayers = new ArrayList<>();

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Team() {
    }

    public Team(String countryName, String manager) {
        this.countryName = countryName;
        this.manager = manager;
    }

    //////////////////////////////////////////////////// METHODS
    public void printTeamInfo() {
        System.out.println("\t" + countryName + "\n");
        System.out.println("Manager: " + manager);
        for (Player player : clubPlayers) {
            System.out.println(player.toString());
        }
    }

    public void addTeamPlayer(String firstName, String lastName, int playerNumber) {
        Player player = new Player(firstName, lastName, playerNumber);
        clubPlayers.add(player);
    }

    public void addGoalkeeper(String firstName, String lastName, int playerNumber, String position) {
        GoalKeeper goalKeeper = new GoalKeeper(firstName, lastName, playerNumber, position);
        clubPlayers.add(goalKeeper);
    }

    public void addForwardPlayer(String firstName, String lastName, int playerNumber, String position) {
        Forward forward = new Forward(firstName, lastName, playerNumber, position);
        clubPlayers.add(forward);
    }

    public void addDefenderPlayer(String firstName, String lastName, int playerNumber, String position) {
        Defender defender = new Defender(firstName, lastName, playerNumber, position);
        clubPlayers.add(defender);
    }

    //////////////////////////////////////////////////// GETTERS AND SETTERS

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ArrayList<Player> getClubPlayers() {
        return clubPlayers;
    }

    public void setClubPlayers(ArrayList<Player> clubPlayers) {
        this.clubPlayers = clubPlayers;
    }

}
