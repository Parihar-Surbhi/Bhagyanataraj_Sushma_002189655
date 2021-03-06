/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_components;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author sushm
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    VitalSignsHistory history;
    
    public ViewJPanel(VitalSignsHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewVitals = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewVitals = new javax.swing.JTable();
        btnViewVitals = new javax.swing.JButton();
        btnDeleteVitals = new javax.swing.JButton();
        lblViewTemp = new javax.swing.JLabel();
        lblViewBP = new javax.swing.JLabel();
        lblViewPulse = new javax.swing.JLabel();
        lblViewDate = new javax.swing.JLabel();
        txtViewTemp = new javax.swing.JTextField();
        txtViewBP = new javax.swing.JTextField();
        txtViewPulse = new javax.swing.JTextField();
        txtViewDate = new javax.swing.JTextField();

        lblViewVitals.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblViewVitals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewVitals.setText("View Vitals");

        tblViewVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Temperature ", "Blood pressure", "Pulse", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewVitals);

        btnViewVitals.setText("View Vitals");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });

        btnDeleteVitals.setText("Delete Vitals");
        btnDeleteVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVitalsActionPerformed(evt);
            }
        });

        lblViewTemp.setText("Temperatue:");

        lblViewBP.setText("Blood Pressure:");

        lblViewPulse.setText("Pulse:");

        lblViewDate.setText("Date:");

        txtViewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(lblViewVitals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblViewBP)
                    .addComponent(lblViewTemp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblViewPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblViewDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewBP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteVitals, btnViewVitals});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblViewVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewVitals)
                    .addComponent(btnDeleteVitals))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewBP)
                    .addComponent(txtViewBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewPulse)
                    .addComponent(txtViewPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewDate)
                    .addComponent(txtViewDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtViewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewDateActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewVitals.getSelectedRow();
        
            if (selectedRowIndex<0)
            {
            
                JOptionPane.showMessageDialog(this, "Select the row which you want to view ");
                return;
            
            }
            
            DefaultTableModel model = (DefaultTableModel) tblViewVitals.getModel();
            VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedRowIndex, 3);
            
            txtViewTemp.setText(String.valueOf(selectedVitals.getTemperature()));
            txtViewBP.setText(String.valueOf(selectedVitals.getBloodPressure()));
            txtViewPulse.setText(String.valueOf(selectedVitals.getPulse()));
            txtViewDate.setText(selectedVitals.getDate());
            
            
       
        
    }//GEN-LAST:event_btnViewVitalsActionPerformed

    private void btnDeleteVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVitalsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblViewVitals.getSelectedRow();
        
            if (selectedRowIndex<0)
            {
            
                JOptionPane.showMessageDialog(this, "Select the row which you want to delete ");
                return;
            
            }
            
            DefaultTableModel model = (DefaultTableModel) tblViewVitals.getModel();
            VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedRowIndex, 3);

            history.deleteVitals(selectedVitals);

            JOptionPane.showMessageDialog(this, "Vital Signs deleted..!");

            populateTable();
    }//GEN-LAST:event_btnDeleteVitalsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteVitals;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewBP;
    private javax.swing.JLabel lblViewDate;
    private javax.swing.JLabel lblViewPulse;
    private javax.swing.JLabel lblViewTemp;
    private javax.swing.JLabel lblViewVitals;
    private javax.swing.JTable tblViewVitals;
    private javax.swing.JTextField txtViewBP;
    private javax.swing.JTextField txtViewDate;
    private javax.swing.JTextField txtViewPulse;
    private javax.swing.JTextField txtViewTemp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblViewVitals.getModel();
        model.setRowCount(0);
        
        for (VitalSigns vs : history.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = vs.getTemperature();
            row[1] = vs.getBloodPressure();
            row[2] = vs.getPulse();
            row[3] = vs;
            
            model.addRow(row);
             
        }
    }
}

