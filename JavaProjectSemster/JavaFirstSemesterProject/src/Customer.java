public class Customer extends User{

    private double moneyWallet = 0; // Customer's Wallet
    Customer(){

    }

    Customer(String user, String pass){
        super(user, pass);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
    @Override
    public String getUsername() {
        return super.getUsername();
    }
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }
    public void setMoneyWallet(double moneyWallet) {
        this.moneyWallet += moneyWallet;
    }

    public double getMoneyWallet() {
        return moneyWallet;
    }
}
