### Overview
It’s been a brutally cold and snowy winter. None of your friends have
wanted to play soccer. But now that spring has arrived, another
season of the league can begin. Your challenge is to write a program
that models a soccer league and keeps track of the season’s
statistics.

There are 4 teams in the league. Matchups are determined at
random. 2 games are played every Tuesday, which allows every
team to participate weekly. There is no set number of games per
season. The season continues until winter arrives.

The league is very temperature-sensitive. Defences are sluggish on
hot days. Hotter days allow for the possibility of more goals during a game. If the temperature is
freezing, no games are played that week. If there are 3 consecutive weeks of freezing temperatures,
then winter has arrived and the season is over.

#### Tasks
Write a program that models a soccer league and keeps track of the season’s statistics. Carefully
consider what data should be stored in an array and what data should be stored in an ArrayList.
Design classes with fields and methods based on the description of the league. You’ll also need a test
class that contains a main method. All fields must be private. Provide any necessary getters and
setters.

#### Teams
Each team has a name. The program should also keep track of each team’s win-total, loss-total, tietotal, total goals scored, and total goals allowed. Create an array of teams that the scheduler will
manage.

Print each team’s statistics when the season ends.

#### Games
In a game, it’s important to note each team’s name, each team’s score, and the temperature that day.
Number each game with integer ID number. This number increases as each game is played. Keep
track of every game played this season. This class stores an ArrayList of all games as a field.

Your program should determine scores at random. The maximum number of goals any one team can
score should increase proportionally with the temperature. But make sure these numbers are
somewhat reasonable.

When the season ends, print the statistics of each game. Print the hottest temperature and average
temperature for the season.

#### Scheduler
Accept user input through a JOptionPane or Scanner. While the application is running, ask the user to
input a temperature. The program should not crash because of user input. If it’s warm enough to play,
schedule 2 games. Opponents are chosen at random. Make sure teams aren’t scheduled to play
against themselves. If there are 3 consecutive weeks of freezing temperatures, the season is over.

#### Exception Handling
Identify possible runtime errors in the program you’ve just completed, and improve program stability by
using exception-handling techniques.
