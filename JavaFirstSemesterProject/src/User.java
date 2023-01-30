import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User {

    static Scanner scan = new Scanner(System.in);
    private String username = "";
    private String password = "";

    User(){

    }
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean loginInterface(int num) throws IOException { // logging interface

        boolean isAuthorized = false;
        int choice;
        String username;
        String password;
        System.out.println("====================");
        System.out.println("1 - Login");
        System.out.println("2 - Register");
        System.out.println("0 - Exit");
        System.out.println("====================");
        System.out.print("Your choice >> ");
        choice = scan.nextInt();
        scan.nextLine();
        if (choice == 1){
            System.out.println("==========LOGGING==========");
            System.out.print("Enter username >> ");
            username = scan.nextLine();
            System.out.print("Enter password >> ");
            password = scan.nextLine();
            if(num == 1) {
                if (verifyLogin(username, password, 1)) {
                    this.username = username;
                    this.password = password;
                    return true;
                } else {
                    System.out.println("Username or password is incorrect, or doesn't exist");
                }
            } else if (num == 2){
                if (verifyLogin(username, password, 2)) {
                    this.username = username;
                    this.password = password;
                    return true;
                } else {
                    System.out.println("Username or password is incorrect, or doesn't exist");
                }
            }
        } else if (choice == 2){
            String tempUsername = "";
            String tempPassword = "";
            System.out.println("==========REGISTRATION==========");
            while(true){
                System.out.print("Enter username >> "); // get the username and password to be added
                tempUsername = scan.nextLine();
                System.out.print("Enter password >> ");
                tempPassword = scan.nextLine();
                if(verifyLogin(tempUsername, num)){
                    System.out.println("Username already exists");
                } else {
                    break;
                }
            }
            if(num == 1) {
                File AdminiDatabase = new File("adminPasswordDatabase.txt"); // Create a file that can access the database
                FileWriter writer = new FileWriter(AdminiDatabase, true); // Creating a reader with appened mode
                try {
                    writer.append(tempUsername + "," + tempPassword + "\n"); // add the username and password to the database
                    writer.close(); // closing the file
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            } else if (num == 2) {
                File customerDatabase = new File("customerPasswordDatabase.txt"); // Create a file that can access the database
                FileWriter writer2 = new FileWriter(customerDatabase, true); // Creating a reader with appened mode

                try {
                    writer2.append(tempUsername + "," + tempPassword + "\n"); // add the username and password to the database
                    writer2.close(); // closing the file
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        } else{
            System.exit(0);
        }

        return false;
    }

//    public static void registerUser() throws IOException { // registration function
//        String tempUsername = "";
//        String tempPassword = "";
//        System.out.println("==========REGISTRATION==========");
//        while (true) {
//            System.out.print("Enter username >> "); // get the username and password to be added
//            tempUsername = scan.nextLine();
//            System.out.print("Enter password >> ");
//            tempPassword = scan.nextLine();
//            if (verifyLogin(tempUsername)) {
//                System.out.println("Username already exists");
//            } else {
//                break;
//            }
//        }
//        File database = new File("passwordDatabase.txt"); // Create a file that can access the database
//        FileWriter writer = new FileWriter(database, true); // Creating a reader with appened mode
//        try {
//            writer.append(tempUsername + "," + tempPassword + "\n"); // add the username and password to the database
//            writer.close(); // closing the file
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    public static boolean verifyLogin(String username, String password, int num) throws FileNotFoundException {
        // temp user and pass will temporarily hold the data inside the file
        boolean isAuthorized = false;
        String tempUsername = "";
        String tempPassword = "";

        if(num == 1){
            File database = new File("adminPasswordDatabase.txt");
            Scanner readFile = new Scanner(database); // create a reader to the file
            try {
                readFile.useDelimiter("[,\n]"); // read a file in a certain pattern

                // while file isn't finished and not authorized continue to search
                while (readFile.hasNext() && !isAuthorized) {
                    tempUsername = readFile.next();
                    tempPassword = readFile.next();
                    if ((tempUsername.trim().equals(username.trim())) && (tempPassword.trim().equals(password.trim()))) {
                        isAuthorized = true;
                    }
                }

            } catch (Exception ex) {
                System.out.println("Error");
            }
            readFile.close();
            return isAuthorized;
        } else if (num == 2){
            File database = new File("customerPasswordDatabase.txt");
            Scanner readFile = new Scanner(database); // create a reader to the file
            try {
                readFile.useDelimiter("[,\n]"); // read a file in a certain pattern

                // while file isn't finished and not authorized continue to search
                while (readFile.hasNext() && !isAuthorized) {
                    tempUsername = readFile.next();
                    tempPassword = readFile.next();
                    if ((tempUsername.trim().equals(username.trim())) && (tempPassword.trim().equals(password.trim()))) {
                        isAuthorized = true;
                    }
                }

            } catch (Exception ex) {
                System.out.println("Error");
            }
            readFile.close();
            return isAuthorized;
        }
        return isAuthorized;
    }

    //overloading, to check if the username already exists
    public static boolean verifyLogin(String username, int num) throws FileNotFoundException {
        // temp user and pass will temporarily hold the data inside the file
        boolean isAuthorized = false;
        String tempUsername = "";
        if(num == 1) {
            File database = new File("adminPasswordDatabase.txt");
            Scanner readFile = new Scanner(database); // create a reader to the file
            try {
                readFile.useDelimiter("[,\n]"); // read a file in a certain pattern

                // while file isn't finished and not authorized continue to search
                while (readFile.hasNext() && !isAuthorized) {
                    tempUsername = readFile.next();
                    if ((tempUsername.trim().equals(username.trim()))) {
                        isAuthorized = true;
                    }
                }

            } catch (Exception ex) {
                System.out.println("Error");
            }
            readFile.close();
        } else if (num == 2) {
            File database = new File("customerPasswordDatabase.txt");
            Scanner readFile = new Scanner(database); // create a reader to the file
            try {
                readFile.useDelimiter("[,\n]"); // read a file in a certain pattern

                // while file isn't finished and not authorized continue to search
                while (readFile.hasNext() && !isAuthorized) {
                    tempUsername = readFile.next();
                    if ((tempUsername.trim().equals(username.trim()))) {
                        isAuthorized = true;
                    }
                }

            } catch (Exception ex) {
                System.out.println("Error");
            }
            readFile.close();
        }
        return isAuthorized;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
