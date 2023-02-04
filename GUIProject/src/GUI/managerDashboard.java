package GUI;
import App.*;
public class managerDashboard extends javax.swing.JFrame {
    
    Admin bigBoss;
    public managerDashboard(Admin manager) {
        bigBoss = manager;
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        darkLabelCustomer1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        outButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addingButton = new javax.swing.JButton();
        flightsButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        darkLabelCustomer1.setBackground(new java.awt.Color(70, 70, 70));
        darkLabelCustomer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(223, 223, 223));
        jLabel4.setText("FLYOUT");
        darkLabelCustomer1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 50));

        outButton.setBackground(new java.awt.Color(223, 223, 223));
        outButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        outButton.setForeground(new java.awt.Color(48, 48, 48));
        outButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/exit (1).png"))); // NOI18N
        outButton.setText("LOGOUT");
        outButton.setBorder(null);
        outButton.setFocusPainted(false);
        outButton.setIconTextGap(7);
        outButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer1.add(outButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 50));

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
        darkLabelCustomer1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

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
        darkLabelCustomer1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 240, 40));

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
        darkLabelCustomer1.add(addingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 40));

        flightsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flightsButton.setForeground(new java.awt.Color(223, 223, 223));
        flightsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/add.png"))); // NOI18N
        flightsButton.setText("ADD FLIGHTS");
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
        darkLabelCustomer1.add(flightsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 220, 230, 40));

        getContentPane().add(darkLabelCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Adding Admin Details");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 40));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField13.setBackground(new java.awt.Color(102, 102, 102));
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 50));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 40));

        jTextField15.setBackground(new java.awt.Color(102, 102, 102));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jTextField16.setBackground(new java.awt.Color(102, 102, 102));
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, 50));

        jTextField17.setBackground(new java.awt.Color(102, 102, 102));
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        jTextField18.setBackground(new java.awt.Color(102, 102, 102));
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 210, 50));

        jTextField19.setBackground(new java.awt.Color(102, 102, 102));
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-MAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 260));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 490, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == outButton){
            mainLoginPage p = new mainLoginPage();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_outButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == deleteButton){
            deletingDashboard p = new deletingDashboard(bigBoss);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == updateButton){
            updatingFlight p = new updatingFlight(bigBoss);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addingButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == addingButton){
            AdminDashboard p = new AdminDashboard(bigBoss);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_addingButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void flightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightsButtonActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addingButton;
    private javax.swing.JPanel darkLabelCustomer1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JButton outButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
