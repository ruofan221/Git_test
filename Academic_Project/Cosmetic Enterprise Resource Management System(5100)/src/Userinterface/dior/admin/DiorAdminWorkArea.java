/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.admin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author too
 */
public class DiorAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkArea
     */
    private JPanel userProcessContainer; 
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    
    
    public DiorAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        
    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnProductManagement = new javax.swing.JButton();
        btnOrderManagement = new javax.swing.JButton();
        btnCreateProduct = new javax.swing.JButton();

        jLabel1.setText("Dior Admin Work Area");

        btnProductManagement.setText("Product Management");
        btnProductManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductManagementActionPerformed(evt);
            }
        });

        btnOrderManagement.setText("Order Management");
        btnOrderManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderManagementActionPerformed(evt);
            }
        });

        btnCreateProduct.setText("Create Product");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateProduct)
                    .addComponent(btnOrderManagement)
                    .addComponent(btnProductManagement)
                    .addComponent(jLabel1))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(btnCreateProduct)
                .addGap(26, 26, 26)
                .addComponent(btnProductManagement)
                .addGap(27, 27, 27)
                .addComponent(btnOrderManagement)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductManagementActionPerformed
        // TODO add your handling code here:
        ProductManagement pj = new ProductManagement(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("createproduct",pj);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProductManagementActionPerformed

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:z
        CreateProduct cp = new CreateProduct(userProcessContainer,account,enterprise,business);
        userProcessContainer.add("createproduct",cp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateProductActionPerformed

    private void btnOrderManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderManagementActionPerformed
        // TODO add your handling code here:
        OrderManagement oj = new OrderManagement(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("createproduct",oj);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnOrderManagement;
    private javax.swing.JButton btnProductManagement;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
