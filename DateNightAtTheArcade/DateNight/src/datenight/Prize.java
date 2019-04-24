/*  
    Class: Cluster - Java I
    Name: Luke Gough
    Student ID: 30003918
 */
package datenight;

public class Prize {

    private String name;
    private int ticketCost;
    private int itemStock;

    Prize(String name, int ticketCost, int itemStock) {
        this.name = name;
        this.ticketCost = ticketCost;
        this.itemStock = itemStock;
    }

    public String getName() {
        return name;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock() {
        itemStock--;
    }
}
