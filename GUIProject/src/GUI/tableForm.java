package GUI;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import App.*;
import javax.swing.JOptionPane;

public class tableForm extends javax.swing.JFrame {
    Connection connection;
    Customer cust;
    Flight flight;
    ResultSet rs;
    public tableForm(Flight flight, Customer cust) {
        initComponents();
        this.cust = cust;
        this.flight = flight;
        try{
          connectToDB();
        Statement st = connection.createStatement();
        String query = "SELECT * FROM flyout.flights WHERE departureCity = '" + flight.getFlightDepartingCity() + "' AND arrivalCity = '"+ flight.getFlightArrivingCity() +"' AND departureDate = '" + flight.getFlightDepartingDate() + "' AND arrivalDate = '" + flight.getFlightArrivingDate() + "'" ;
        rs = st.executeQuery(query);
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        while(rs.next()){
            model.addRow(new Object[]{rs.getString("flightID"), rs.getString("departureCity"), rs.getString("arrivalCity"), rs.getString("departureDate"), rs.getString("arrivalDate"), rs.getString("price"), rs.getString("seats")});
        }
        } catch(SQLException e){
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 48, 48));
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Departure City", "Arrival City", "Departure Date", "Arrival Date", "Price", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Enter the flight ID of the wanted flight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jTextField1.getText();
        boolean isThere = false;
        try{
        while(rs.next()){
            if (rs.getString("flightID").equals(id)){
                flight.setFlightArrivingCity(rs.getString("arrivalCity"));
                flight.setFlightDepartingCity(rs.getString("departureCity"));
                flight.setFlightDepartingDate(rs.getString("departureDate"));
                flight.setFlightArrivingDate(rs.getString("arrivalDate"));
                flight.setFlightPrice(rs.getDouble("price"));
                flight.setSeats(rs.getInt("seats"));
                flight.setAdmin("adminUsername");
                isThere = true;
            }
        }
      } catch (SQLException e){
          e.printStackTrace();
      }
      if(isThere){
          // check if customer has enough money to buy or not
          
      }else{
          JOptionPane.showMessageDialog(null, "ID isn't found");
      }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
