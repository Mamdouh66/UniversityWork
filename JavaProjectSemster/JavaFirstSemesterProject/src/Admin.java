import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Admin extends User{

    Admin(){

    }
    Admin(String user, String pass){
        super(user, pass);
    }

    // Function to add flights to the flightsDatabase
    public void addFlightToDatabase(Flights flight) throws IOException {
        String flightId = flight.getFlightId();
        String flightFrom = flight.getFlightFrom();
        String flightTo = flight.getFlightTo();
        double flightPrice = flight.getFlightPrice();
        int flightDay = flight.getFlightDay();
        int flightMonth = flight.getFlightMonth();
        File flightsDatabase = new File("flightsDatabase.txt");
        FileWriter writer = new FileWriter(flightsDatabase, true);
        try {
            writer.append(flightId + "," + flightFrom + "," + flightTo + "," + flightDay + "," + flightMonth + "," + flightPrice +"\n");
            writer.close(); // closing the file
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
}
