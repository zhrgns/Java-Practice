# OBJECT ORIENTED DESIGN FOR A FOOTBALL WORLD CUP GAME

Thought as a developer asked to develop a computer game named Football World Cup. Found out and created the necessary classes and relations between those classes to create a football game at a basic level.

## 1-Player 
Player class has firstName, lastName, playerNumber, height, weight, age attributes.

Players are entity of teams. After creating a team, players can be add to the team with the team arraylist.

- toString: Player information can be printed out to the Terminal.

## 2-Team
Team class has countryname, manager and player's arraylist attributes.

- player ArrayList: After creating a team, a player object can be added or removed from the team with the team arraylist. Different subtypes of Player Class can be kept together in the Player arraylist.

- printTeamInfo: Team information can be print out the Terminal.

- addTeamPlayer/addGoalKeeper/addForwardPlayer/addDefenderPlayer: Creates a player/Goalkeeper/Forward object with input values and adds to the arraylist. 

## 3-Stadium
Stadium class has nameStadium attribute.

- printStadiumInfo: Stadium information can be printed out to the Terminal.

## 4-Referee
Referee class has firstname, lastname and hometown attributes.

- printRefereeInfo: Referee information can be printed out to the Terminal.

## 5-Match
Match class has homeclub,awayclub, a referee, stadium, Cards and a ball attributes. A match between teams can be created by creating a match object.

- startGame: Starts a game between Teams.
- playGame: Generates a different match result each time by calling the random method.
- showCardYellow: Shows a yellow card for that match.
- showCardRed: Shows a red card for that match.
- displayShownCards: Print out the total numbers of red and yellow cards.

## 6-Card
Card class has cardColor, cardnumberyellow and cardnumberred attributes.

## 7-Ball
Soccer class ball has color and brand attributes.

## 8-Defender
Defender class is subclass of the Player Class. It differs by position attribute and toString Method (@Override).

## 9-Forward
Forward class is subclass of the Player Class. It differs by position attribute and toString Method (@Override).

## 10-GoalKeeper
Goalkeeper class is subclass of the Player Class. It differs by position attribute and toString Method (@Override).