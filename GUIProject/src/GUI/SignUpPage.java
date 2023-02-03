
package GUI;
import App.*;
import App.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;



public class SignUpPage extends javax.swing.JFrame {
    
    Connection connection;
    public SignUpPage() {
        initComponents();
    }
    // checks if password is powerful
    public static boolean isPasswordPowerful(String password) {
        // Define the rules for a powerful password
        int minLength = 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check the password against the rules
        if (password.length() >= minLength) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                }
            }
        }

        // Return true if the password is powerful, false otherwise
        return (password.length() >= minLength) && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        phoneNumberTextfield = new javax.swing.JTextField();
        usernameTextfield1 = new javax.swing.JTextField();
        emailTextfield1 = new javax.swing.JTextField();
        firstNameTextfield1 = new javax.swing.JTextField();
        lastNameTextfield1 = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        flyoutLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerLabel.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(223, 223, 223));
        registerLabel.setText("REGISTERATION");
        jPanel1.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 280, 40));

        phoneNumberTextfield.setBackground(new java.awt.Color(48, 48, 48));
        phoneNumberTextfield.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        phoneNumberTextfield.setForeground(new java.awt.Color(223, 223, 223));
        phoneNumberTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        phoneNumberTextfield.setSelectionColor(new java.awt.Color(223, 211, 218));
        jPanel1.add(phoneNumberTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 180, 40));

        usernameTextfield1.setBackground(new java.awt.Color(48, 48, 48));
        usernameTextfield1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        usernameTextfield1.setForeground(new java.awt.Color(223, 223, 223));
        usernameTextfield1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        usernameTextfield1.setSelectionColor(new java.awt.Color(223, 211, 218));
        jPanel1.add(usernameTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 40));

        emailTextfield1.setBackground(new java.awt.Color(48, 48, 48));
        emailTextfield1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        emailTextfield1.setForeground(new java.awt.Color(223, 223, 223));
        emailTextfield1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-Mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        emailTextfield1.setSelectionColor(new java.awt.Color(223, 211, 218));
        jPanel1.add(emailTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 40));

        firstNameTextfield1.setBackground(new java.awt.Color(48, 48, 48));
        firstNameTextfield1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        firstNameTextfield1.setForeground(new java.awt.Color(223, 223, 223));
        firstNameTextfield1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        firstNameTextfield1.setSelectionColor(new java.awt.Color(223, 211, 218));
        jPanel1.add(firstNameTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 40));

        lastNameTextfield1.setBackground(new java.awt.Color(48, 48, 48));
        lastNameTextfield1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lastNameTextfield1.setForeground(new java.awt.Color(223, 223, 223));
        lastNameTextfield1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        lastNameTextfield1.setSelectionColor(new java.awt.Color(223, 211, 218));
        jPanel1.add(lastNameTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, 40));

        passwordField.setBackground(new java.awt.Color(48, 48, 48));
        passwordField.setForeground(new java.awt.Color(223, 223, 223));
        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(223, 223, 223))); // NOI18N
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 40));

        loginButton.setBackground(new java.awt.Color(48, 48, 48));
        loginButton.setForeground(new java.awt.Color(223, 223, 223));
        loginButton.setText("Log In");
        loginButton.setToolTipText("Already Hava An Account?");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 223, 223), 1, true));
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, 30));

        signUpButton.setBackground(new java.awt.Color(223, 223, 223));
        signUpButton.setText("Sign Up");
        signUpButton.setBorderPainted(false);
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/being-creative-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 370, 390));

        flyoutLabel.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        flyoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        flyoutLabel.setText("Flyout");
        jPanel1.add(flyoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jSeparator2.setForeground(new java.awt.Color(223, 223, 223));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 10));

        jSeparator3.setBackground(new java.awt.Color(223, 223, 223));
        jSeparator3.setForeground(new java.awt.Color(223, 223, 223));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 270, 10));

        jSeparator1.setBackground(new java.awt.Color(223, 223, 223));
        jSeparator1.setForeground(new java.awt.Color(223, 223, 223));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 377, 420, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Made with love @ Khobar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        String username;
        String firstName;
        String lastName;
        String email;
        char[] password;
        String phoneNumber;
        // Phone number validiator 
        final String PHONE_REGEX = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
        boolean phoneValid = false;
        //
        // email validiator
        final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        //
        if(evt.getSource() == signUpButton){
            username = usernameTextfield1.getText();
            firstName = firstNameTextfield1.getText();
            lastName = lastNameTextfield1.getText();
            email = emailTextfield1.getText();
            password = passwordField.getPassword();
            phoneNumber = phoneNumberTextfield.getText();
           
            //some valid
            boolean emptyValid = false;
            //password valid
            Matcher matcher = PHONE_PATTERN.matcher(phoneNumber); 
            phoneValid = matcher.matches();
            boolean passwordIsPowerful = false;
            
            // email valid
            Matcher emailMatcher = pattern.matcher(email);
            boolean emailValid = emailMatcher.matches();
            //
            if(
               username.equals("") || new String(password).equals("") || firstName.equals("")
               || lastName.equals("") || email.equals("") || phoneNumber.equals("")
                    )
                JOptionPane.showMessageDialog(null, "some fields are empty"); 
            else{
                emptyValid = true;
                if(!phoneValid){
                JOptionPane.showMessageDialog(null, "Phone number is not vaild\n Make sure its in this form 055******* ");
            }
            if (!isPasswordPowerful(new String(password))) {
            JOptionPane.showMessageDialog(null, "Your password is not powerful!\n"
                    + "A powerful password should be at least 8 characters long,\n"
                    + "contain at least one uppercase letter, one lowercase letter,\n"
                    + "one digit and one special character.");
            } else {
                passwordIsPowerful = true;
            }
            if(!emailValid)
                JOptionPane.showMessageDialog(null, "Email is not valid\n"
                        + "make sure its in this format\n"
                        + "example@something.com");
            if(username.matches("^[0-9]*$"))
                JOptionPane.showMessageDialog(null, "Username is not valid, it should contains at least one character and not only numbers");
            
            if(!firstName.matches("^[a-zA-Z]*$") || !lastName.matches("^[a-zA-Z]*$"))
                   JOptionPane.showMessageDialog(null, "First Name and Last Name are not valid, they should contain only letters");
            // if everything is true then, do the following
            if(passwordIsPowerful && emailValid && emptyValid && phoneValid &&firstName.matches("^[a-zA-Z]*$") &&lastName.matches("^[a-zA-Z]*$")){
                Customer currentUser = new Customer(firstName, lastName, new String(password), email, phoneNumber, username);                
                
                // pushing elemetnts to the database
                try{
                    connectToDB();
                    PreparedStatement st =  connection.prepareStatement("INSERT INTO flyout.passengers (passengerUsername, passengerPassword, passengerEmail, passengerFirstName, passengerLastName, passengerPhone, passengerWallet, passengerHistory) VALUES (?,?,?,?,?,?,?,?)");
                    st.setString(1, username);
                    st.setString(2, new String(password));
                    st.setString(3, email);
                    st.setString(4, firstName);
                    st.setString(5, lastName);
                    st.setString(6, phoneNumber);
                    st.setDouble(7, 0.0);
                    st.setString(8, "You created an accound with Flyout,");
                } catch(SQLException e){
                    System.out.println("Error in pushing data for regesiteration");
                    e.printStackTrace();
                }
                customerDashboard p = new customerDashboard(currentUser);
                p.setVisible(true);
                dispose();
            }
        }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed
    
    // encrypt password
    private static final String ALGO = "AES";
    private static final byte[] keyValue =
            new byte[] {'T', 'h', 'e', 'B', 'e', 's', 't',
                    'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y'};

    public static String encrypt(String data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encVal);
    }
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGO);
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
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        mainLoginPage p = new mainLoginPage();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextfield1;
    private javax.swing.JTextField firstNameTextfield1;
    private javax.swing.JLabel flyoutLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lastNameTextfield1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberTextfield;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameTextfield1;
    // End of variables declaration//GEN-END:variables
}
