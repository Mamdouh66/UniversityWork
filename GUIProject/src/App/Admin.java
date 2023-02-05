package App;
import java.util.Random;
import java.sql.*;

public class Admin extends User{
    private boolean isManager = false;
    private String adminFirstName;
    private String adminLastName;
    
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int ALPHABET_LENGTH = ALPHABET.length();
    private static final Random RANDOM = new Random();
    
    
    public Admin(String fName, String Lname, String username, String Password, String phone, String email, boolean is){
        adminFirstName = fName;
        adminLastName = Lname;
        setUsername(username);
        setPassword(Password);
        setPhoneNumber(phone);
        setEmail(email);
        isManager = is;
    }
    
     public static String generateRandomString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
          result.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET_LENGTH)));
        }
        for (int i = 0; i < 3; i++) {
          result.append(RANDOM.nextInt(10));
        }
        return result.toString();
    }
    
     public static boolean checkIfExistsInDB(String randomString) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyout?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1234");
      statement = connection.prepareStatement("SELECT * FROM flights WHERE flightID = ?");
      statement.setString(1, randomString);
      resultSet = statement.executeQuery();
      return resultSet.next();
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    } finally {
      try {
        if (resultSet != null) {
          resultSet.close();
        }
        if (statement != null) {
          statement.close();
        }
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
    public static String getUniqueRandomString() {
    String randomString;
    do {
      randomString = generateRandomString();
    } while (checkIfExistsInDB(randomString));
    return randomString;
    }
     
    public boolean getIsManager(){
        return isManager;
    }
    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
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

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
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
    
    //public void addNewFlight(){}
    //public void deleteFlight(){}
    //public void updateFlight(){}
}
