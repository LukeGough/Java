/*  
    Class: Cluster - Java II
    Name: Luke Gough
    Student ID: 30003918
 */
package soccerleague;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoccerLeague {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean toCold = true;

        // create Teams Array
        Team t1 = new Team("Team 1");
        Team t2 = new Team("Team 2");
        Team t3 = new Team("Team 3");
        Team t4 = new Team("Team 4");
        Team[] teams = {t1, t2, t3, t4};

        Scheduler sch = new Scheduler(teams);

        while (toCold) {
            try {
                System.out.print("Enter Temperature (0 to cold): ");
                double temp = sc.nextDouble();
                sch.playGames(temp);
                toCold = sch.checkLastThreeTemps();
            } catch (InputMismatchException e) {
                //e.getMessage();
                System.out.println("Incorrect temperature format");
                sc.next(); // exhaust any unread Scanner tokens
            }
        }

        // while ended, print results
        System.out.println("\nSeason is over\n");
        System.out.println("*********RESULTS*********");

        // print Team details
        sch.teamStats();

        // print Game details
        sch.gameStats();

        // print hottest temp
        sch.hottestTemp();

        // print average temp
        sch.avgTemp();
    }
}
