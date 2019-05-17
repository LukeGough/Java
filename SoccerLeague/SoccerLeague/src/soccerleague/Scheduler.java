/*  
    Class: Cluster - Java II
    Name: Luke Gough
    Student ID: 30003918
 */
package soccerleague;

import java.util.ArrayList;

public class Scheduler {

    private Team[] Teams;
    private int[] temps = {40, 40, 40};
    private int t = 0;
    ArrayList<Game> Games = new ArrayList<>();

    public Scheduler(Team[] teams) {
        this.Teams = teams;
    }

    public void playGames(double temp) {
        if (temp > 0) {
            // System.out.println("bigger");
            System.out.println(temp);
            ArrayList<Integer> teamsRemaining = new ArrayList();

            for (int i = 0; i < Teams.length; i++) {
                teamsRemaining.add(i);
            }
            while (teamsRemaining.size() > 1) {
                int random = (int) (Math.random() * teamsRemaining.size());
                Team teamOne = Teams[(teamsRemaining.get(random))];
                teamsRemaining.remove(random);
                random = (int) (Math.random() * teamsRemaining.size());
                Team teamTwo = Teams[(teamsRemaining.get(random))];
                teamsRemaining.remove(random);

                //System.out.println(teamOne);
                //System.out.println(teamTwo);
                Game nextGame = new Game(teamOne, teamTwo, temp);
                nextGame.playGame();
                Games.add(nextGame);
                //System.out.println(nextGame.getTeamOne().getName() + " " + nextGame.getTeamOneScore());
                //System.out.println(nextGame.getTeamTwo().getName() + " " + nextGame.getTeamTwoScore());
            }
        } else {
            //System.out.println("smaller");
            System.out.println("Too cold to play.");
        }
        temps[t] = (int) temp;
        t = ((t + 1) % 3);
    }

    public boolean checkLastThreeTemps() {
        for (int i : temps) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public void teamStats() {
        for (Team t : Teams) {
            t.printStats();
        }
    }

    public void gameStats() {
        for (Game g : Games) {
            g.printStats();
        }
    }

    public void hottestTemp() {
        double hottestTemp = 0;
        for (Game g : Games) {
            if (g.getTemprature() > hottestTemp) {
                hottestTemp = g.getTemprature();
            }
        }
        System.out.println("Hottest temp was " + hottestTemp);
    }

    public void avgTemp() {
        // add Games temps together int avgTemp
        double avgTemp = 0;

        for (Game g : Games) {
            avgTemp += g.getTemprature();
        }

        // divide avgTemp by Games.size()
        avgTemp = avgTemp / Games.size();

        System.out.println("Avg temp here " + avgTemp);
    }
}
