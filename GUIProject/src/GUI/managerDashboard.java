package GUI;
import App.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
public class managerDashboard extends javax.swing.JFrame {
    
    Admin bigBoss;
    Connection connection;
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
        passwordTextField = new javax.swing.JTextField();
        addAdminButton = new javax.swing.JButton();
        usernameTextField = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        firstTextField = new javax.swing.JTextField();
        lastTextField = new javax.swing.JTextField();
        emailTextField1 = new javax.swing.JTextField();

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

        passwordTextField.setBackground(new java.awt.Color(102, 102, 102));
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 50));

        addAdminButton.setBackground(new java.awt.Color(204, 204, 204));
        addAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addAdminButton.setText("ADD");
        addAdminButton.setBorderPainted(false);
        addAdminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAdminButton.setFocusPainted(false);
        addAdminButton.setFocusable(false);
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 40));

        usernameTextField.setBackground(new java.awt.Color(102, 102, 102));
        usernameTextField.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        phoneNumberText.setBackground(new java.awt.Color(102, 102, 102));
        phoneNumberText.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, 50));

        firstTextField.setBackground(new java.awt.Color(102, 102, 102));
        firstTextField.setForeground(new java.awt.Color(255, 255, 255));
        firstTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(firstTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        lastTextField.setBackground(new java.awt.Color(102, 102, 102));
        lastTextField.setForeground(new java.awt.Color(255, 255, 255));
        lastTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(lastTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 210, 50));

        emailTextField1.setBackground(new java.awt.Color(102, 102, 102));
        emailTextField1.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-MAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.add(emailTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 50));

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
        if(evt.getSource() == updateButton){
            JOptionPane.showMessageDialog(null, "You are in the adding admins page");
        }
    }//GEN-LAST:event_addingButtonActionPerformed

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String firstName = firstTextField.getText();
        String lastName = lastTextField.getText();
        String email = emailTextField1.getText();
        String phoneNumber = phoneNumberText.getText();
        
        try{
            connectToDB();
            PreparedStatement st =  connection.prepareStatement("INSERT INTO admins (adminUsername,adminPassword,adminFirstName,adminLastName,adminEmail,adminPhone,isManager) VALUES (?,?,?,?,?,?,?)");
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, firstName);
            st.setString(4, lastName);
            st.setString(5, email);
            st.setString(6, phoneNumber);
            st.setBoolean(7, false);
            st.executeUpdate();
            System.out.println("Informations have been sent successfully");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void flightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButtonActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == flightsButton){
            AdminDashboard p = new AdminDashboard(bigBoss);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_flightsButtonActionPerformed
    public void connectToDB(){
       try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyout?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1234");
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
    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JButton addingButton;
    private javax.swing.JPanel darkLabelCustomer1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JTextField firstTextField;
    private javax.swing.JButton flightsButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastTextField;
    private javax.swing.JButton outButton;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
