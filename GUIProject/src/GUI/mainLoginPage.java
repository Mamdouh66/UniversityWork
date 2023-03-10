/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import App.*;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class mainLoginPage extends javax.swing.JFrame {

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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
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
        boolean isAdmin = false;
        //String accessChoice = accessComboBox.getActionCommand();
        if (username.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null, "Both username and password fields are empty");
        } else if (username.equals("") && !password.equals("")){
            JOptionPane.showMessageDialog(null, "username field is empty");
        } else if (!username.equals("") && password.equals(""))
            JOptionPane.showMessageDialog(null, "password field is empty");
          else if (evt.getSource() == signInButton) {
            String usernameVal = usernameTextField.getText();
            char[] passwordVal = passwordTextField.getPassword();
            boolean isHe = false;
            connectToDB();
            try {
                Statement st = connection.createStatement();
                Statement stA = connection.createStatement();
                String query = "SELECT * FROM passengers WHERE passengerUsername = '" + username + "'";
                ResultSet resultSet = st.executeQuery(query);
                
                //admin query
                String queryA = "SELECT * FROM admins WHERE adminUsername = '" + username + "'";
                ResultSet resultSetA = stA.executeQuery(queryA);
                if (resultSet.next()) {
//                customer.setUsername(resultSet.getString("passengerUsername"));
                String correctPassword = resultSet.getString("passengerPassword");
                correctPassword = decrypt(correctPassword);
                // information from database
                String correctEmail = resultSet.getString("passengerEmail");
                String firstName = resultSet.getString("passengerFirstName");
                String lastName = resultSet.getString("passengerLastName");
                String phoneNumber = resultSet.getString("passengerPhone");
                String passHistory = resultSet.getString("passengerHistory");
                int wallet = (int)resultSet.getDouble("passengerWallet");
                System.out.println(correctPassword);
                // check if username and password match the stored values
                    if (new String(passwordVal).equals(correctPassword)) {
        //                JOptionPane.showMessageDialog(null, "Login successful!");
                            Customer customer = new Customer(firstName,lastName,password,correctEmail,phoneNumber,username,passHistory);
                            log(username + " has logged in");
                            customerDashboard p = new customerDashboard(customer);
                            p.setVisible(true);
                            dispose();
                        } 
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password.");
                        }
                } 
                else if (resultSetA.next()){
                    String correctedPassword = resultSetA.getString("adminPassword");
                    String adminFName = resultSetA.getString("adminFirstName");
                    String adminLName = resultSetA.getString("adminLastName");
                    String adminEmail = resultSetA.getString("adminEmail");
                    String adminPhone = resultSetA.getString("adminPhone");
                    boolean admingIsManager = resultSetA.getBoolean("isManager");

                    if (new String(passwordVal).equals(correctedPassword)){
                        Admin admin = new Admin(adminFName, adminLName, username, correctedPassword, adminPhone, adminEmail, admingIsManager);
                        log(username + " has logged in");
                        AdminDashboard p = new AdminDashboard(admin);
                        p.setVisible(true);
                        dispose();
                        }  
                        else{
                        JOptionPane.showMessageDialog(null, "username or password is incorrect");                        
                        }
                    }  
                else{
                    JOptionPane.showMessageDialog(null, "username was not found");
                    System.out.println("User not found");
                }
            } catch (SQLException ex) {
                Logger.getLogger(mainLoginPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(mainLoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
        }
    }//GEN-LAST:event_signInButtonActionPerformed

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
    
    // Decrypt the password
    private static final String ALGO = "AES";
    private static final byte[] keyValue =
            new byte[] {'T', 'h', 'e', 'B', 'e', 's', 't',
                    'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y'};
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGO);
    }
       public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        return new String(decValue);
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
