package edu.sabanciuniv.domain;

public class Stadium {
    //////////////////////////////////////////////////// ATTRIBUTES
    private String nameStadium;

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Stadium() {
    }

    public Stadium(String nameStadium) {
        this.nameStadium = nameStadium;
    }

    //////////////////////////////////////////////////// METHODS
    public void printStadiumInfo() {
        System.out.println("Stadium is \t" + nameStadium);
    }

    //////////////////////////////////////////////////// GETTERS AND SETTERS
    public String getnameStadium() {
        return nameStadium;
    }

    public void setnameStadium(String nameStadium) {
        this.nameStadium = nameStadium;
    }
}
