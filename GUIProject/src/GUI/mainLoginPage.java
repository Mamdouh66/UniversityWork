/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


/**
 *
 * @author zuchv
 */
public class mainLoginPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private String text;
    private String text1;
    private int index;
    private int index1;
    private Timer timer;
    private Timer timer1;
    Connection connection;
    
    String DatabaseURL = "jdbc:mysql://localhost:3306/flyout?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String databaseUsername = "root";
    String databasePassword = "1234";
    
    public mainLoginPage() {
        text = "Welcome to flyout";
        index = 0;
        timer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    welcomeLabel.setText(welcomeLabel.getText() + text.charAt(index));
                    index++;
                } else {
                    timer.stop();
                    timer1.start();
                }
            }
        });
        timer.start();
        text1 = "Hurry, fly with us!";
        index1 = 0;
        timer1 = new Timer(150, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (index1 < text1.length()) {
                    hurryLabel.setText(hurryLabel.getText() + text1.charAt(index1));
                    index1++;
                } else {
                    timer1.stop();
                }
            }
        });
       
        initComponents();
    }

    public void connectToDB(){
       try{
       connection = DriverManager.getConnection(DatabaseURL, databaseUsername, databasePassword);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        accessComboBox = new javax.swing.JComboBox<>();
        signInButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        hurryLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/virtual-reality.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(360, 520));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 560));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.setBackground(new java.awt.Color(48, 48, 48));
        usernameTextField.setForeground(new java.awt.Color(223, 223, 223));
        usernameTextField.setToolTipText("Enter Your Username");
        usernameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        usernameTextField.setCaretColor(new java.awt.Color(223, 223, 223));
        usernameTextField.setSelectionColor(new java.awt.Color(204, 204, 204));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 220, 40));

        passwordTextField.setBackground(new java.awt.Color(48, 48, 48));
        passwordTextField.setForeground(new java.awt.Color(223, 223, 223));
        passwordTextField.setToolTipText("Enter Your Password");
        passwordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        passwordTextField.setCaretColor(new java.awt.Color(223, 223, 223));
        passwordTextField.setSelectionColor(new java.awt.Color(223, 223, 223));
        jPanel2.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 40));

        accessComboBox.setBackground(new java.awt.Color(223, 223, 223));
        accessComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        accessComboBox.setMaximumRowCount(2);
        accessComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        accessComboBox.setToolTipText("Which type of user are you");
        accessComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        accessComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(accessComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, -1));

        signInButton.setBackground(new java.awt.Color(223, 223, 223));
        signInButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(48, 48, 48));
        signInButton.setText("Sign in");
        signInButton.setBorderPainted(false);
        signInButton.setFocusable(false);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 30));

        registerButton.setBackground(new java.awt.Color(48, 48, 48));
        registerButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(223, 223, 223));
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 223, 223)));
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registerButton.setFocusable(false);
        registerButton.setOpaque(true);
        registerButton.setSelected(true);
        registerButton.setVerifyInputWhenFocusTarget(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 100, 30));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 223, 223));
        jLabel1.setText("No Account?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 354, 70, -1));

        welcomeLabel.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                welcomeLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        welcomeLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                welcomeLabelComponentShown(evt);
            }
        });
        jPanel2.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 40));

        hurryLabel.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        hurryLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(hurryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Made with love @ Khobar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String accessChoice = accessComboBox.getActionCommand();
        if (username.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null, "Both username and password fields are empty");
        } else if (username.equals("") && !password.equals("")){
            JOptionPane.showMessageDialog(null, "username field is empty");
        } else if (!username.equals("") && password.equals(""))
            JOptionPane.showMessageDialog(null, "password field is empty");
          else if (evt.getSource() == signInButton) {
            String usernameVal = usernameTextField.getText();
            char[] passwordVal = passwordTextField.getPassword();
          
            // check if username and password match the stored values
                 if (username.equals("admin") && new String(passwordVal).equals("password")) {
//                JOptionPane.showMessageDialog(null, "Login successful!");
                customerDashboard p = new customerDashboard();
                p.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        
        
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void accessComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessComboBoxActionPerformed

    private void welcomeLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_welcomeLabelAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_welcomeLabelAncestorAdded

    private void welcomeLabelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_welcomeLabelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeLabelComponentShown

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        SignUpPage p = new SignUpPage();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessComboBox;
    private javax.swing.JLabel hurryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}