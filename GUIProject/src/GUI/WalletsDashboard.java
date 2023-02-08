package GUI;
import javax.swing.JOptionPane;
import App.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class WalletsDashboard extends javax.swing.JFrame {
    Connection connection;
    Customer currentCustomer;
    Wallet customerWallet;
    public WalletsDashboard(Customer customer) {
        initComponents();
        currentCustomer = customer;
        customerWallet = new Wallet();
        customerWallet.setUsername(currentCustomer.getUsername());
        customerWallet.setCustomerFirstName(currentCustomer.getCustomerFirstName());
        customerWallet.setCustomerLastName(currentCustomer.getCustomerLastName());
        try{
            connectToDB();
            PreparedStatement st = connection.prepareStatement("SELECT passengerWallet FROM flyout.passengers WHERE passengerUsername = '" +currentCustomer.getUsername() +"'");
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                double wallet = Double.parseDouble(rs.getString("passengerWallet"));
                customerWallet.setWalletMoney(wallet);
            } else{
                System.out.println("Username haven't been found");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        moneyLabel.setText(customerWallet.getWalletMoney() + " Riyals");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        secDate = new javax.swing.JTextField();
        cardNumberTxt = new javax.swing.JTextField();
        CardHolderNameTxt = new javax.swing.JTextField();
        expDateTxt = new javax.swing.JTextField();
        addMoneyButton = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Your Current Wallet");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        moneyLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel2.add(moneyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, 150));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ADD UP YOUR WALLET, TO TRAVEL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secDate.setBackground(new java.awt.Color(242, 242, 242));
        secDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Security Code"));
        jPanel3.add(secDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 50));

        cardNumberTxt.setBackground(new java.awt.Color(242, 242, 242));
        cardNumberTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Number"));
        jPanel3.add(cardNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 50));

        CardHolderNameTxt.setBackground(new java.awt.Color(242, 242, 242));
        CardHolderNameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Holder's Name"));
        jPanel3.add(CardHolderNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 50));

        expDateTxt.setBackground(new java.awt.Color(242, 242, 242));
        expDateTxt.setText("02/2023");
        expDateTxt.setToolTipText("should be : month/year");
        expDateTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Expirition Date"));
        expDateTxt.setName(""); // NOI18N
        expDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateTxtActionPerformed(evt);
            }
        });
        jPanel3.add(expDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 50));
        expDateTxt.getAccessibleContext().setAccessibleDescription("");

        addMoneyButton.setBackground(new java.awt.Color(51, 51, 51));
        addMoneyButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addMoneyButton.setForeground(new java.awt.Color(255, 255, 255));
        addMoneyButton.setText("ADD");
        addMoneyButton.setBorderPainted(false);
        addMoneyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMoneyButton.setFocusPainted(false);
        addMoneyButton.setFocusable(false);
        addMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoneyButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addMoneyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 410, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 780, 560));

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

    private void walletsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == walletsButton){
            JOptionPane.showMessageDialog(null, "You are in the wallet page");
        }
    }//GEN-LAST:event_walletsButtonActionPerformed

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == ticketsButton){
            TicketsDashboard p = new TicketsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ticketsButtonActionPerformed

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
            flightsDashboard p = new flightsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_flightsButtonActionPerformed

    private void addMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoneyButtonActionPerformed
        // TODO add your handling code here:
        String cardHolderName = CardHolderNameTxt.getText();
        String cardNumber = cardNumberTxt.getText();
        String expDate = expDateTxt.getText();
        String securiyCode = secDate.getText();
        
        if(customerWallet.isInputValid(cardNumber, expDate)){
            if(customerWallet.isValid(cardNumber, expDate)){
                String input = JOptionPane.showInputDialog("Enter the amount of money to be taken:");
                int amount = Integer.parseInt(input);
                int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to put " + amount + "?","Confirm", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Transaction completed");
                    customerWallet.setWalletMoney(amount);
                    int curMoney = (int)customerWallet.getWalletMoney();
                    moneyLabel.setText(String.valueOf(curMoney) + " Riyals");
                    try{
                        connectToDB();
                        PreparedStatement st = connection.prepareStatement("UPDATE flyout.passengers SET passengerWallet = ? WHERE passengerUsername = ?");
                        st.setDouble(1, curMoney);
                        st.setString(2, currentCustomer.getUsername());
                        int rowsAffected = st.executeUpdate();
                        System.out.println("Rows affected: " + rowsAffected);
                        st.close();
                        disconnectFromDB();
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Transaction cancelled");
                }
            } else{
                JOptionPane.showMessageDialog(null, "Make sure your card is a Visa, Mastercard, AmericanExpress card");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Input is valid\n make sure exp date is month/year \n make sure to provide a correct card number");
        }
    }//GEN-LAST:event_addMoneyButtonActionPerformed

    private void expDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expDateTxtActionPerformed

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
    private javax.swing.JTextField CardHolderNameTxt;
    private javax.swing.JButton addMoneyButton;
    private javax.swing.JTextField cardNumberTxt;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JTextField expDateTxt;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextField secDate;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletsButton;
    // End of variables declaration//GEN-END:variables
}
