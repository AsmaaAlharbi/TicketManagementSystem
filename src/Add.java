
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.StringTokenizer;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author asmaabdullah
 */
public class Add extends javax.swing.JFrame {

    private BufferedWriter bw = null;
    private BufferedReader br = null;
    String ConnectionURL = "jdbc:mysql://localhost:3306/STLAWorld"; // Add the database name to the URL
    String username = "root";
    String password = "Asmaa123";

    public Add() {

        initComponents();

        try {
            bw = new BufferedWriter(new FileWriter("EventList.txt", true));
            br = new BufferedReader(new FileReader("EventList.txt"));
            String search;
            Object columns[] = {"ID", "NAME", "PRICE"};
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columns);
            jTable1.setModel(model);

            String line;
            int rowCount = 0;

            while ((line = br.readLine()) != null) {
                String[] key = line.split(",");

                // Check if there are at least 3 elements
                if (key.length >= 3) {
                    Object row[] = new Object[3];
                    row[0] = key[0];
                    row[1] = key[1];
                    row[2] = key[2];
                    model.addRow(row);
                    rowCount++;
                }
            }

            br.close();
        } catch (IOException ex) {
            System.out.println("Exception msg: " + ex);
        }

    }

    String nameSearchSel, id, name, cost, idSearchSel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        IdText = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        PriceText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        NameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 220, 227));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Add Event Details");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        IdText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        Id.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Id.setText("Id");
        Id.setMaximumSize(new java.awt.Dimension(72, 20));
        Id.setMinimumSize(new java.awt.Dimension(72, 20));
        Id.setPreferredSize(new java.awt.Dimension(72, 20));

        Name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Name.setText("Name");
        Name.setMaximumSize(new java.awt.Dimension(72, 20));
        Name.setMinimumSize(new java.awt.Dimension(72, 20));
        Name.setPreferredSize(new java.awt.Dimension(72, 20));

        Price.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Price.setText("Price");
        Price.setMaximumSize(new java.awt.Dimension(72, 20));
        Price.setMinimumSize(new java.awt.Dimension(72, 20));
        Price.setPreferredSize(new java.awt.Dimension(72, 20));

        PriceText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton2.setText("Add");
        jButton2.setMaximumSize(new java.awt.Dimension(125, 33));
        jButton2.setMinimumSize(new java.awt.Dimension(125, 33));
        jButton2.setPreferredSize(new java.awt.Dimension(125, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        NameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String id = IdText.getText().toUpperCase().trim();
            String name = NameText.getText().toUpperCase().trim();
            String price = PriceText.getText().toUpperCase().trim();

            // Only proceed if all fields are filled out
            if (!id.isEmpty() && !name.isEmpty() && !price.isEmpty()) {
                boolean nameExists = false;
                boolean idExists = false;

                // Check if Name already exists in the file
                try (BufferedReader br = new BufferedReader(new FileReader("EventList.txt"))) {
                    String record;
                    while ((record = br.readLine()) != null) {
                        String[] parts = record.split(","); // Split the line into parts
                        // Check if the second part of the line (the name) matches the name entered, ignoring case
                        if (parts.length > 1 && parts[1].trim().equalsIgnoreCase(name)) {
                            nameExists = true;
                            JOptionPane.showMessageDialog(null, "Name already exists!!");
                            break;
                        }
                        if (record.toUpperCase().startsWith(id + ",")) {
                            idExists = true;
                            JOptionPane.showMessageDialog(null, "ID already exists!!");
                            break;
                        }
                    }
                }

                // If either ID or Name exists, do not add the new event
                if (idExists || nameExists) {
                    return;
                }

                // Format the data and write it to the file
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("EventList.txt", true))) {
                    String dataToWrite = "\n" + id + ", " + name + ", " + price;
                    bw.append(dataToWrite);
                    bw.flush();
                }

                // Add the new row to the model
                model.addRow(new Object[]{id, name, price});

                // add to the database
                addToDatabase();

                JOptionPane.showMessageDialog(null, "Event Added successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            }
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public String getIdText() {
        return IdText.getText();
    }

    public String getNameText() {
        return NameText.getText();
    }

    public String getPriceText() {
        return PriceText.getText();
    }

    public void addToDatabase() {

        String id = getIdText().toUpperCase();
        String name = getNameText().toUpperCase();
        String price = getPriceText().toUpperCase();

        String ConnectionURL = "jdbc:mysql://localhost:3306/STLAWorld";
        String sql = "INSERT INTO event (Id, Name, Price) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(ConnectionURL, "root", "Asmaa123"); PreparedStatement pp = conn.prepareStatement(sql)) {

            // Assuming Id is an integer and Price is a double in your database schema
            pp.setInt(1, Integer.parseInt(id));
            pp.setString(2, name);
            pp.setDouble(3, Double.parseDouble(price));

            // Execute the update
            int affectedRows = pp.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data added to the database successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Data insertion to the database failed.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error during database insertion: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error in number formatting: " + ex.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JTextField IdText;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
