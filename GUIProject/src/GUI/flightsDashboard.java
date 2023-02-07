package GUI;
import App.*;
import com.itextpdf.text.pdf.security.TSAClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class flightsDashboard extends javax.swing.JFrame {
    Connection connection;
    int dday, dmonth, dyear, aday, amonth, ayear;
    String customerFirstName, userChoice;
    private String text;
    private String text1;
    private int index;
    private int index1;
    private Timer timer;
    private Timer timer1;
    Customer currentCustomer;
    public flightsDashboard(String s, Customer customerUser){
        userChoice = s;
        currentCustomer = customerUser;
        String customerFirstName = customerUser.getCustomerFirstName();
        text = "Hello, " + customerFirstName;
        index = 0;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    jLabel1.setText(jLabel1.getText() + text.charAt(index));
                    index++;
                } else {
                    timer.stop();
                }
            }
        });
        timer.start();
        initComponents();
    }
    public flightsDashboard(Customer customerUser){
        currentCustomer = customerUser;
        String customerFirstName = customerUser.getCustomerFirstName();
        text = "Hello, " + customerFirstName;
        index = 0;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    jLabel1.setText(jLabel1.getText() + text.charAt(index));
                    index++;
                } else {
                    timer.stop();
                }
            }
        });
        timer.start();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aytxt = new javax.swing.JTextField();
        depTxt = new javax.swing.JTextField();
        arrTxt = new javax.swing.JTextField();
        adtxt = new javax.swing.JTextField();
        amtxt = new javax.swing.JTextField();
        ddtxt = new javax.swing.JTextField();
        dmtxt = new javax.swing.JTextField();
        dytxt = new javax.swing.JTextField();
        searchFlightsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        walletsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        flightsButton = new javax.swing.JButton();
        ticketsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(844, 531));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fill in the needed information, to travel with Flyout wherever you desire");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(223, 223, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aytxt.setBackground(new java.awt.Color(223, 223, 223));
        aytxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Year"));
        aytxt.setCaretColor(new java.awt.Color(51, 51, 51));
        aytxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        aytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aytxtActionPerformed(evt);
            }
        });
        jPanel2.add(aytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 80, 50));

        depTxt.setBackground(new java.awt.Color(223, 223, 223));
        depTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Departure"));
        depTxt.setCaretColor(new java.awt.Color(51, 51, 51));
        depTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(depTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 50));

        arrTxt.setBackground(new java.awt.Color(223, 223, 223));
        arrTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Arrival"));
        arrTxt.setCaretColor(new java.awt.Color(51, 51, 51));
        arrTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(arrTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 50));

        adtxt.setBackground(new java.awt.Color(223, 223, 223));
        adtxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Day"));
        adtxt.setCaretColor(new java.awt.Color(51, 51, 51));
        adtxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(adtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 50));

        amtxt.setBackground(new java.awt.Color(223, 223, 223));
        amtxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Month"));
        amtxt.setCaretColor(new java.awt.Color(51, 51, 51));
        amtxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        amtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtxtActionPerformed(evt);
            }
        });
        jPanel2.add(amtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 50));

        ddtxt.setBackground(new java.awt.Color(223, 223, 223));
        ddtxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Day"));
        ddtxt.setCaretColor(new java.awt.Color(51, 51, 51));
        ddtxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(ddtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 80, 50));

        dmtxt.setBackground(new java.awt.Color(223, 223, 223));
        dmtxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Month"));
        dmtxt.setCaretColor(new java.awt.Color(51, 51, 51));
        dmtxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        dmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmtxtActionPerformed(evt);
            }
        });
        jPanel2.add(dmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, 50));

        dytxt.setBackground(new java.awt.Color(223, 223, 223));
        dytxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Year"));
        dytxt.setCaretColor(new java.awt.Color(51, 51, 51));
        dytxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(dytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, 50));

        searchFlightsButton.setBackground(new java.awt.Color(48, 48, 48));
        searchFlightsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchFlightsButton.setForeground(new java.awt.Color(255, 255, 255));
        searchFlightsButton.setText("Serach");
        searchFlightsButton.setBorderPainted(false);
        searchFlightsButton.setFocusPainted(false);
        searchFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightsButtonActionPerformed(evt);
            }
        });
        jPanel2.add(searchFlightsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Where Do You Want To Travel?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 780, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 780, 720));

        darkLabelCustomer.setBackground(new java.awt.Color(70, 70, 70));
        darkLabelCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 223, 223));
        jLabel2.setText("FLYOUT");
        darkLabelCustomer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 50));

        logoutButton.setBackground(new java.awt.Color(223, 223, 223));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(48, 48, 48));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/exit (1).png"))); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.setBorder(null);
        logoutButton.setFocusPainted(false);
        logoutButton.setIconTextGap(7);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, 40));

        walletsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        walletsButton.setForeground(new java.awt.Color(223, 223, 223));
        walletsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\zuchv\\Downloads\\wallet.png")); // NOI18N
        walletsButton.setText("WALLET");
        walletsButton.setBorderPainted(false);
        walletsButton.setContentAreaFilled(false);
        walletsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walletsButton.setFocusPainted(false);
        walletsButton.setFocusable(false);
        walletsButton.setIconTextGap(8);
        walletsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletsButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(walletsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 40));

        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(223, 223, 223));
        homeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\zuchv\\Downloads\\home.png")); // NOI18N
        homeButton.setText("HOME");
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setFocusable(false);
        homeButton.setIconTextGap(8);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 40));

        flightsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flightsButton.setForeground(new java.awt.Color(223, 223, 223));
        flightsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\zuchv\\Downloads\\departures.png")); // NOI18N
        flightsButton.setText("FLIGHTS");
        flightsButton.setBorderPainted(false);
        flightsButton.setContentAreaFilled(false);
        flightsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flightsButton.setFocusPainted(false);
        flightsButton.setFocusable(false);
        flightsButton.setIconTextGap(8);
        flightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightsButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(flightsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 40));

        ticketsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ticketsButton.setForeground(new java.awt.Color(223, 223, 223));
        ticketsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/plane-tickets.png"))); // NOI18N
        ticketsButton.setText("TICKETS");
        ticketsButton.setBorderPainted(false);
        ticketsButton.setContentAreaFilled(false);
        ticketsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticketsButton.setFocusPainted(false);
        ticketsButton.setFocusable(false);
        ticketsButton.setIconTextGap(8);
        ticketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(ticketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 40));

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtxtActionPerformed

    private void dmtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmtxtActionPerformed

    private void aytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aytxtActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == logoutButton){
            mainLoginPage p = new mainLoginPage();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void walletsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == walletsButton){
            WalletsDashboard p = new WalletsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_walletsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == homeButton){
            customerDashboard p = new customerDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void flightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == flightsButton){
            JOptionPane.showMessageDialog(null, "You are in the flights page");
        }
    }//GEN-LAST:event_flightsButtonActionPerformed

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == ticketsButton){
            TicketsDashboard p = new TicketsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ticketsButtonActionPerformed

    private void searchFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightsButtonActionPerformed
        // TODO add your handling code here:
        String departCity = depTxt.getText();
        String arrivalCity = arrTxt.getText();
        double price = 0.0;
        int seats = 0;
        
        validateDateD();
        validateDateA();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, dyear);
        calendar.set(Calendar.MONTH, dmonth - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dday);
        Date date = new Date(calendar.getTimeInMillis());

        Calendar calendarA = Calendar.getInstance();
        calendarA.set(Calendar.YEAR, ayear);
        calendarA.set(Calendar.MONTH, amonth-1);
        calendarA.set(Calendar.DAY_OF_MONTH, aday);
        Date dateA = new Date(calendarA.getTimeInMillis());
        
        Flight flight = new Flight();
        flight.setFlightDepartingCity(departCity);
        flight.setFlightArrivingCity(arrivalCity);
        flight.setFlightDepartingDate(String.valueOf(date));
        flight.setFlightArrivingDate(String.valueOf(dateA));
        
        try{
        connectToDB();
        Statement st = connection.createStatement();
        String query = "SELECT * FROM flyout.flights WHERE departureCity = '" + departCity + "' AND arrivalCity = '"+ arrivalCity +"' AND departureDate = '" + date + "' AND arrivalDate = '" + dateA + "'" ;
        //System.out.println(query);
        ResultSet rs = st.executeQuery(query);
        if(rs.next()){
            tableForm p = new tableForm(flight, currentCustomer);
            p.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No flight with these details have been found");
        }
        disconnectFromDB();
        } catch (SQLException e){
            System.out.println("Something went wrong searching for a flight");
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchFlightsButtonActionPerformed
    private void validateDateD() {
        try {
            int day = Integer.parseInt(ddtxt.getText());
            int month = Integer.parseInt(dmtxt.getText());
            int year = Integer.parseInt(dytxt.getText());

            if (day < 1 || day > 31) {
                throw new Exception("Day must be between 1 and 31");
            }
            if (month < 1 || month > 12) {
                throw new Exception("Month must be between 1 and 12");
            }
            if (year < 0) {
                throw new Exception("Year must be positive");
            }
            //JOptionPane.showMessageDialog(this, "Valid date");
            dday = day;
            dmonth = month;
            dyear = year;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input: Must be an integer");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void validateDateA() {
        try {
            int day = Integer.parseInt(adtxt.getText());
            int month = Integer.parseInt(amtxt.getText());
            int year = Integer.parseInt(aytxt.getText());

            if (day < 1 || day > 31) {
                throw new Exception("Day must be between 1 and 31");
            }
            if (month < 1 || month > 12) {
                throw new Exception("Month must be between 1 and 12");
            }
            if (year < 0) {
                throw new Exception("Year must be positive");
            }

            //JOptionPane.showMessageDialog(this, "Valid date");
            aday = day;
            amonth = month;
            ayear = year;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input: Must be an integer");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    public void connectToDB(){
       try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyout?zeroDateTimeBehavior=CONVERT_TO_NULL",
               "root", "1234");
       System.out.println("Connected");
       } catch(SQLException e){
           System.out.println("Unable to connect");
           e.printStackTrace();
       }
    } 
    public void disconnectFromDB() {
    try {
      connection.close();
      System.out.println("Disconnected");
    } catch (SQLException e) {
      System.out.println("Unable to disconnect");
      e.printStackTrace();
    }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adtxt;
    private javax.swing.JTextField amtxt;
    private javax.swing.JTextField arrTxt;
    private javax.swing.JTextField aytxt;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JTextField ddtxt;
    private javax.swing.JTextField depTxt;
    private javax.swing.JTextField dmtxt;
    private javax.swing.JTextField dytxt;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton searchFlightsButton;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletsButton;
    // End of variables declaration//GEN-END:variables
}
