/*  
    Class: Cluster - Java I
    Name: Luke Gough
    Student ID: 30003918
 */
package datenight;

public class Card {

    private int creditBalance;
    private int ticketBalance;
    private static int cardNumCounter = 1;
    private final int cardNum;
    private static int idCounter = 1;
    private final int id;

    public Card() {
        creditBalance = 0;
        ticketBalance = 0;
        cardNum = (cardNumCounter++);
        id = (idCounter++);
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int credits) {
        if (credits < 0 ) {
            System.out.println("Credit balance cannot be below 0");
        } else {
            creditBalance = credits;
        }
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int tickets) {
        if (tickets < 0 ) {
            System.out.println("Ticket balance cannot be below 0");
        } else {
            ticketBalance = tickets;
        }
    }

    public int getId() {
        return id;
    }

    public int getCardNum() {
        return cardNum;
    }
}
