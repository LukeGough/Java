/*  
    Class: Cluster - Java II
    Name: Luke Gough
    Student ID: 30003918
 */
package soccerleague;

public class Team {

    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoalsScored;
    private int totalGoalsAllowed;

    public Team(String name) {
        this.name = name;
        winTotal = 0;
        lossTotal = 0;
        tieTotal = 0;
        totalGoalsScored = 0;
        totalGoalsAllowed = 0;
    }

    public String getName() {
        return name;
    }

    public int getWinTotal() {
        return winTotal;
    }

    public void setWinTotal(int winTotal) {
        this.winTotal += winTotal;
    }

    public int getLossTotal() {
        return lossTotal;
    }

    public void setLossTotal(int lossTotal) {
        this.lossTotal += lossTotal;
    }

    public int getTieTotal() {
        return tieTotal;
    }

    public void setTieTotal(int tieTotal) {
        this.tieTotal += tieTotal;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored += totalGoalsScored;
    }

    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }

    public void setTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed += totalGoalsAllowed;
    }

    public int scoreGoal(double temp) {
        // System.out.println("Socring goal");
        int score = 0;
        if (temp < 10) { // less than 10
            score = ((int) (Math.random() * 4)); // between 0 - 3
        } else if (temp >= 10 && temp < 20) { // 10 - less than 20
            score = ((int) (Math.random() * 6)); // between 0 - 5
            return score;
        } else if (temp >= 20 && temp < 30) { // 20 - less than 30
            score = ((int) (Math.random() * 8)); // between 0 - 7
            return score;
        } else if (temp >= 30) { // 30 or greater
            score = ((int) (Math.random() * 10)); // between 0 - 9
            return score;
        }
        return score;
    }

    public void printStats() {
        System.out.println(name);
        System.out.println("Wins: " + winTotal + ", Losses: " + lossTotal + ", Ties: " + tieTotal);
        System.out.println("Points Scored: " + totalGoalsScored + ", Points Allowed: " + totalGoalsAllowed);
        System.out.println();
    }
}
