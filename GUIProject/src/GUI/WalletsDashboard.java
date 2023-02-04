/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import App.*;

public class WalletsDashboard extends javax.swing.JFrame {
    
    Customer currentCustomer;
    public WalletsDashboard(Customer customer) {
        currentCustomer = customer;
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("0.0 Riyals");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, 150));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ADD UP YOUR WALLET, TO TRAVEL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Security Code"));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 50));

        jTextField2.setBackground(new java.awt.Color(242, 242, 242));
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Number"));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 50));

        jTextField3.setBackground(new java.awt.Color(242, 242, 242));
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Holder's Name"));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 50));

        jTextField4.setBackground(new java.awt.Color(242, 242, 242));
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Expirition Date"));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 120, 40));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletsButton;
    // End of variables declaration//GEN-END:variables
}
