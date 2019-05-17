package datenight;

public class Game {

    int minCreditsToPlay;

    Game(int minCreditsToPlay) {
        this.minCreditsToPlay = minCreditsToPlay;
    }

    public void playGame(Card card) {
        // check card has enough credits to play
        if ((card.getCreditBalance() - minCreditsToPlay) < 0) {
            System.out.println("Card " + card.getCardNum() + " does not have enough credits to play this game");
            System.out.println(minCreditsToPlay + " credits are required to play this game");
        } else {
            // reduce card credit
            card.setCreditBalance(card.getCreditBalance() - minCreditsToPlay);

            // award random, non-negative number of tickets
            int tickets = (int ) (Math.random() * 100) + 1;
            card.setTicketBalance(card.getTicketBalance() + tickets);

            // print the card number, number of tickets won, along with the new total
            System.out.println("Card Number: " + card.getCardNum());
            System.out.println("You won " + tickets);
            System.out.println("Tickets: " + card.getTicketBalance());
        }
    }
}
