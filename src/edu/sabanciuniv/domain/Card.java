package edu.sabanciuniv.domain;

public class Card {
    private String cardColor;
    private int cardnumberYellow = 0;
    private int cardnumberRed = 0;

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Card() {
    }

    public Card(String cardColor, int cardnumberYellow, int cardnumberRed) {
        this.cardColor = cardColor;
        this.cardnumberYellow = cardnumberYellow;
        this.cardnumberRed = cardnumberRed;
    }

    //////////////////////////////////////////////////// GETTERS AND SETTERS
    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public int getCardnumberYellow() {
        return cardnumberYellow;
    }

    public void setCardnumberYellow(int cardnumberYellow) {
        this.cardnumberYellow = cardnumberYellow;
    }

    public int getCardnumberRed() {
        return cardnumberRed;
    }

    public void setCardnumberRed(int cardnumberRed) {
        this.cardnumberRed = cardnumberRed;
    }

}
