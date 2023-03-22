import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Runtime.getRuntime;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        int userInterface = showInterface();
        // if he picks zero or a random number, the system just exit
        if (userInterface != 1 && userInterface != 2){
            System.exit(0);
        }
        if(userInterface == 1){ // if he chose the admin interface

            User admin = new Admin();
            boolean check = admin.loginInterface(); // if true, enters the interface
            while(!check){ // if false it will loop until the user logs in
                check = admin.loginInterface();
            }
            int choice;
            do {
                choice = showAdminInterface();
                Flights flight = new Flights();
                String tempId;
                switch (choice) {
                    case 1:
                        addFlightDetails(flight, (Admin) admin);
                        System.out.println("Flight have been added Successfully...");
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    case 2:
                        System.out.print("\t Enter ID of the flight to be deleted >> ");
                        scan.nextLine();
                        tempId = scan.nextLine();
                        removeFlightDetails(tempId);
                        System.out.println("Flight have been removed Successfully...");
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    case 3:
                        System.out.print("\t Enter ID of the flight to be updated >>");
                        scan.nextLine();
                        tempId = scan.nextLine();
                        updateFlightDetails(tempId);
                        System.out.println("Flight have been updated Successfully...");
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    case 4:
                        showAllFlightsToAdmin((Admin) admin);
                }
            } while(choice != 0);
        } else{
            // Customer interface
            User customer = new Customer();
            boolean check = customer.loginInterface();
            while(!check) {
                check = customer.loginInterface();
            }
            int choice = 0;
            do{
                choice = showCustomerInterface();
                Flights flight = new Flights();
                switch (choice){
                    case 1:
                        bookFlight(flight, (Customer)customer);
                        break;
                    case 2:
                        int c;
                        System.out.print("Are you sure? (1) for yes (any number) for no >> ");
                        c = scan.nextInt();
                        scan.nextLine();
                        if(c == 1){
                            cancelFlight((Customer)customer);
                            }
                        break;
                    case 3:
                        showCustomerFlight((Customer) customer);
                        break;
                    case 4:
                        walletHandeler((Customer) customer);
                        break;
                }
            }while(choice != 0);

        }
    }

    private static void showAllFlightsToAdmin(Admin admin) throws FileNotFoundException {
        Available available = new Available();
        File file = new File("flightsDatabase.txt");
        Scanner fileReader = new Scanner(file);
        try{
            fileReader.useDelimiter("[,\n]");
            System.out.println("==========Flights in the database==========");
            while(fileReader.hasNext()){
                Flights tempHolder = new Flights();
                String tempId = fileReader.next();
                tempHolder.setFlightId(tempId);

                String tempFrom = fileReader.next();
                tempHolder.setFlightFrom(tempFrom);

                String tempTo = fileReader.next();
                tempHolder.setFlightTo(tempTo);

                String tempDay = fileReader.next();
                tempHolder.setFlightDay(Integer.parseInt(tempDay));

                String tempMonth = fileReader.next();
                tempHolder.setFlightMonth(Integer.parseInt(tempMonth));

                String tempPrice = fileReader.next();
                tempHolder.setFlightPrice(Double.parseDouble(tempPrice));

                System.out.println(tempHolder.toString());
                available.setNumberOfFlightsAvaliable(1);
            }
            System.out.println("Number of flights available: (" +  available.getNumberOfFlightsAvaliable()+")");
            System.out.println("==========THE END==========");
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            System.out.println("Error occurred");
        }
    }

    private static void showCustomerFlight(Customer customer) throws FileNotFoundException {

        String tempUsername;
        File file = new File("customerDatabase.txt");
        Scanner fileReader = new Scanner(file);
        try{
            fileReader.useDelimiter("[,\n]");
            boolean found = false;
            while(fileReader.hasNext()){
                tempUsername = fileReader.next();
                if(tempUsername.equals(customer.getUsername())){
                    found = true;
                    Flights tempHolder = new Flights();
                    String tempId = fileReader.next();
                    tempHolder.setFlightId(tempId);

                    String tempFrom = fileReader.next();
                    tempHolder.setFlightFrom(tempFrom);

                    String tempTo = fileReader.next();
                    tempHolder.setFlightTo(tempTo);

                    String tempDay = fileReader.next();
                    tempHolder.setFlightDay(Integer.parseInt(tempDay));

                    String tempMonth = fileReader.next();
                    tempHolder.setFlightMonth(Integer.parseInt(tempMonth));

                    String tempPrice = fileReader.next();
                    tempHolder.setFlightPrice(Double.parseDouble(tempPrice));
                    System.out.println("==========Your flight details==========");
                    System.out.print(tempHolder.toString());
                    TimeUnit.SECONDS.sleep(2);

                }
            }
            if(!found){
                System.out.println("You have no flights!");
                System.out.println("Hurry and book with us...");
                TimeUnit.SECONDS.sleep(1);
            }
            fileReader.close();
        }catch (Exception e){
            System.out.println("Error occurred");
        }
    }

    private static void cancelFlight(Customer customer) {
        int positionOfTerm = 0; //
        File oldFile = new File("customerDatabase.txt");
        File newFile = new File("tempCustomerHolder.txt");

        String currentLine;
        String recordsData[];

        try{
            // Writes the old data into the new temporary file
            FileWriter writer = new FileWriter("tempCustomerHolder.txt", true);
            BufferedWriter buffWriter = new BufferedWriter(writer);
            PrintWriter printer = new PrintWriter(buffWriter);

            FileReader reader = new FileReader("customerDatabase.txt");
            BufferedReader buffReader = new BufferedReader(reader);

            while((currentLine = buffReader.readLine()) != null){
                recordsData = currentLine.split(",");
                if(!(recordsData[positionOfTerm].equalsIgnoreCase(customer.getUsername()))){
                    printer.println(currentLine);
                }
            }
            printer.flush();
            printer.close();
            buffReader.close();
            buffWriter.close();
            writer.close();
            reader.close();

            oldFile.delete();
            File dump = new File("customerDatabase.txt");
            newFile.renameTo(dump);

        }catch (Exception e){
            System.out.println("Error occur");
        }
    }

    private static void walletHandeler(Customer customer) throws InterruptedException {
        int checker;
        System.out.println("Your current wallet value is: " + customer.getMoneyWallet());
        System.out.print("\t if you want to increase it enter (1), if no (any number) >>");
        checker = scan.nextInt();
        scan.nextLine();
        if(checker == 1){
            double val;
            System.out.print("\t How much do you want to increase it >>");
            val = scan.nextDouble();
            customer.setMoneyWallet(val);
            System.out.println("Money have been added successfully...");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private static void bookFlight(Flights flight, Customer customer) throws FileNotFoundException {
        String tempDepart;
        String tempArrival;
        scan.nextLine();
        // Check What flight the customer wants
        System.out.print("\t Where do you want to depart >> ");
        tempDepart = scan.nextLine();
        System.out.print("\t Where do you want to arrive >> ");
        tempArrival = scan.nextLine();

        // Open the flights database and create an arrayList and create temp variables
        File file = new File("flightsDatabase.txt");
        Scanner fileReader = new Scanner(file);
        ArrayList<Flights> list = new ArrayList<>();
        String tempId; String tempFrom; String tempTo; String tempDay; String tempMonth; String tempPrice;

        try{
            fileReader.useDelimiter("[,\n]");

            // Read the flight details in the file to the temp variables
            while(fileReader.hasNext()){
                Flights tempHolder = new Flights();
                tempId = fileReader.next();
                tempHolder.setFlightId(tempId);

                tempFrom = fileReader.next();
                tempHolder.setFlightFrom(tempFrom);

                tempTo = fileReader.next();
                tempHolder.setFlightTo(tempTo);

                tempDay = fileReader.next();
                tempHolder.setFlightDay(Integer.parseInt(tempDay));

                tempMonth = fileReader.next();
                tempHolder.setFlightMonth(Integer.parseInt(tempMonth));

                tempPrice = fileReader.next();
                tempHolder.setFlightPrice(Double.parseDouble(tempPrice));
                //  add the object to the arrayList
                list.add(tempHolder);
            }
            fileReader.close();
            boolean found = false;
            int dontCareForThisLol = 1;
            for(Flights x : list){
                if(tempDepart.equals(x.getFlightFrom()) && tempArrival.equals(x.getFlightTo())){
                    if( dontCareForThisLol ==1) {
                        System.out.println("==========Here is what we found!==========");
                        dontCareForThisLol++;
                    }
                    System.out.print(x.toString());
                    found = true;
                }
            }
            int index;
            if(found) {
                String wantedFlight;
                System.out.println("===================");
                System.out.print("\tEnter the ID of the flight wanted >> ");
                wantedFlight = scan.nextLine();
                for (Flights x : list) {
                    if (wantedFlight.equals(x.getFlightId()) && customer.getMoneyWallet() >= x.getFlightPrice()) {
                        System.out.println("Flight has been booked successfully...");
                        TimeUnit.SECONDS.sleep(1);
                        customer.setMoneyWallet(-1*(x.getFlightPrice()));
                        // call a function to add customers flights to a database
                        customerFlightDatabase(customer, x);
                    } else if (wantedFlight.equals(x.getFlightId()) && customer.getMoneyWallet() < x.getFlightPrice()) {
                        System.out.println("Not enough money...");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Fill up your wallet...");
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Error occurred");
        }
    }

    private static void customerFlightDatabase(User customer, Flights flight) throws IOException {
        File flightsDatabase = new File("customerDatabase.txt");
        FileWriter writer = new FileWriter(flightsDatabase, true);
        try {
            writer.append(customer.getUsername()+ ","+ flight.getFlightId() + "," + flight.getFlightFrom() + "," + flight.getFlightTo() + "," + flight.getFlightDay() + "," + flight.getFlightMonth() + "," + flight.getFlightPrice() +"\n");
            writer.close(); // closing the file
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static int showCustomerInterface() {
        int choice;
        System.out.println("====================");
        System.out.println("1 - Book a flight");
        System.out.println("2 - Cancel a flight");
        System.out.println("3 - view my flights");
        System.out.println("4 - Check Wallet");
        System.out.println("0 - Exit");
        System.out.println("====================");
        System.out.print("Your choice >> ");
        choice = scan.nextInt();
        return choice;
    }


    private static void updateFlightDetails(String tempId) {

        Scanner filescan;
        File oldFile = new File("flightsDatabase.txt");
        File newFile = new File("tempHolderToUpdate.txt");
        String ID="", flightFrom= "", flightTo="", flightDay = "", flightMonth ="", flightPrice = "";
        String tempID="", tempFlightFrom= "", tempFlightTo="";
        int tempFlightDay, tempFlightMonth;
        double tempFlightPrice;

        System.out.println("====================");
        System.out.print("\t - What is the flight ID >> ");
        tempID = scan.nextLine();
        System.out.print("\t - Where is the flight departure city >> ");
        tempFlightFrom = scan.nextLine();
        System.out.print("\t - Where is the flight arrival city >> ");
        tempFlightTo = scan.nextLine();
        System.out.print("\t - When is the flight departure date (Enter day then month separated by a space) >> ");
        tempFlightDay = scan.nextInt();
        tempFlightMonth = scan.nextInt();
        System.out.print("\t - Enter the flight price >> ");
        tempFlightPrice = scan.nextDouble();

        try{
            FileWriter writer = new FileWriter("tempHolderToUpdate.txt", true);
            BufferedWriter buffWriter = new BufferedWriter(writer);
            PrintWriter printer = new PrintWriter(buffWriter);
            filescan = new Scanner(new File("flightsDatabase.txt"));
            filescan.useDelimiter("[,\n]");

            while(filescan.hasNext()){

                ID = filescan.next();
                flightFrom = filescan.next();
                flightTo = filescan.next();
                flightDay = filescan.next();
                flightMonth = filescan.next();
                flightPrice = filescan.next();

                if(ID.equals(tempId)){
                    printer.println(tempID + "," + tempFlightFrom +"," + tempFlightTo + "," + tempFlightDay + "," + tempFlightMonth + "," + tempFlightPrice);
                } else {
                    printer.println(ID + "," + flightFrom +"," + flightTo + "," + flightDay + "," + flightMonth + "," + flightPrice);
                }
            }

            filescan.close();
            printer.flush();
            printer.close();
            oldFile.delete();
            File dump = new File("flightsDatabase.txt");
            newFile.renameTo(dump);

        } catch (Exception e){
            System.out.println("Error occur");
        }
    }

    private static void removeFlightDetails(String id) {

        int positionOfTerm = 0; // to hold the ID in the first index of the array
        File oldFile = new File("flightsDatabase.txt");
        File newFile = new File("tempHolder.txt");

        String currentLine;
        String recordsData[];

        try{
            // Writes the old data into the new temporary file
            FileWriter writer = new FileWriter("tempHolder.txt", true);
            BufferedWriter buffWriter = new BufferedWriter(writer);
            PrintWriter printer = new PrintWriter(buffWriter);

            FileReader reader = new FileReader("flightsDatabase.txt");
            BufferedReader buffReader = new BufferedReader(reader);

            while((currentLine = buffReader.readLine()) != null){
                recordsData = currentLine.split(",");
                if(!(recordsData[positionOfTerm].equalsIgnoreCase(id))){
                    printer.println(currentLine);
                }
            }
            printer.flush();
            buffReader.close();
            buffWriter.close();
            writer.close();
            reader.close();

            oldFile.delete();
            File dump = new File("flightsDatabase.txt");
            newFile.renameTo(dump);

        }catch (Exception e){
            System.out.println("Error occur");
        }
    }

    public static void addFlightDetails(Flights flight, Admin admin) throws IOException {
        String temp;
        int val;
        double price;
        scan.nextLine();
        System.out.println("====================");
        System.out.print("\t - What is the flight ID >> ");
        temp = scan.nextLine();
        flight.setFlightId(temp);
        System.out.print("\t - Where is the flight departure city >> ");
        temp = scan.nextLine();
        flight.setFlightFrom(temp);
        System.out.print("\t - Where is the flight arrival city >> ");
        temp = scan.nextLine();
        flight.setFlightTo(temp);
        System.out.print("\t - When is the flight departure date (Enter day then month separated by a space) >> ");
        val = scan.nextInt();
        flight.setFlightDay(val);
        val = scan.nextInt();
        flight.setFlightMonth(val);
        System.out.print("\t - Enter the flight price >> ");
        price = scan.nextDouble();
        flight.setFlightPrice(price);
        admin.addFlightToDatabase(flight);
    }
    //
    public static int showAdminInterface(){
        int choice;
        System.out.println("====================");
        System.out.println("1 - Add a flight to the database");
        System.out.println("2 - Remove a flight from the database");
        System.out.println("3 - Modify a flight in the database");
        System.out.println("4 - View flights in the database");
        System.out.println("0 - Exit");
        System.out.println("====================");
        System.out.print("Your choice >> ");
        choice = scan.nextInt();
        return choice;
    }

    // Prompt the user to pick which interface to take
    public static int showInterface(){
        int choice;
        System.out.println("====================");
        System.out.println("1 - Admin");
        System.out.println("2 - Customer");
        System.out.println("0 - Exit");
        System.out.println("====================");
        System.out.print("Your choice >> ");
        choice = scan.nextInt();
        return choice;
    }
}

