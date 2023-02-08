package GUI;
import App.*;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class updatingFlight extends javax.swing.JFrame {
    Admin admin;
    Connection connection;
    int dday, dmonth, dyear, aday, amonth, ayear, seats;
    public updatingFlight(Admin ad) {
        admin = ad;
        initComponents();
        addingButton1.setVisible(admin.getIsManager());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        addingButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pricetxt = new javax.swing.JTextField();
        dytxt = new javax.swing.JTextField();
        flightTxt = new javax.swing.JTextField();
        ddaytxt = new javax.swing.JTextField();
        dmtxt = new javax.swing.JTextField();
        adtxt = new javax.swing.JTextField();
        amtxt = new javax.swing.JTextField();
        aytxt = new javax.swing.JTextField();
        arrivaltext = new javax.swing.JTextField();
        updateDetails = new javax.swing.JButton();
        departTXt = new javax.swing.JTextField();
        seatstxt = new javax.swing.JTextField();

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
        darkLabelCustomer.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(223, 223, 223));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/cross (3).png"))); // NOI18N
        deleteButton.setText("DELETE FLIGHT");
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusPainted(false);
        deleteButton.setFocusable(false);
        deleteButton.setIconTextGap(8);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 40));

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(223, 223, 223));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/refresh.png"))); // NOI18N
        updateButton.setText("UPDATE FLIGHTS");
        updateButton.setBorderPainted(false);
        updateButton.setContentAreaFilled(false);
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.setFocusPainted(false);
        updateButton.setFocusable(false);
        updateButton.setIconTextGap(8);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 240, 40));

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(223, 223, 223));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add.png"))); // NOI18N
        addButton.setText("ADD FLIGHTS");
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setFocusPainted(false);
        addButton.setFocusable(false);
        addButton.setIconTextGap(8);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 220, 230, 40));

        addingButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addingButton1.setForeground(new java.awt.Color(223, 223, 223));
        addingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/user-add.png"))); // NOI18N
        addingButton1.setText("ADDING ADMIN");
        addingButton1.setBorderPainted(false);
        addingButton1.setContentAreaFilled(false);
        addingButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addingButton1.setFocusPainted(false);
        addingButton1.setFocusable(false);
        addingButton1.setIconTextGap(8);
        addingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingButton1ActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(addingButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 40));

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Updating flight details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pricetxt.setBackground(new java.awt.Color(102, 102, 102));
        pricetxt.setForeground(new java.awt.Color(255, 255, 255));
        pricetxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 50));

        dytxt.setBackground(new java.awt.Color(102, 102, 102));
        dytxt.setForeground(new java.awt.Color(255, 255, 255));
        dytxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(dytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 80, 50));

        flightTxt.setBackground(new java.awt.Color(102, 102, 102));
        flightTxt.setForeground(new java.awt.Color(255, 255, 255));
        flightTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flight ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(flightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        ddaytxt.setBackground(new java.awt.Color(102, 102, 102));
        ddaytxt.setForeground(new java.awt.Color(255, 255, 255));
        ddaytxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(ddaytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 50));

        dmtxt.setBackground(new java.awt.Color(102, 102, 102));
        dmtxt.setForeground(new java.awt.Color(255, 255, 255));
        dmtxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(dmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 80, 50));

        adtxt.setBackground(new java.awt.Color(102, 102, 102));
        adtxt.setForeground(new java.awt.Color(255, 255, 255));
        adtxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(adtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, 50));

        amtxt.setBackground(new java.awt.Color(102, 102, 102));
        amtxt.setForeground(new java.awt.Color(255, 255, 255));
        amtxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(amtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 80, 50));

        aytxt.setBackground(new java.awt.Color(102, 102, 102));
        aytxt.setForeground(new java.awt.Color(255, 255, 255));
        aytxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(aytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, 50));

        arrivaltext.setBackground(new java.awt.Color(102, 102, 102));
        arrivaltext.setForeground(new java.awt.Color(255, 255, 255));
        arrivaltext.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arrival", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(arrivaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 50));

        updateDetails.setBackground(new java.awt.Color(204, 204, 204));
        updateDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateDetails.setText("UPDATE");
        updateDetails.setBorderPainted(false);
        updateDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateDetails.setFocusPainted(false);
        updateDetails.setFocusable(false);
        updateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsActionPerformed(evt);
            }
        });
        jPanel3.add(updateDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, 40));

        departTXt.setBackground(new java.awt.Color(102, 102, 102));
        departTXt.setForeground(new java.awt.Color(255, 255, 255));
        departTXt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Depart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        departTXt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departTXtActionPerformed(evt);
            }
        });
        jPanel3.add(departTXt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 50));

        seatstxt.setBackground(new java.awt.Color(102, 102, 102));
        seatstxt.setForeground(new java.awt.Color(255, 255, 255));
        seatstxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(seatstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 100, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 490, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == logoutButton){
            mainLoginPage p = new mainLoginPage();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == deleteButton){
            deletingDashboard p = new deletingDashboard(admin);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == updateButton){
            JOptionPane.showMessageDialog(null, "You are in the updating flights page");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == addButton){
            AdminDashboard p = new AdminDashboard(admin);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsActionPerformed
        // TODO add your handling code here:
        String flightID = flightTxt.getText();
        String departString = departTXt.getText();
        String arrivalText = arrivaltext.getText();
        Double price = 200.0;
        
        validateDateD();
        validateDateA();
        
          try {
            NumberFormat format = NumberFormat.getNumberInstance();
            Number number = format.parse(pricetxt.getText());
            price = number.doubleValue();

          } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid input: Must be a valid price");
          }
        
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
        
        try{
            connectToDB();
            PreparedStatement st = connection.prepareStatement("UPDATE flyout.flights SET departureCity = ?, arrivalCity = ?, departureDate = ?, arrivalDate = ?, price = ?, adminUsername = ?, seats = ? WHERE flightID = ?");
            st.setString(1, departString);
            st.setString(2, arrivalText);
            st.setDate(3, date);
            st.setDate(4, dateA);
            st.setDouble(5, price);
            st.setString(6, admin.getUsername());
            st.setInt(7, seats);
            st.setString(8, flightID);            
            int rowsAffected = st.executeUpdate();
            log(admin.getUsername() + " have updated a fligh");
            System.out.println("Rows affected: " + rowsAffected);
            st.close();
            disconnectFromDB();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateDetailsActionPerformed
    private void validateDateD() {
        try {
            int day = Integer.parseInt(ddaytxt.getText());
            int month = Integer.parseInt(dmtxt.getText());
            int year = Integer.parseInt(dytxt.getText());
            int sets = Integer.parseInt(seatstxt.getText());

            if (day < 1 || day > 31) {
                throw new Exception("Day must be between 1 and 31");
            }
            if (month < 1 || month > 12) {
                throw new Exception("Month must be between 1 and 12");
            }
            if (year < 0) {
                throw new Exception("Year must be positive");
            }
            if ((sets < 0) || (sets >= 120))
                throw new Exception("Seats must be between 1 and 120");
            //JOptionPane.showMessageDialog(this, "Valid date");
            dday = day;
            dmonth = month;
            dyear = year;
            seats = sets;
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
    private void departTXtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departTXtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departTXtActionPerformed

    private void addingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingButton1ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == addingButton1){
            managerDashboard p = new managerDashboard(admin);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_addingButton1ActionPerformed

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
    private javax.swing.JButton addButton;
    private javax.swing.JButton addingButton1;
    private javax.swing.JTextField adtxt;
    private javax.swing.JTextField amtxt;
    private javax.swing.JTextField arrivaltext;
    private javax.swing.JTextField aytxt;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JTextField ddaytxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField departTXt;
    private javax.swing.JTextField dmtxt;
    private javax.swing.JTextField dytxt;
    private javax.swing.JTextField flightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField seatstxt;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateDetails;
    // End of variables declaration//GEN-END:variables
}
