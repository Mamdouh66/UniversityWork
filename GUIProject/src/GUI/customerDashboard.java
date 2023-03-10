package GUI;
import App.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class customerDashboard extends javax.swing.JFrame {
    String customerFirstName;
    private String text;
    private String text1;
    private int index;
    private int index1;
    private Timer timer;
    private Timer timer1;
    
    Connection connection;
    
    // date place
    LocalDate currentDate = LocalDate.now();
    String dayOfWeek = currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    String month = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    int dayOfMonth = currentDate.getDayOfMonth();
    int year = currentDate.getYear();
    String date = month.substring(0, 3) + "/" + dayOfMonth + "/" + year;
    String day = dayOfWeek;

   Customer currentCustomer;
   private JScrollPane scrollPane;
   
   private static final String LOG_FILE = "log.txt";
   private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
    
    public customerDashboard(){
    initComponents();
    }
    public customerDashboard(Customer customerUser) {
        customerFirstName = customerUser.getCustomerFirstName();
        currentCustomer = customerUser;
        text = "Hello, " + customerFirstName;
        index = 0;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    jLabel1.setText(jLabel1.getText() + text.charAt(index));
                    index++;
                } else {
                    timer.stop();                    
                    timer1.start();
                }
            }
        });
        timer.start();
        text1 = "Ready for a new experience with Flyout?";
        index1 = 0;
        timer1 = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (index1 < text1.length()) {
                    jLabel3.setText(jLabel3.getText() + text1.charAt(index1));
                    index1++;
                } else {
                    timer1.stop();
                }
            }
        });
        initComponents();
        String historyPanel = "";
        try{
            connectToDB();
            PreparedStatement psts = connection.prepareStatement("SELECT * FROM flyout.passengers WHERE passengerUsername = ?");
            psts.setString(1, currentCustomer.getUsername());
            ResultSet rs = psts.executeQuery();
            if(rs.next()){
                historyPanel = rs.getString("passengerHistory");
            }
            psts.close();
            disconnectFromDB();
        } catch(SQLException e){
            e.printStackTrace();
        }
        
        jLabel4.setText(day);
        jLabel5.setText(date);
        printActivities(historyPanel);
        
        log(currentCustomer.getUsername() + " has just logged in");
        
    }
    
    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        String logLine = now.format(FORMATTER) + ": " + message + System.lineSeparator();

        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.append(logLine);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        walletButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        flightsButton = new javax.swing.JButton();
        ticketsButton = new javax.swing.JButton();
        whiteLabelCustomer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        actString1 = new javax.swing.JLabel();
        actString2 = new javax.swing.JLabel();
        actString3 = new javax.swing.JLabel();
        actString4 = new javax.swing.JLabel();
        actString7 = new javax.swing.JLabel();
        actString6 = new javax.swing.JLabel();
        actString5 = new javax.swing.JLabel();

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
        darkLabelCustomer.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 140, 40));

        walletButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        walletButton.setForeground(new java.awt.Color(223, 223, 223));
        walletButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\zuchv\\Downloads\\wallet.png")); // NOI18N
        walletButton.setText("WALLET");
        walletButton.setBorderPainted(false);
        walletButton.setContentAreaFilled(false);
        walletButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walletButton.setFocusPainted(false);
        walletButton.setFocusable(false);
        walletButton.setIconTextGap(8);
        walletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletButtonActionPerformed(evt);
            }
        });
        darkLabelCustomer.add(walletButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, 40));

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
        darkLabelCustomer.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 40));

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
        darkLabelCustomer.add(flightsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 40));

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
        darkLabelCustomer.add(ticketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 40));

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

        whiteLabelCustomer.setBackground(new java.awt.Color(223, 223, 223));
        whiteLabelCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        whiteLabelCustomer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 480, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        whiteLabelCustomer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(48, 48, 48));
        whiteLabelCustomer.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 450, 20));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        whiteLabelCustomer.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 130, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setText("Your Latest Activities");
        whiteLabelCustomer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actString1.setBackground(new java.awt.Color(153, 153, 153));
        actString1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 610, 60));

        actString2.setBackground(new java.awt.Color(153, 153, 153));
        actString2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 590, 60));

        actString3.setBackground(new java.awt.Color(153, 153, 153));
        actString3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 630, 60));

        actString4.setBackground(new java.awt.Color(153, 153, 153));
        actString4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 590, 60));

        actString7.setBackground(new java.awt.Color(153, 153, 153));
        actString7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 430, 60));

        actString6.setBackground(new java.awt.Color(153, 153, 153));
        actString6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 60));

        actString5.setBackground(new java.awt.Color(153, 153, 153));
        actString5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(actString5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 550, 60));

        whiteLabelCustomer.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 780, 430));

        getContentPane().add(whiteLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 820, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void walletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == walletButton){
            WalletsDashboard p = new WalletsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_walletButtonActionPerformed

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == ticketsButton){
            TicketsDashboard p = new TicketsDashboard(currentCustomer);
            p.setVisible(true);
            dispose();
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

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == logoutButton){
            mainLoginPage p = new mainLoginPage();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == homeButton){
            JOptionPane.showMessageDialog(null, "You are in the home page");
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    public void printActivities(String bigString){
        String[] smallerStrings = bigString.split(",");
        for (int i = 0; i < smallerStrings.length; i++){
            if (i == 0){
                actString1.setText(smallerStrings[i]);
            }
            else if (i == 1){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
            }
            else if (i  == 2){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
                actString3.setText(smallerStrings[i-2]);
            }
            else if (i == 3){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
                actString3.setText(smallerStrings[i-2]);
                actString4.setText(smallerStrings[i-3]);
            }
            else if (i == 4){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
                actString3.setText(smallerStrings[i-2]);
                actString4.setText(smallerStrings[i-3]);
                actString5.setText(smallerStrings[i-4]);
            }
            else if (i == 5){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
                actString3.setText(smallerStrings[i-2]);
                actString4.setText(smallerStrings[i-3]);
                actString5.setText(smallerStrings[i-4]);
                actString6.setText(smallerStrings[i-5]);
            }
            else if (i == 6){
                actString1.setText(smallerStrings[i]);
                actString2.setText(smallerStrings[i-1]);
                actString3.setText(smallerStrings[i-2]);
                actString4.setText(smallerStrings[i-3]);
                actString5.setText(smallerStrings[i-4]);
                actString6.setText(smallerStrings[i-5]);
                actString7.setText(smallerStrings[i-6]);
            }
            else{
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actString1;
    private javax.swing.JLabel actString2;
    private javax.swing.JLabel actString3;
    private javax.swing.JLabel actString4;
    private javax.swing.JLabel actString5;
    private javax.swing.JLabel actString6;
    private javax.swing.JLabel actString7;
    private javax.swing.JPanel darkLabelCustomer;
    private javax.swing.JButton flightsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletButton;
    private javax.swing.JPanel whiteLabelCustomer;
    // End of variables declaration//GEN-END:variables
}
