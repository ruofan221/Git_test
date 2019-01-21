/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.customer;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.customerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wuxinyang
 */
public class UpdateInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateInfoJPanel
     */
    
    
    
   

        private JPanel userProcessContainer;
        private UserAccount account;
        private EcoSystem business;
    UpdateInfoJPanel(JPanel userProcessContainer, BeautyEnterprise benterprise, UserAccount account, customerOrganization corganization, EcoSystem business) {
       initComponents();
       this.userProcessContainer= userProcessContainer;
       this.account= account;
       this.business=business;
       txtlName.setText(account.getCustomer().getLname());        
        txtfName.setText(account.getCustomer().getFname());
        txtAddress.setText(account.getCustomer().getAddress());
        txtEmail.setText(account.getCustomer().getEmail());
        txtPhonenum.setText(account.getCustomer().getPhoneNum());
        txtBankaccount.setText(account.getCustomer().getBankAccountNum());
        txtBirth.setText(String.valueOf(account.getCustomer().getBirth()));
        txtlName.setEditable(false);
        txtfName.setEditable(false);
        txtAddress.setEditable(false);
        txtEmail.setEditable(false);
        txtPhonenum.setEditable(false);
        txtBankaccount.setEditable(false);
        txtBirth.setEditable(false);
        saveBtn.setEnabled(false);
        updBtn.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhonenum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBankaccount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtlName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel6.setText("Back Account:");

        jLabel1.setText("Update Info");

        jLabel2.setText("First Name:");

        jLabel3.setText("Address:");

        jLabel7.setText("Date of Brith:");

        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Last Name:");

        txtlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        jLabel5.setText("Phone Num:");

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updBtn.setText("Update");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)
                                .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(txtPhonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(32, 32, 32)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn)))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        txtlName.setEditable(false);
        txtfName.setEditable(false);
        txtAddress.setEditable(false);
        txtEmail.setEditable(false);
        txtPhonenum.setEditable(false);
        txtBankaccount.setEditable(false);
        txtBirth.setEditable(false);
        saveBtn.setEnabled(false);
        updBtn.setEnabled(true);

        if(txtfName.getText().isEmpty() ||txtlName.getText().isEmpty() ||txtAddress.getText().isEmpty() || txtEmail.getText().isEmpty()||txtPhonenum.getText().isEmpty()||txtBankaccount.getText().isEmpty()||txtBirth.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Please add all the mendatory fields!","Warning",JOptionPane.WARNING_MESSAGE);
            txtlName.setEditable(true);
            txtfName.setEditable(true);
            txtAddress.setEditable(true);
            txtEmail.setEditable(true);
            txtPhonenum.setEditable(true);
            txtBankaccount.setEditable(true);
            txtBirth.setEditable(true);
            saveBtn.setEnabled(true);
            updBtn.setEnabled(false);
            return;

        }else{
            if(!userNamePatternCorrect()){
                JOptionPane.showMessageDialog(null, "Please enter right email format!","Warning",JOptionPane.WARNING_MESSAGE);

                txtlName.setEditable(true);
                txtfName.setEditable(true);
                txtAddress.setEditable(true);
                txtEmail.setEditable(true);
                txtPhonenum.setEditable(true);
                txtBankaccount.setEditable(true);
                txtBirth.setEditable(true);
                saveBtn.setEnabled(true);
                updBtn.setEnabled(false);
                return;
            }
        }
        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(txtBirth.getText());

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please enter right date format!","Warning",JOptionPane.WARNING_MESSAGE);

            txtlName.setEditable(true);
            txtfName.setEditable(true);
            txtAddress.setEditable(true);
            txtEmail.setEditable(true);
            txtPhonenum.setEditable(true);
            txtBankaccount.setEditable(true);
            txtBirth.setEditable(true);
            saveBtn.setEnabled(true);
            updBtn.setEnabled(false);
            return;
        }

        
       
        account.getCustomer().setFname(txtfName.getText());
        account.getCustomer().setLname(txtlName.getText());
        account.getCustomer().setAddress(txtAddress.getText());
        account.getCustomer().setEmail(txtEmail.getText());
        account.getCustomer().setPhoneNum(txtPhonenum.getText());
        account.getCustomer().setBirth(date);
        account.getCustomer().setBankAccountNum(txtBankaccount.getText());

        JOptionPane.showMessageDialog(null, "Update Successfully");

    }//GEN-LAST:event_saveBtnActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        // TODO add your handling code here:
        txtlName.setEditable(true);
        txtfName.setEditable(true);
        txtAddress.setEditable(true);
        txtEmail.setEditable(true);
        txtPhonenum.setEditable(true);
        txtBankaccount.setEditable(true);
        txtBirth.setEditable(true);
        updBtn.setEnabled(false);
        saveBtn.setEnabled(true);

    }//GEN-LAST:event_updBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed
private boolean userNamePatternCorrect(){
        
            Pattern pa = Pattern.compile("^[^A-Za-z0-9][^_@.]");
            Matcher ma = pa.matcher(txtEmail.getText());
            boolean b = ma.find();
            if(txtEmail.getText().equals("_") || b==true){
                System.out.println("There is a special character in my string");
                return false;
            }
            else{
                System.out.println("There is no special char.");
                return true;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankaccount;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhonenum;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtlName;
    private javax.swing.JButton updBtn;
    // End of variables declaration//GEN-END:variables
}