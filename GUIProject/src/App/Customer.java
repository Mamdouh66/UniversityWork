package App;

import javax.swing.text.PasswordView;

public class Customer extends User{
    private String customerFirstName;
    private String customerLastName;
    private boolean canBuy = false;
    String[] customerHistory;

    public Customer(){}
    public Customer (String cFirstName, String  cLastName, String pass, String eml,String  phn,String  username, String[] history) {
        customerFirstName = cFirstName;
        customerLastName = cLastName;
        this.setPassword(pass);
        this.setPhoneNumber(phn);
        this.setUsername(username);
        this.setEmail(eml);
    }

    public void setCustomerHistory(String[] customerHistory) {
        this.customerHistory = customerHistory;
    }

    public String[] getCustomerHistory() {
        return customerHistory;
    }
    
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCanBuy(boolean canBuy) {
        this.canBuy = canBuy;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }


    // public void checkWallet(){}
    // public void cancelFlight(){}
}
