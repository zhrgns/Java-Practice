package edu.sabanciuniv.main;

import edu.sabanciuniv.domain.Match;
import edu.sabanciuniv.domain.Referee;
import edu.sabanciuniv.domain.Stadium;
import edu.sabanciuniv.domain.Team;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("\n\n+++++++++++++World Cup Final Game+++++++++++++\n\n");

        // Stadium and Referee Info
        Stadium stad1 = new Stadium("Lusail Stadium");
        stad1.printStadiumInfo();
        System.out.println("");

        Referee referee1 = new Referee("Szymon", "Marciniak", "Poland");
        referee1.printRefereeInfo();
        System.out.println("");

        // Some of Team Players Infos Logged
        Team Argentina = new Team("Argentina", "Lionel Scaloni");
        Argentina.addForwardPlayer("Lionel", "Messi", 10, "Forward, Right");
        Argentina.addForwardPlayer("Lautaro", "Martínez", 22, "Forward, Center");
        Argentina.addForwardPlayer("Julián ", "Álvarez", 9, "Forward, Left");
        Argentina.addGoalkeeper("Emiliano ", "Martínez", 23, "GoalKeeper");

        Team France = new Team("France", "Didier Deschamps");
        France.addForwardPlayer("Kylian", "Mbappé", 10, "Forward, Left");
        France.addForwardPlayer("Olivier", "Giroud", 9, "Forward, Center");
        France.addForwardPlayer("Antoine", "Griezmann", 7, "Forward, Right");
        France.addGoalkeeper("Hugo", "Lloris", 1, "GoalKeeper");

        // Displaying Teams
        System.out.println("--------------------TEAMS--------------------\n");
        Argentina.printTeamInfo();
        System.out.println("\t...\n");
        France.printTeamInfo();
        System.out.println("\t...");
        
        Match argentinavsfrance = new Match(Argentina, France, stad1, referee1);
        argentinavsfrance.startGame();

        argentinavsfrance.playGame();
        argentinavsfrance.showCardYellow();
        argentinavsfrance.showCardYellow();
        argentinavsfrance.showCardYellow();
        argentinavsfrance.showCardRed();
        argentinavsfrance.displayShownCards();
    }
}
