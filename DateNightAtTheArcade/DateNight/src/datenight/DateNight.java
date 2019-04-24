/*  
    Class: Cluster - Java I
    Name: Luke Gough
    Student ID: 30003918
 */
package datenight;

public class DateNight {

    public static void main(String[] args) {
        Terminal t1 = new Terminal();
        Game g1 = new Game(10);
        Card c1 = new Card();
        Card c2 = new Card();
        Prize p1 = new Prize("Small Teddy", 10, 5);
        Prize p2 = new Prize("Medium Teddy", 50, 5);
        Prize p3 = new Prize("Large Teddy", 1000, 5);

        // load credits onto each card
        System.out.println("Loading Credits...");
        
        t1.buyCredits(c1, 0);
        t1.buyCredits(c1, 50);
        
        t1.buyCredits(c2, 10);

        System.out.println();

        // play a bunch of games using both cards
        System.out.println("Playing Games...");

        g1.playGame(c1);
        g1.playGame(c1);
        g1.playGame(c2);
        g1.playGame(c2);
        g1.playGame(c2);

        System.out.println();

        // transfer the balance of credits and tickets from Card 1 to Card 2
        System.out.println("Transferring Credits...");
        
        t1.transferCredits(c1, 150, c2);
        t1.transferCredits(c1, 50, c2);
        
        t1.transferTickets(c1, 500, c2);
        t1.transferTickets(c1, 10, c2);
        
        System.out.println();
        
        // request prizes using Card 2
        // try to play a game and request a prize using Card 1
        System.out.println("Buying...");
        t1.buyPrize(p1, c2);
        t1.buyPrize(p2, c2);
        t1.buyPrize(p3, c2);

        System.out.println();

        // perform whatever other actions might be necessary to test your program
        // check balance
        System.out.println("Check Balance...");
        
        t1.checkBalance(c1);
        t1.checkBalance(c2);

        System.out.println();

    }
}
