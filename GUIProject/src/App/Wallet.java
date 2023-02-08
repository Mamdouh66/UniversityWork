package App;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Wallet extends Customer{
    private double walletMoney;
    private String cardNumber;
    private String cardHolderName;
    private String cardExperationDate;
    private String cardSecurityNumber;
    

    public String getCardExperationDate() {
        return cardExperationDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardSecurityNumber() {
        return cardSecurityNumber;
    }

    @Override
    public String getCustomerFirstName() {
        return super.getCustomerFirstName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCustomerLastName() {
        return super.getCustomerLastName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    public double getWalletMoney() {
        return walletMoney;
    }

    @Override
    public void setCanBuy(boolean canBuy) {
        super.setCanBuy(canBuy); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setCardExperationDate(String cardExperationDate) {
        this.cardExperationDate = cardExperationDate;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardSecurityNumber(String cardSecurityNumber) {
        this.cardSecurityNumber = cardSecurityNumber;
    }

    @Override
    public void setCustomerFirstName(String customerFirstName) {
        super.setCustomerFirstName(customerFirstName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCustomerLastName(String customerLastName) {
        super.setCustomerLastName(customerLastName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    public void setWalletMoney(double walletMoney) {
        this.walletMoney += walletMoney;
    }
    
    public static boolean isValid(String number, String expDate) {

        // Check for expired cards
//        Calendar currentDate = Calendar.getInstance();
//        Calendar expiryDate = Calendar.getInstance();
//        int expMonth = Integer.parseInt(expDate.substring(0,2));
//        int expYear = Integer.parseInt(expDate.substring(3,5)) + 2000;
//        expiryDate.set(expYear, expMonth, 1);
//        if(currentDate.after(expiryDate)){
//            return false;
//        }
        
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
        try {
          Date date = formatter.parse(expDate);
          Calendar cal = Calendar.getInstance();
          cal.setTime(date);
          Calendar currentCalendar = Calendar.getInstance();
          if (cal.before(currentCalendar)) {
            JOptionPane.showMessageDialog(null, "The date has expired.");
            return false;
          }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Invalid date format.");
        }
        int sum = 0;
        boolean alternate = false;
        for (int i = number.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(number.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        if(sum % 10 != 0)
            return false;

        // Check if the number is a valid Visa, Mastercard, or American Express card
        if (number.startsWith("4") && (number.length() == 13 || number.length() == 16)) {
            return true;
        } else if ((number.startsWith("51") || number.startsWith("52") || number.startsWith("53") || number.startsWith("54") || number.startsWith("55")) && number.length() == 16) {
            return true;
        } else if (number.startsWith("34") || number.startsWith("37") && number.length() == 15) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isInputValid(String number, String expDate) {
        // Check if the input number contains only digits
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
            return false;
        }

        // Check if the input expDate is in the correct format
        pattern = Pattern.compile("(0[1-9]|1[0-2])/(2[0-9]{3})");
        matcher = pattern.matcher(expDate);
        if (!matcher.matches()) {
            return false;
        }

        return true;
    }
    // public void addMoney() {}
    // public boolean walletStatus() {}
    
}
