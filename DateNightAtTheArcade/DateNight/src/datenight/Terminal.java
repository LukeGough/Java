package datenight;

public class Terminal {

    public void buyCredits(Card card, int money) {
        if (money > 0 ) {
            System.out.println("$" + money + " worth of credits has been successfully purchased");
            card.setCreditBalance(card.getCreditBalance() + (money * 2));
            checkBalance(card);
        } else {
            System.out.println("No money entered, please enter money");
        }
    }

    public void checkBalance(Card card) {
        System.out.println("Card Number: " + card.getCardNum());
        System.out.println("Credits: " + card.getCreditBalance());
        System.out.println("Tickets: " + card.getTicketBalance());
    }

    public void transferCredits(Card cardOne, int credits, Card cardTwo) {
        if ((cardOne.getCreditBalance() - credits) < 0) {
            System.out.println("Card " + cardOne.getCardNum() + " does not have " + credits + " credits to transfer");
        } else {
            System.out.println(credits + " credits have been transferred from Card " + cardOne.getCardNum() + " to Card "+ cardTwo.getCardNum());
            cardOne.setCreditBalance(cardOne.getCreditBalance() - credits);
            cardTwo.setCreditBalance(cardTwo.getCreditBalance() + credits);
            checkBalance(cardOne);
            checkBalance(cardTwo);
        }
    }

    public void transferTickets(Card cardOne, int tickets, Card cardTwo) {
        if ((cardOne.getCreditBalance() - tickets) < 0) {
            System.out.println("Card " + cardOne.getCardNum() + " does not have " + tickets + " credits to transfer");
        } else {
            System.out.println(tickets + " tickets have been transferred to Card "+ cardTwo.getCardNum());
            cardOne.setTicketBalance(cardOne.getTicketBalance() - tickets);
            cardTwo.setTicketBalance(cardTwo.getTicketBalance() + tickets);
            checkBalance(cardOne);
            checkBalance(cardTwo);
        }
    }

    public void buyPrize(Prize prize, Card card) {
        if (prize.getItemStock() <= 0) {
            System.out.println(prize.getName() + " is currently out of stock");
        } else if ((card.getTicketBalance() - prize.getTicketCost()) < 0) {
            System.out.println("You do not have enough tickets to purchase " + prize.getName());
        } else {
            prize.setItemStock();
            card.setTicketBalance(card.getTicketBalance() - prize.getTicketCost());
            System.out.println(prize.getName() + " has been purchased");
            System.out.println(prize.getItemStock() + " \"" + prize.getName() + "\" in stock");
            checkBalance(card);
        }
    }
}
