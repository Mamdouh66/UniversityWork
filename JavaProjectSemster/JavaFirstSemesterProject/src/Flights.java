public class Flights {
    private String flightId = "";
    private String flightFrom = "";
    private String flightTo = "";
    private double flightPrice = 0;
    private int flightDay = 0;
    private int flightMonth = 0;
    Flights(){

    }
    Flights(String departure, String arrival, double price, int day, int month){
        flightFrom = departure;
        flightTo = arrival;
        flightPrice = price;
        flightDay = day;
        flightMonth = month;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public int getFlightDay() {
        return flightDay;
    }

    public int getFlightMonth() {
        return flightMonth;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setFlightDay(int flightDay) {
        this.flightDay = flightDay;
    }

    public void setFlightMonth(int flightMonth) {
        this.flightMonth = flightMonth;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    @Override
    public String toString() {
        return (flightId + " " + flightFrom + " " + flightTo + " " + flightDay + "/" + flightMonth + " " + flightPrice + "$"+ "\n");
    }
}

