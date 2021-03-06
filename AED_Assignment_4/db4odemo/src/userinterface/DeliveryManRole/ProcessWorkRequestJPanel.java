/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Order.Order;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    Order order;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, Order order) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.order = order;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        txtPWRStatus = new javax.swing.JTextField();
        btnPWRback = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 248, 249));

        btnSubmit.setBackground(new java.awt.Color(31, 189, 214));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit Status");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus.setText("Status");

        btnPWRback.setBackground(new java.awt.Color(102, 102, 102));
        btnPWRback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPWRback.setForeground(new java.awt.Color(255, 255, 255));
        btnPWRback.setText("<");
        btnPWRback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPWRbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPWRStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPWRback)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnPWRback)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPWRStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPWRbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPWRbackActionPerformed

        userProcessContainer.remove(this);
        Component[] cmp = userProcessContainer.getComponents();
        Component component = cmp[cmp.length - 1];
        DeliveryManWorkAreaJPanel dwjp = (DeliveryManWorkAreaJPanel) component;
        dwjp.populateODTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnPWRbackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        order.setStatus(txtPWRStatus.getText());
        JOptionPane.showMessageDialog(null, "Successfully update the provided status");
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPWRback;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtPWRStatus;
    // End of variables declaration//GEN-END:variables
}
