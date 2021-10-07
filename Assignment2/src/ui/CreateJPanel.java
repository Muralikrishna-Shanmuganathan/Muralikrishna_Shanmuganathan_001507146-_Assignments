/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Car;
import model.CarList;
//import java.lang.System.Linq; 


/**
 *
 * @author murali
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addJPanel
     */
    
    CarList carList;
    public CreateJPanel(CarList carList) {
        initComponents();
        
        this.carList = carList;
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
        lblManufacturerYear = new javax.swing.JLabel();
        lblNumberOfSeats = new javax.swing.JLabel();
        lblManufacturerName = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblCertificateExpiry = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtManufacturerName = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtExpiryCertificate = new javax.swing.JTextField();
        txtManufacturerYear = new javax.swing.JTextField();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();

        lblTitle.setText("ADD VEHICLE DETAILS");

        lblManufacturerYear.setText("VEHICLE MANUFACTURER YEAR:");

        lblNumberOfSeats.setText("NUMBER OF SEATS:");

        lblManufacturerName.setText("VEHICLE MANUFACTURER NAME:");

        lblModelNumber.setText("VEHICLE MODEL NUMBER:");

        lblSerialNumber.setText("VEHICLE SERIAL NUMBER:");

        lblCertificateExpiry.setText("MAINTENANCE CERTIFICATE EXPIRY DATE:");

        lblCity.setText("CITY:");

        lblAvailability.setText("VEHICLE AVAILABILITY:");

        btnSubmit.setText("ADD VEHICLE");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        jRadioButtonYes.setText("Yes");
        jRadioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesActionPerformed(evt);
            }
        });

        jRadioButtonNo.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblManufacturerName)
                                    .addComponent(lblManufacturerYear)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(lblNumberOfSeats))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(lblSerialNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(lblModelNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(lblCity))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblCertificateExpiry)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtModelNumber)
                            .addComponent(txtManufacturerName)
                            .addComponent(txtManufacturerYear)
                            .addComponent(txtSeats)
                            .addComponent(txtSerialNumber)
                            .addComponent(txtExpiryCertificate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAvailability)
                                .addGap(16, 16, 16)
                                .addComponent(jRadioButtonYes)))
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButtonNo)))
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturerName)
                    .addComponent(txtManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturerYear)
                    .addComponent(txtManufacturerYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNumberOfSeats))
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblModelNumber))
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCity))
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateExpiry)
                    .addComponent(txtExpiryCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailability)
                    .addComponent(jRadioButtonYes)
                    .addComponent(jRadioButtonNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void jRadioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesActionPerformed
       
    }//GEN-LAST:event_jRadioButtonYesActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        try{
        String manufacturerName = txtManufacturerName.getText();
        String manufacturerYear = txtManufacturerYear.getText();
        int seats = Integer.parseInt(txtSeats.getText());
        String serialNumber = txtSerialNumber.getText();
        String modelNumber = txtModelNumber.getText();
        String city = txtCity.getText();
        String expiryDate = txtExpiryCertificate.getText();
        
        if(manufacturerName.trim().isEmpty() || manufacturerYear.trim().isEmpty()||
           serialNumber.trim().isEmpty() || modelNumber.trim().isEmpty() || city.trim().isEmpty() || expiryDate.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Please enter all fields! Some fields are required");
            return;
        }
        
        String avail="";
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonNo);
        bg.add(jRadioButtonYes);
        
        if(jRadioButtonYes.isSelected()){
            avail="yes";
        }
        if(jRadioButtonNo.isSelected()){
            avail="no";
        }
        
        Car c = carList.addNewCars();
        
        
        c.setAvailability(avail);
        c.setCarNumber(serialNumber);
        c.setCity(city);
        c.setExpiryCertificate(expiryDate);
        c.setManufacturedYear(Integer.parseInt(manufacturerYear));
        c.setLastUpdate(expiryDate);
        c.setManufacturer(manufacturerName);
        c.setModelNumber(modelNumber);
        c.setSeats(seats);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Please check all inputs");
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Vehicle added");
        
        txtManufacturerName.setText("");
        txtManufacturerYear.setText("");
        txtSeats.setText("");
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtCity.setText("");
        txtExpiryCertificate.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCertificateExpiry;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblManufacturerName;
    private javax.swing.JLabel lblManufacturerYear;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblNumberOfSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiryCertificate;
    private javax.swing.JTextField txtManufacturerName;
    private javax.swing.JTextField txtManufacturerYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
