/*  
    Class: Cluster - Java II
    Name: Luke Gough
    Student ID: 30003918
 */
package soccerleague;

public class Game {

    private Team teamOne;
    private Team teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private double temperature;
    private static int idCounter = 1;
    private final int id;

    public Game(Team teamOne, Team teamTwo, double temp) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.temperature = temp;
        id = (idCounter++);
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(int teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public int getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(int teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public double getTemprature() {
        return temperature;
    }

    public void setTemprature(double temperature) {
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void playGame() {
        //System.out.println("Playting games with " + teamOne + " " + teamTwo);
        teamOneScore = teamOne.scoreGoal(temperature);
        teamOne.setTotalGoalsScored(teamOneScore);
        teamOne.setTotalGoalsAllowed(teamTwoScore);

        teamTwoScore = teamTwo.scoreGoal(temperature);
        teamTwo.setTotalGoalsScored(teamTwoScore);
        teamTwo.setTotalGoalsAllowed(teamOneScore);

        if (teamOneScore > teamTwoScore) {
            teamOne.setWinTotal(1);
            teamTwo.setLossTotal(1);
        } else if (teamTwoScore < teamOneScore) {
            teamTwo.setWinTotal(1);
            teamOne.setLossTotal(1);
        } else if (teamOneScore == teamTwoScore) {
            teamOne.setTieTotal(1);
            teamTwo.setTieTotal(1);
        }
    }

    public void printStats() {
        System.out.println("Game #" + id);
        System.out.println("Temprature: " + temperature);
        System.out.println("Away Team: " + teamOne.getName() + ", " + teamOneScore);
        System.out.println("Home Team: " + teamTwo.getName() + ", " + teamTwoScore);
        System.out.println();
    }
}
