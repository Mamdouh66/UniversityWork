class Available extends Flights {

    private int numberOfFlightsAvaliable = 0;

    Available() {

    }

    Available(String departure, String arrival, double price, int day, int month) {
        super(departure, arrival, price, day, month);
    }

    public void setNumberOfFlightsAvaliable(int numberOfFlightsAvaliable) {
        this.numberOfFlightsAvaliable += numberOfFlightsAvaliable;
    }

    public int getNumberOfFlightsAvaliable() {
        return numberOfFlightsAvaliable;
    }
}
