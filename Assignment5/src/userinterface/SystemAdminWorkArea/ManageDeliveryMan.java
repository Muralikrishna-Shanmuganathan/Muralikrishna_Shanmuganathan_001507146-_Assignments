/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Business.EcoSystem;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murali
 */
public class ManageDeliveryMan extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryMan
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    public ManageDeliveryMan(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateDeliveryTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setText("MANAGE DELIVERYMAN PORTAL");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 66, -1, -1));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 363, -1, -1));

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 363, -1, -1));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 363, -1, -1));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 363, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 446, 167, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 490, 167, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 534, 167, -1));

        jLabel1.setText("NAME:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 451, -1, -1));

        lblUserName.setText("USER NAME:");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 495, -1, -1));

        jLabel3.setText("PASSWORD:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 539, -1, -1));

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 57, 120, 30));

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "USER NAME", "PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String username=txtUserName.getText();
        String password=txtPassword.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Please enter your name");

            }else if(Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter your name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(username==null || username.isEmpty()){
                throw new NullPointerException("Please enter your username");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please enter your username");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " UserName is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Please enter your password");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please enter your password");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null," UserName already exists ");
        }else{

            UserAccount u1 =system.getUserAccountDirectory().createUserAccount(name,username,password, null, new DeliverManRole());
            DeliveryMan deliveryMan= system.getDeliveryManDirectory().createDeliveryMan(username);

            populateDeliveryTable();

            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryMan.getSelectedRow();

        String username= (String) tblDeliveryMan.getValueAt(selectedRowIndex, 1);
        String pwd= (String) tblDeliveryMan.getValueAt(selectedRowIndex, 2);

        if ( selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this,"Please select a customer to view");
            return;
        }else{

            user=system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtName.setText(user.getName());
            txtUserName.setText(user.getUsername());
            txtPassword.setText(user.getPassword());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String username=txtUserName.getText();
        String password=txtPassword.getText();

        if ( name.trim().isEmpty() || username.trim().isEmpty() || password.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please check all inputs");
        }

        system.getUserAccountDirectory().updateUserAccount(user,name,username,password);
        populateDeliveryTable();

        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryMan.getSelectedRow();
        if(selectedRowIndex>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblDeliveryMan.getValueAt(selectedRowIndex, 1);
                String pwd= (String) tblDeliveryMan.getValueAt(selectedRowIndex, 2);
                UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getCustomerDirectory().deleteCustomer(user.getUsername());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateDeliveryTable();

        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateDeliveryTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        
        model.setRowCount(0);

        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.DeliverManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }
}
