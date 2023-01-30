package App;

import javax.swing.text.PasswordView;

public class Customer extends User{
    private String customerFirstName;
    private String customerLastName;
    private boolean canBuy = false;

    public Customer(){}
    public Customer (String cFirstName, String  cLastName, String pass, String eml,String  phn,String  username) {
        customerFirstName = cFirstName;
        customerLastName = cLastName;
        this.setPassword(pass);
        this.setPhoneNumber(phn);
        this.setUsername(username);
        this.setEmail(eml);
    }
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPassword() {
        return super.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getUsername() {
        return super.getUsername(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    @Override
    public void setEmail(String email) {
        super.setEmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    // public void checkWallet(){}
    // public void cancelFlight(){}
}
