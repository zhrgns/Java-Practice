package edu.sabanciuniv.domain;

public class Ball {
    //////////////////////////////////////////////////// ATTRIBUTES
    private String brand;
    private String color;

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Ball() {
    }

    public Ball(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //////////////////////////////////////////////////// GETTERS and SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
