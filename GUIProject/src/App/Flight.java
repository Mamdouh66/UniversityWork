package App;
public class Flight {
    private String flightDepartingCity;
    private String flightDepartingDate;
    private String flightArrivingCity;
    private String flightArrivingDate;
    private double flightPrice;
    private String flightID;
    private int seats;
    private String admin;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
    
    

    public String getFlightArrivingCity() {
        return flightArrivingCity;
    }

    public String getFlightArrivingDate() {
        return flightArrivingDate;
    }

    public String getFlightDepartingCity() {
        return flightDepartingCity;
    }

    public String getFlightDepartingDate() {
        return flightDepartingDate;
    }

    public String getFlightID() {
        return flightID;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightArrivingCity(String flightArrivingCity) {
        this.flightArrivingCity = flightArrivingCity;
    }

    public void setFlightArrivingDate(String flightArrivingDate) {
        this.flightArrivingDate = flightArrivingDate;
    }

    public void setFlightDepartingCity(String flightDepartingCity) {
        this.flightDepartingCity = flightDepartingCity;
    }

    public void setFlightDepartingDate(String flightDepartingDate) {
        this.flightDepartingDate = flightDepartingDate;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }
    
}
