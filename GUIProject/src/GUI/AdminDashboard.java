package GUI;
import App.*;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.ParseException;
import java.sql.*;
import java.util.Calendar;

public class AdminDashboard extends javax.swing.JFrame {
    Admin admin;
    int dday, dmonth, dyear, aday, amonth, ayear, seats;
    Connection connection;
    public AdminDashboard(Admin ad) {
        admin = ad;       
        System.out.println(admin.getIsManager());
        initComponents();
        addingButton.setVisible(admin.getIsManager());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        addingButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        seatsTxt = new javax.swing.JTextField();
        dyText = new javax.swing.JTextField();
        departText = new javax.swing.JTextField();
        dDayText = new javax.swing.JTextField();
        dMText = new javax.swing.JTextField();
        adText = new javax.swing.JTextField();
        amTExt = new javax.swing.JTextField();
        ayText = new javax.swing.JTextField();
        arrivalText = new javax.swing.JTextField();
        addFlighButton = new javax.swing.JButton();
        priceTetx = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        darkLabelCustomer.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 180, 50));

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
        darkLabelCustomer.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 40));

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
        darkLabelCustomer.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 240, 40));

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
        darkLabelCustomer.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 210, 230, 40));

        addingButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addingButton.setForeground(new java.awt.Color(223, 223, 223));
        addingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/user-add.png"))); // NOI18N
        addingButton.setText("ADDING ADMIN");
        addingButton.setBorderPainted(false);
        addingButton.setContentAreaFilled(false);
        addingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addingButton.setFocusPainted(false);
        addingButton.setFocusable(false);
        addingButton.setIconTextGap(8);
        addingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(addingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 40));

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Adding flight details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seatsTxt.setBackground(new java.awt.Color(102, 102, 102));
        seatsTxt.setForeground(new java.awt.Color(255, 255, 255));
        seatsTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(seatsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 100, 50));

        dyText.setBackground(new java.awt.Color(102, 102, 102));
        dyText.setForeground(new java.awt.Color(255, 255, 255));
        dyText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(dyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, 50));

        departText.setBackground(new java.awt.Color(102, 102, 102));
        departText.setForeground(new java.awt.Color(255, 255, 255));
        departText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Depart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        departText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departTextActionPerformed(evt);
            }
        });
        jPanel3.add(departText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 50));

        dDayText.setBackground(new java.awt.Color(102, 102, 102));
        dDayText.setForeground(new java.awt.Color(255, 255, 255));
        dDayText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(dDayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 80, 50));

        dMText.setBackground(new java.awt.Color(102, 102, 102));
        dMText.setForeground(new java.awt.Color(255, 255, 255));
        dMText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(dMText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 80, 50));

        adText.setBackground(new java.awt.Color(102, 102, 102));
        adText.setForeground(new java.awt.Color(255, 255, 255));
        adText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(adText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, 50));

        amTExt.setBackground(new java.awt.Color(102, 102, 102));
        amTExt.setForeground(new java.awt.Color(255, 255, 255));
        amTExt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(amTExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 80, 50));

        ayText.setBackground(new java.awt.Color(102, 102, 102));
        ayText.setForeground(new java.awt.Color(255, 255, 255));
        ayText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(ayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, 50));

        arrivalText.setBackground(new java.awt.Color(102, 102, 102));
        arrivalText.setForeground(new java.awt.Color(255, 255, 255));
        arrivalText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arrival", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(arrivalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 50));

        addFlighButton.setBackground(new java.awt.Color(204, 204, 204));
        addFlighButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addFlighButton.setText("ADD");
        addFlighButton.setBorderPainted(false);
        addFlighButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addFlighButton.setFocusPainted(false);
        addFlighButton.setFocusable(false);
        addFlighButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlighButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addFlighButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 150, 40));

        priceTetx.setBackground(new java.awt.Color(102, 102, 102));
        priceTetx.setForeground(new java.awt.Color(255, 255, 255));
        priceTetx.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(priceTetx, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 50));

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
        if (evt.getSource() == updateButton){
            updatingFlight p = new updatingFlight(admin);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == addButton){
            JOptionPane.showMessageDialog(null, "You are in the adding flights page");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void addFlighButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlighButtonActionPerformed
        // TODO add your handling code here:
        String flightID = admin.getUniqueRandomString();        
        String depart = departText.getText();
        String arrival = arrivalText.getText();
        
        validateDateD();
        validateDateA();
        
        Double price = 200.0;
        
          try {
            NumberFormat format = NumberFormat.getNumberInstance();
            Number number = format.parse(priceTetx.getText());
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
          // sending to the database
          try{
              connectToDB();
              PreparedStatement st =  connection.prepareStatement("INSERT INTO flyout.flights (flightID, departureCity,arrivalCity,departureDate,arrivalDate,price,adminUsername,seats) VALUES (?,?,?,?,?,?,?,?)");
              st.setString(1, flightID);
              st.setString(2, depart);
              st.setString(3, arrival);
              st.setDate(4, date);
              st.setDate(5, dateA);
              st.setDouble(6, price);
              st.setString(7,admin.getUsername());
              st.setInt(8, seats);
              st.executeUpdate();
              System.out.println("Informations have been sent successfully");
          }
          catch(SQLException e){
              System.out.println("information have failed to be sent");
              e.printStackTrace();
          }
    }//GEN-LAST:event_addFlighButtonActionPerformed

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
    private void validateDateD() {
        try {
            int day = Integer.parseInt(dDayText.getText());
            int month = Integer.parseInt(dMText.getText());
            int year = Integer.parseInt(dyText.getText());
            int sets = Integer.parseInt(seatsTxt.getText());

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
            int day = Integer.parseInt(adText.getText());
            int month = Integer.parseInt(amTExt.getText());
            int year = Integer.parseInt(ayText.getText());

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
    private void addingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == addingButton){
            managerDashboard p = new managerDashboard(admin);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_addingButtonActionPerformed

    private void departTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adText;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addFlighButton;
    private javax.swing.JButton addingButton;
    private javax.swing.JTextField amTExt;
    private javax.swing.JTextField arrivalText;
    private javax.swing.JTextField ayText;
    private javax.swing.JTextField dDayText;
    private javax.swing.JTextField dMText;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField departText;
    private javax.swing.JTextField dyText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField priceTetx;
    private javax.swing.JTextField seatsTxt;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
