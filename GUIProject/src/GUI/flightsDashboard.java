package GUI;
import App.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;

public class flightsDashboard extends javax.swing.JFrame {

    String customerFirstName;
    private String text;
    private String text1;
    private int index;
    private int index1;
    private Timer timer;
    private Timer timer1;
    public flightsDashboard() {
        initComponents();
    }
    public flightsDashboard(Customer customerUser){
        String customerFirstName = "test";
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
                }
            }
        });
        timer.start();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        darkLabelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        walletsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        flightsButton = new javax.swing.JButton();
        ticketsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(844, 531));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fill in the needed information, to travel with Flyout wherever you desire");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(223, 223, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(223, 223, 223));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Year"));
        jTextField1.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField1.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 80, 50));

        jTextField2.setBackground(new java.awt.Color(223, 223, 223));
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Departure"));
        jTextField2.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField2.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 50));

        jTextField3.setBackground(new java.awt.Color(223, 223, 223));
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Arrival"));
        jTextField3.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField3.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 50));

        jTextField4.setBackground(new java.awt.Color(223, 223, 223));
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Day"));
        jTextField4.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField4.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 50));

        jTextField5.setBackground(new java.awt.Color(223, 223, 223));
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Month"));
        jTextField5.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField5.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 50));

        jTextField6.setBackground(new java.awt.Color(223, 223, 223));
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder("Day"));
        jTextField6.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField6.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 80, 50));

        jTextField7.setBackground(new java.awt.Color(223, 223, 223));
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder("Month"));
        jTextField7.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField7.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, 50));

        jTextField8.setBackground(new java.awt.Color(223, 223, 223));
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder("Year"));
        jTextField8.setCaretColor(new java.awt.Color(51, 51, 51));
        jTextField8.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, 50));

        jButton2.setBackground(new java.awt.Color(48, 48, 48));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Serach");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Where Do You Want To Travel?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 780, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 780, 720));

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

        getContentPane().add(darkLabelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            WalletsDashboard p = new WalletsDashboard();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_walletsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == homeButton){
            customerDashboard p = new customerDashboard();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void flightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == flightsButton){
            JOptionPane.showMessageDialog(null, "You are in the flights page");
        }
    }//GEN-LAST:event_flightsButtonActionPerformed

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == ticketsButton){
            TicketsDashboard p = new TicketsDashboard();
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ticketsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(flightsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flightsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flightsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flightsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flightsDashboard().setVisible(true);
            }
        });
    }

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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JButton walletsButton;
    // End of variables declaration//GEN-END:variables
}
