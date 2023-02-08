package GUI;

import javax.swing.JOptionPane;
import App.*;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TicketsDashboard extends javax.swing.JFrame {

    Customer currentCustomer;
    Connection connection;
    Flight flight;
    public TicketsDashboard(Customer customer) {
        currentCustomer = customer;
        initComponents();
        String flightID = "";
        flight = new Flight();
        try{
            connectToDB();
            PreparedStatement st = connection.prepareStatement("SELECT flightID FROM flyout.booking WHERE passengerUsername = ?");
            st.setString(1, customer.getUsername());
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                flightID = rs.getString("flightID");
            }
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM flyout.flights WHERE flightID = ?");
            pst.setString(1, flightID);
            ResultSet prs = pst.executeQuery();
            if(prs.next()){
                flight.setFlightID(flightID);
                flight.setFlightDepartingCity(prs.getString("departureCity"));
                flight.setFlightArrivingCity(prs.getString("arrivalCity"));
                flight.setFlightDepartingDate(prs.getString("departureDate"));
                flight.setFlightArrivingDate(prs.getString("arrivalDate"));
                flight.setFlightPrice(prs.getDouble("price"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        depLabel.setText(flight.getFlightDepartingCity());
        arrLabel.setText(flight.getFlightArrivingCity());
        depDateLabel.setText(flight.getFlightDepartingDate());
        arrivalDateLabel.setText(flight.getFlightArrivingDate());
        idLabel.setText(flight.getFlightID());
        priceLabel.setText(String.valueOf(flight.getFlightPrice()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        walletsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        flightsButton = new javax.swing.JButton();
        ticketsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        arrLabel = new javax.swing.JLabel();
        depLabel = new javax.swing.JLabel();
        depDateLabel = new javax.swing.JLabel();
        arrivalDateLabel = new javax.swing.JLabel();
        deleteFlightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 560));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Here is your flight details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(223, 223, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Flight ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, -1));

        jLabel4.setText("Departure Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        priceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel6.setText("Price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, -1));

        jLabel7.setText("Arrival");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, -1));

        jLabel8.setText("Arrival Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, -1));

        jLabel9.setText("Departure");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        idLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        arrLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(arrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        depLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(depLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        depDateLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(depDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        arrivalDateLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel2.add(arrivalDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 180));

        deleteFlightButton.setBackground(new java.awt.Color(153, 0, 0));
        deleteFlightButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteFlightButton.setText("DELETE");
        deleteFlightButton.setBorderPainted(false);
        deleteFlightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFlightButton.setFocusPainted(false);
        deleteFlightButton.setFocusable(false);
        deleteFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 520, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
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

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == ticketsButton){
            JOptionPane.showMessageDialog(null, "You are in the tickets page");
        }
    }//GEN-LAST:event_ticketsButtonActionPerformed

    private void flightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == flightsButton){
            flightsDashboard p = new flightsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_flightsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == homeButton){
            customerDashboard p = new customerDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void deleteFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightButtonActionPerformed
        // TODO add your handling code here:
        try{
            connectToDB();
            PreparedStatement pts = connection.prepareStatement("SELECT * FROM flyout.booking WHERE passengerUsername = ?");
            pts.setString(1, currentCustomer.getUsername());
            ResultSet rs = pts.executeQuery();
            if (rs.next()){
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    // User clicked "Yes"
                    PreparedStatement st = connection.prepareStatement("DELETE FROM flyout.booking WHERE passengerUsername = ?");
                    st.setString(1, currentCustomer.getUsername());
                    int rowsDeleted = st.executeUpdate();
                    System.out.println(rowsDeleted + " row(s) deleted.");
                    log(currentCustomer.getUsername() + " Cancelled flight with id " + flight.getFlightID());
                    TicketsDashboard p = new TicketsDashboard(currentCustomer);
                    p.setVisible(true);
                    dispose();
                }
            } else{
                JOptionPane.showMessageDialog(null, "You have no booked flight");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteFlightButtonActionPerformed

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
    
    private static final String LOG_FILE = "log.txt";
   private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        String logLine = now.format(FORMATTER) + ": " + message + System.lineSeparator();

        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.append(logLine);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrLabel;
    private javax.swing.JLabel arrivalDateLabel;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JButton deleteFlightButton;
    private javax.swing.JLabel depDateLabel;
    private javax.swing.JLabel depLabel;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletsButton;
    // End of variables declaration//GEN-END:variables
}
