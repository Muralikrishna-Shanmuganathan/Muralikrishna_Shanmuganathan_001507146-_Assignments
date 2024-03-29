/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarList;

/**
 *
 * @author murali
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    CarList carList;
    public ViewJPanel(CarList carList) {
        initComponents();
        
        this.carList= carList;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtManufacturerName = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        lblManufacturerYear = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblNumberOfSeats = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        lblManufacturerName = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblModelNumber = new javax.swing.JLabel();
        txtExpiryCertificate = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtManufacturerYear = new javax.swing.JTextField();
        lblCertificateExpiry = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        lblAvailability1 = new javax.swing.JLabel();
        lblDateUpdated = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("VIEW VEHICLE INFORMATION");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        tblView.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Manufacturer Name", "Serial Number", "ModelNumber", "City", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 57, 597, 408));

        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));
        add(txtManufacturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 605, 135, -1));
        add(txtSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 749, 98, -1));

        lblManufacturerYear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblManufacturerYear.setText("VEHICLE MANUFACTURER YEAR:");
        add(lblManufacturerYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 707, -1, -1));

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });
        add(txtSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 703, 99, -1));

        lblNumberOfSeats.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNumberOfSeats.setText("NUMBER OF SEATS:");
        add(lblNumberOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 758, -1, -1));
        add(txtModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 649, 134, -1));

        lblManufacturerName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblManufacturerName.setText("VEHICLE MANUFACTURER NAME:");
        add(lblManufacturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 609, -1, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 652, 100, -1));

        lblModelNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblModelNumber.setText("VEHICLE MODEL NUMBER:");
        add(lblModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 653, -1, -1));
        add(txtExpiryCertificate, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 754, 134, -1));

        lblSerialNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSerialNumber.setText("VEHICLE SERIAL NUMBER:");
        add(lblSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 707, -1, -1));
        add(txtManufacturerYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 703, 134, -1));

        lblCertificateExpiry.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCertificateExpiry.setText("MAINTENANCE CERTIFICATE EXPIRY DATE:");
        add(lblCertificateExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 758, -1, -1));

        lblCity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCity.setText("CITY:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 649, -1, 30));

        btnupdate.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        buttonGroup1.add(jRadioButtonYes);
        jRadioButtonYes.setText("Yes");
        jRadioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesActionPerformed(evt);
            }
        });
        add(jRadioButtonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 591, -1, 40));

        buttonGroup1.add(jRadioButtonNo);
        jRadioButtonNo.setText("No");
        add(jRadioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 591, -1, 40));

        lblAvailability1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAvailability1.setText("VEHICLE AVAILABILITY:");
        add(lblAvailability1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 601, -1, 20));

        lblDateUpdated.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        add(lblDateUpdated, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 300, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblView.getSelectedRow();
        
        if ( selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this,"Please select a row to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car) model.getValueAt(selectedRowIndex , 0);
        
        
        txtCity.setText(selectedCar.getCity());
        txtExpiryCertificate.setText(selectedCar.getExpiryCertificate());
        txtManufacturerName.setText(selectedCar.getManufacturer());
        txtManufacturerYear.setText(String.valueOf(selectedCar.getManufacturedYear()));
        txtModelNumber.setText(selectedCar.getModelNumber());
        txtSeats.setText(String.valueOf(selectedCar.getSeats()));
        txtSerialNumber.setText(selectedCar.getCarNumber());
      
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblView.getSelectedRow();
        
        if ( selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car) model.getValueAt(selectedRowIndex , 0);
        
        carList.deleteCar(selectedCar);

        JOptionPane.showMessageDialog(this,"Vehicle deleted");
        
        populateTable();
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonNo);
        bg.add(jRadioButtonYes);
        bg.clearSelection();
        txtManufacturerName.setText("");
        txtManufacturerYear.setText("");
        txtSeats.setText("");
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtCity.setText("");
        txtExpiryCertificate.setText("");
        
        Car obj = new Car();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String date = dtf.format(now);
        obj.setDate(date);
        lblDateUpdated.setText("Fleet last updated on: "+date);
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jRadioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesActionPerformed

    }//GEN-LAST:event_jRadioButtonYesActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblView.getSelectedRow();
        
        if ( selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this,"Please select a row to update");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car) model.getValueAt(selectedRowIndex , 0);
        
        selectedCar.setCity(txtCity.getText());
        selectedCar.setExpiryCertificate(txtExpiryCertificate.getText());
        selectedCar.setManufacturer(txtManufacturerName.getText());
        selectedCar.setManufacturedYear(Integer.parseInt(txtManufacturerYear.getText()));
        selectedCar.setModelNumber(txtModelNumber.getText());
        selectedCar.setSeats(Integer.parseInt(txtSeats.getText()));
        if(!(selectedCar.getCarNumber().equalsIgnoreCase(txtSerialNumber.getText()))){
            JOptionPane.showMessageDialog(null,"Cannot update Serial Number!");
            return;
        }
        String avail="";
        int availCheck = 0;
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonNo);
        bg.add(jRadioButtonYes);
        
        if(jRadioButtonYes.isSelected()){
            avail="yes";
        }
        else if(jRadioButtonNo.isSelected()){
            avail="no";
        }
        else{
            availCheck = 1;
        }
        
        if (availCheck == 0){
            selectedCar.setAvailability(avail);
        }
        
        
        populateTable();
        
        bg.clearSelection();
        txtManufacturerName.setText("");
        txtManufacturerYear.setText("");
        txtSeats.setText("");
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtCity.setText("");
        txtExpiryCertificate.setText("");
        
        Car obj = new Car();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String date = dtf.format(now);
        obj.setDate(date);
        lblDateUpdated.setText("Fleet last updated on: "+date);
        
        
        
    }//GEN-LAST:event_btnupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability1;
    private javax.swing.JLabel lblCertificateExpiry;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateUpdated;
    private javax.swing.JLabel lblManufacturerName;
    private javax.swing.JLabel lblManufacturerYear;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblNumberOfSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiryCertificate;
    private javax.swing.JTextField txtManufacturerName;
    private javax.swing.JTextField txtManufacturerYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for ( Car c : carList.getCarList()){
            
            Object[] row = new Object[5];
            row[0] = c;
            row[1] = c.getCarNumber();
            row[2] = c.getModelNumber();
            row[3] = c.getCity();
            row[4] = c.getAvailability();
            
            model.addRow(row);
        }
    }

    
}
