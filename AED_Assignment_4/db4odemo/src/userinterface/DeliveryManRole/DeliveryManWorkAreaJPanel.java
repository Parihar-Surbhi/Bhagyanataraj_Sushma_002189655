/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;      
        
        populateODTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnODProcess = new javax.swing.JButton();
        btnODRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        lblOrderDetails = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnODProcess.setText("Process");
        btnODProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODProcessActionPerformed(evt);
            }
        });
        add(btnODProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        btnODRefresh.setText("Refresh");
        btnODRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODRefreshActionPerformed(evt);
            }
        });
        add(btnODRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "RestaurantName", "Customer Name", "Delivery Address", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 58, 650, 170));

        lblOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrderDetails.setText("Details of Order");
        add(lblOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnODProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODProcessActionPerformed
        
        int selectedRow = tblOrderDetails.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Order order = (Order)tblOrderDetails.getValueAt(selectedRow, 0); 
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, order);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnODProcessActionPerformed

    private void btnODRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODRefreshActionPerformed
        populateODTable();
    }//GEN-LAST:event_btnODRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnODProcess;
    private javax.swing.JButton btnODRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderDetails;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables

    public void populateODTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel tablemodel = (DefaultTableModel) tblOrderDetails.getModel();
        
        tablemodel.setRowCount(0);
        
        for(DeliveryMan deliveryMan : business.getDeliveryManDirectory().getDeliveryManDirectory()){
            if(deliveryMan.getUserName().equals(userAccount.getUsername())){
                    
                for(Order order : deliveryMan.getOrderList()){
                Object[] row = new Object[6];
                row[2] = order.getCustomerName();
                row[1] = order.getRestaurantName();
               
                row[4] = order.getOrderAmount();
                row[5] = order.getStatus();
                row[0] = order;
                row[3] = order.getAddress();
                tablemodel.addRow(row);
                    
                }
            }
            
        }
    
    
    }
}
