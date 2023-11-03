
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            int rowCount = 0; // Counter for limiting to 4 rows

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
            int result, flag = 0;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            Object[] row = new Object[4];
            row[0] = IdText.getText().toUpperCase();
            row[1] = NameText.getText().toUpperCase();
            row[2] = PriceText.getText().toUpperCase();
            model.addRow(row);

            if (NameText.getText().length() != 0) {
                try (BufferedReader br = new BufferedReader(new FileReader("EventList.txt"))) {
                    String recordSearch1;
                    nameSearchSel = NameText.getText().toUpperCase();

                    while ((recordSearch1 = br.readLine()) != null) {
                        if (recordSearch1.contains(nameSearchSel)) {
                            JOptionPane.showMessageDialog(null, "Name already exists!!");
                            flag = 1;
                        }
                    }
                }
            }

            // checking if id already exists
            if (IdText.getText().length() != 0) {
                try (BufferedReader br = new BufferedReader(new FileReader("EventList.txt"))) {
                    String recordSearch1;
                    String idSearchSelTrimmed = IdText.getText().toUpperCase().trim(); // Trim whitespace
                    int i1 = 0;
                    while ((recordSearch1 = br.readLine()) != null) {
                        StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1, ",");
                        if (stSearchView1.hasMoreTokens()) { // Check if there are more tokens
                            String idFromRecord = stSearchView1.nextToken().trim(); // Trim whitespace
                            if (idFromRecord.equals(idSearchSelTrimmed)) {
                                JOptionPane.showMessageDialog(null, "ID already exists!!");
                                flag = 1;
                                i1++;
                            }
                        }
                    }
                }
            }
            // adding the details in the file
            if (flag != 1 && IdText.getText().length() != 0 && NameText.getText().length() != 0
                    && PriceText.getText().length() != 0) {
                id = IdText.getText().toUpperCase();
                name = NameText.getText().toUpperCase();
                cost = PriceText.getText();

                // Format the data and write it to the file
                String dataToWrite = "\n" + id + ", " + name + ", " + cost;
                bw.write(dataToWrite);
                bw.flush(); // Flush to ensure data is written immediately
                JOptionPane.showMessageDialog(null, "Event Added successfully!");
            }

        } catch (Exception ex) {
            System.out.println("Exception msg: " + ex);
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
