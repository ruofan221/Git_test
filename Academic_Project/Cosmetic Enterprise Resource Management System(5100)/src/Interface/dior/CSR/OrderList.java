/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.dior.CSR;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Order.Item;
import Business.Order.Order;
import Business.Organization.AdminOrganization;
import Business.Organization.CSROrganization;
import Business.Organization.DiorAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;

import Business.WorkQueue.OrderReminderRequest;
import Business.WorkQueue.ProductUpdateRequest;
import Business.WorkQueue.WorkRequest;
import Userinterface.customer.itemDetailJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author too
 */
public class OrderList extends javax.swing.JPanel {

    /**
     * Creates new form OrderList
     */
    
     private JPanel userProcessContainer;
    private UserAccount account;
  //  private Customer c;
    private CSROrganization csrOrganization;
    private BeautyEnterprise benterprise;
    private CustomerDirectory customerDir;
   

    OrderList(JPanel userProcessContainer, UserAccount account, BeautyEnterprise benterprise, CSROrganization csrOrganization, CustomerDirectory customerDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account; 
     //   this.c=c;
        this.csrOrganization = (CSROrganization)csrOrganization;
        this.benterprise=(BeautyEnterprise)benterprise;
        this.customerDir=customerDir;
        populateOrderTable();
        populateDelete();
    }

    
    public void populateOrderTable(){
        DefaultTableModel model = (DefaultTableModel) orderTbl.getModel();
        
        model.setRowCount(0);
         
        
       
       for(Customer customer : benterprise.getCustomerDir().getCustomerList()){
            for (Order o : customer.getOrderDir().getOrderList()){{
                
            Object[] row = new Object[5];
            row[0] = o;
            row[1] = customer.getFname() + " " + customer.getLname();
            row[2] = o.getDateCreated();             
            row[3] = o.getStatues();
          
            model.addRow(row);
            
            }
       } 
    }
       }
       
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cancelOrderTbl = new javax.swing.JTable();
        orderdetailBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        item = new javax.swing.JButton();
        orderStatusCombo = new javax.swing.JComboBox<>();
        deleteCombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jLabel1.setText("Order List");

        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderId", "Customer", "Date Created", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTbl);
        if (orderTbl.getColumnModel().getColumnCount() > 0) {
            orderTbl.getColumnModel().getColumn(0).setResizable(false);
            orderTbl.getColumnModel().getColumn(1).setResizable(false);
            orderTbl.getColumnModel().getColumn(2).setResizable(false);
            orderTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        deleteBtn.setText("Agree Cancel");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelOrderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderId", "Date Request", "Request Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cancelOrderTbl);
        if (cancelOrderTbl.getColumnModel().getColumnCount() > 0) {
            cancelOrderTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        orderdetailBtn.setText("view  order detail");
        orderdetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderdetailBtnActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Quitity", "Sale Price", "Purchasing Price", "TotalRevenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(itemTable);

        item.setText("view item detail");
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        orderStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Shipped" }));

        deleteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waiting", "Canceled" }));
        deleteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteComboActionPerformed(evt);
            }
        });

        jButton2.setText("View all");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View all");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item)
                                .addGap(2, 2, 2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(380, 380, 380))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderdetailBtn)
                            .addComponent(jButton1)
                            .addComponent(deleteBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(orderStatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderStatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderdetailBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       
        int selectedrow = cancelOrderTbl.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(cancelOrderTbl.getValueAt(selectedrow, 3).equals("Canceled")){
        JOptionPane.showMessageDialog(null, "The order has already been deleted", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrderReminderRequest request = (OrderReminderRequest)cancelOrderTbl.getValueAt(selectedrow, 0);
        ((OrderReminderRequest)request).setDeleteStatus("Canceled");
        ((OrderReminderRequest)request).setDeleteMessage("Delete sucessfully");
        
        
        
         
        
      //  OrderReminderRequest r = (OrderReminderRequest)cancelOrderTbl.getValueAt(selectedrow, 0);
        for(Customer c: benterprise.getCustomerDir().getCustomerList()){
            for(Order o : c.getOrderDir().getOrderList()){
                if(o.getOrderId() == request.getOrderId()){
                   c.getOrderDir().getOrderList().remove(o); 
                   for(Item i : o.getOrderItemList()){
                  i.getProduct().setAvailNum(i.getQuatity());
                    }
                  break;
                }
                
            }
        }
        
      populateDelete();
      populateOrderTable();  
        
        
                
            
        
        
    
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(orderStatusCombo.getSelectedItem().equals("Pending")){
             DefaultTableModel model = (DefaultTableModel) orderTbl.getModel();
        
        model.setRowCount(0);
         
        
       
       for(Customer customer : customerDir.getCustomerList()){
            for (Order o : customer.getOrderDir().getOrderList()){{
             if(o.getStatues().equals("pending")){
            Object[] row = new Object[5];
            row[0] = o;
            row[1] = customer.getFname() + " " + customer.getLname();
            row[2] = o.getDateCreated();             
            row[3] = o.getStatues();
          
            model.addRow(row);
             }   
          
            }
       } 
    }
        }else if(orderStatusCombo.getSelectedItem().equals("Shipped")){
            DefaultTableModel model = (DefaultTableModel) orderTbl.getModel();
        
        model.setRowCount(0);
         
        
       
       for(Customer customer : customerDir.getCustomerList()){
            for (Order o : customer.getOrderDir().getOrderList()){{
             if(o.getStatues().equals("Shipped")){
            Object[] row = new Object[5];
            row[0] = o;
            row[1] = customer.getFname() + " " + customer.getLname();
            row[2] = o.getDateCreated();             
            row[3] = o.getStatues();
          
            model.addRow(row);
             }   
          
            }
       } 
    }
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void orderdetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderdetailBtnActionPerformed
        // TODO add your handling code here:
       int selectedrow = orderTbl.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)orderTbl.getValueAt(selectedrow, 0);
        int id = order.getOrderId();
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        model.setRowCount(0);
        for(Customer customer : benterprise.getCustomerDir().getCustomerList()){
            for(Order o : customer.getOrderDir().getOrderList()){
                if(o.getOrderId()==id){
                    for(Item item : o.getOrderItemList()){
                    Object[] row = new Object[5];
                    row[0] = item.getProduct();
                    row[1] = item.getQuatity();
                    row[2] = item.getProduct().getSalesPrice();
                    row[3] = item.getProduct().getPurchasingPrice();
                    row[4] = item.getQuatity() * (item.getProduct().getSalesPrice()-item.getProduct().getPurchasingPrice());
                    model.addRow(row);                      
                }
                   
                    } 
                
            }
        }
     
        
        
        
        
    }//GEN-LAST:event_orderdetailBtnActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
          int row = itemTable.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product p = (Product)itemTable.getValueAt(row, 0);
         
        
        
        productDetail pd = new productDetail(userProcessContainer,benterprise,p);
        userProcessContainer.add("productDetail", pd);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_itemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteComboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(deleteCombo.getSelectedItem().equals("Waiting")){
            DefaultTableModel model = (DefaultTableModel) cancelOrderTbl.getModel();
            model.setRowCount(0);  
       for(WorkRequest request : csrOrganization.getWorkQueue().getWorkRequestList()){
          
           if(((OrderReminderRequest)request).getDeleteStatus().equals("Waiting")){
            Object[] row = new Object[4];
            row[0] = (OrderReminderRequest)request;
            row[1] = ((OrderReminderRequest)request).getRequestCreated();
            row[2] = ((OrderReminderRequest)request).getDeleteMessage();
            row[3] = ((OrderReminderRequest)request).getDeleteStatus();
            model.addRow(row);  
    }
       }
        }else if(deleteCombo.getSelectedItem().equals("Canceled")){
              DefaultTableModel model = (DefaultTableModel) cancelOrderTbl.getModel();
              model.setRowCount(0);  
       for(WorkRequest request : csrOrganization.getWorkQueue().getWorkRequestList()){
          
           if(((OrderReminderRequest)request).getDeleteStatus().equals("Canceled")){
            Object[] row = new Object[4];
            row[0] = (OrderReminderRequest)request;
            row[1] = ((OrderReminderRequest)request).getRequestCreated();
            row[2] = ((OrderReminderRequest)request).getDeleteMessage();
            row[3] = ((OrderReminderRequest)request).getDeleteStatus();
            model.addRow(row);  
    }
       }
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        populateDelete();
    }//GEN-LAST:event_jButton5ActionPerformed
  
  
   public void populateDelete(){
       DefaultTableModel model = (DefaultTableModel) cancelOrderTbl.getModel();
       model.setRowCount(0);  
       for(WorkRequest request : csrOrganization.getWorkQueue().getWorkRequestList()){            
            Object[] row = new Object[4];
            row[0] = (OrderReminderRequest)request;
            row[1] = ((OrderReminderRequest)request).getRequestCreated();
            row[2] = ((OrderReminderRequest)request).getDeleteMessage();
            row[3] = ((OrderReminderRequest)request).getDeleteStatus();
            model.addRow(row);  
    }
  }
   

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cancelOrderTbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> deleteCombo;
    private javax.swing.JButton item;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> orderStatusCombo;
    private javax.swing.JTable orderTbl;
    private javax.swing.JButton orderdetailBtn;
    // End of variables declaration//GEN-END:variables
}
