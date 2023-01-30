package App;
public class Ticket extends Flight{
    private String ticketID;
    private String customerName;
    private String customerUsername;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    
    // public void printTicket() {}
}
