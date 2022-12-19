package edu.sabanciuniv.domain;

public class Match {
    //////////////////////////////////////////////////// ATTRIBUTES
    private Team homeClub;
    private Team awayClub;
    private Stadium stad;
    private Referee matchReferee;
    private Card gameCards;
    private Ball gameBall;

    //////////////////////////////////////////////////// CONSTRUCTORS
    public Match() {
    }

    public Match(Team homeClub, Team awayClub, Stadium stad, Referee matchReferee) {
        this.homeClub = homeClub;
        this.awayClub = awayClub;
        this.stad = stad;
        this.matchReferee = matchReferee;
    }

    public Match(Team homeClub, Team awayClub, Stadium stad, Referee matchReferee, Card gameCards, Ball gameBall) {
        this.homeClub = homeClub;
        this.awayClub = awayClub;
        this.stad = stad;
        this.matchReferee = matchReferee;
        this.gameCards = gameCards;
        this.gameBall = gameBall;
    }
    //////////////////////////////////////////////////// METHODS
    public void startGame() {
        Ball gameBall = new Ball();
        Card gameCard = new Card();
        this.gameBall = gameBall;
        this.gameCards = gameCard;
        System.out.println(
                "\nMatch started between " + homeClub.getCountryName() + " and " + awayClub.getCountryName());
    }

    public void playGame() {
        System.out.println("\nThe match continues...\n");
        System.out.println("The match continues...\n");
        System.out.println("The match continues...\n");
        int min = 0;
        int max = 10;
        int randomHome = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int randomAway = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Result: " + randomHome + "  -  " + randomAway + "\n");
        if (randomAway == randomHome) {
            System.out.println("Draw");
        } else if (randomAway < randomHome) {
            System.out.println("World Cup Winner is " + homeClub.getCountryName());
        } else {
            System.out.println("World Cup Winner is " + awayClub.getCountryName());
        }
    }

    public void showCardYellow() {
        int card = gameCards.getCardnumberYellow();
        card++;
        gameCards.setCardnumberYellow(card);
    }

    public void showCardRed() {
        int card = gameCards.getCardnumberRed();
        card++;
        gameCards.setCardnumberRed(card);
    }

    public void displayShownCards() {
        System.out.println("Red Cards:"+ gameCards.getCardnumberRed()); 
        System.out.println("Yellow Cards:"+ gameCards.getCardnumberYellow()); 
    }
    //////////////////////////////////////////////////// GETTERS AND SETTERS
    public Team getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(Team homeClub) {
        this.homeClub = homeClub;
    }

    public Team getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(Team awayClub) {
        this.awayClub = awayClub;
    }

    public Referee getMatchReferee() {
        return matchReferee;
    }

    public void setMatchReferee(Referee matchReferee) {
        this.matchReferee = matchReferee;
    }

    public Stadium getStad() {
        return stad;
    }

    public void setStad(Stadium stad) {
        this.stad = stad;
    }

    public Card getGameCards() {
        return gameCards;
    }

    public void setGameCards(Card gameCards) {
        this.gameCards = gameCards;
    }

    public Ball getGameBall() {
        return gameBall;
    }

    public void setGameBall(Ball gameBall) {
        this.gameBall = gameBall;
    }
}
