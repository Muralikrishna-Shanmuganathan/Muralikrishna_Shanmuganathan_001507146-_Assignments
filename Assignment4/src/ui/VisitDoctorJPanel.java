/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import model.EncounterHistory;
import model.Person;
import model.PersonDirectory;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author murali
 */
public class VisitDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VisitDoctorJPanel
     */
    PersonDirectory pd;
    EncounterHistory eh;
    Encounter e;
    PatientDirectory patDir;
    Patient patient;
    VitalSigns vs;
    Community c;
    House h;

    public VisitDoctorJPanel(PersonDirectory pd, PatientDirectory patDir, VitalSigns vs, Encounter e, Community c ) {
        
        initComponents();
       
        this.pd = pd;
        this.patDir=patDir;
        this.vs=vs;
        this.e=e;
        this.c=c;
        this.h=h;
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnAddVitals = new javax.swing.JButton();
        lblBP = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("VISIT DOCTOR");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "Age", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 670, 200));

        btnAddVitals.setText("ADD PATIENT VITALS");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });
        add(btnAddVitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, 50));

        lblBP.setText("Blood Pressure:");
        add(lblBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, -1, -1));

        lblPulse.setText("Pulse:");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, -1, -1));

        lblTemp.setText("Temperature:");
        add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, -1, -1));

        txtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTempKeyPressed(evt);
            }
        });
        add(txtTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 121, 30));

        txtPulse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPulseKeyPressed(evt);
            }
        });
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 121, 30));

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBPKeyPressed(evt);
            }
        });
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 121, 30));

        jLabel1.setText("Date:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 170, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("ENTER PATIENT VITALS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRowIndex = tblPerson.getSelectedRow();

            if ( selectedRowIndex < 0 ){
                JOptionPane.showMessageDialog(this,"Please select a row");
                return;
        }
        
        Date date = jDateChooser1.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex , 0);
        
        Patient p = patDir.addNewPatient();
        p.setPatientFirstName(selectedPerson.getFirstName());
        p.setPatientLastName(selectedPerson.getLastName());
        p.setPatientAge(selectedPerson.getAge());
        p.setDate(strDate);
        
        
        VitalSigns v = e.addVitalSign();
        v.setTemperature(Double.parseDouble(txtTemp.getText()));
        v.setBloodPressure(Double.parseDouble(txtBP.getText()));
        v.setPulse(Integer.parseInt(txtPulse.getText()));
        v.setFname(selectedPerson.getFirstName());
        v.setLname(selectedPerson.getLastName());
        v.setDate(strDate);
        v.setAge(selectedPerson.getAge());
        v.setPin(selectedPerson.getPin());
        v.setCity(selectedPerson.getCity());
        v.setHouseName(selectedPerson.getHouseName());
        
        JOptionPane.showMessageDialog(this,"Patient Vital added!");
        
        txtTemp.setText("");
        txtBP.setText("");
        txtPulse.setText("");
        jDateChooser1.setDateFormatString("");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Please check all inputs");
        }
        
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void txtTempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempKeyPressed
        // TODO add your handling code here:
        
        txtTemp.setForeground(Color.black);
        String number = txtTemp.getText();

        char ch = evt.getKeyChar();
        
        if(ch >= '0' && ch<='9'){
            if(number.length()<3)
               txtTemp.setEditable(true);
            else
               txtTemp.setEditable(false);
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                txtTemp.setEditable(true);
            else
                txtTemp.setEditable(false); 
        }
    }//GEN-LAST:event_txtTempKeyPressed

    private void txtBPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyPressed
        // TODO add your handling code here:
        txtBP.setForeground(Color.black);
        String number = txtBP.getText();

        char ch = evt.getKeyChar();
        
        if(ch >= '0' && ch<='9'){
            if(number.length()<3)
               txtBP.setEditable(true);
            else
               txtBP.setEditable(false);
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                txtBP.setEditable(true);
            else
                txtBP.setEditable(false); 
        }
    }//GEN-LAST:event_txtBPKeyPressed

    private void txtPulseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseKeyPressed
        // TODO add your handling code here:
        txtPulse.setForeground(Color.black);
        String number = txtPulse.getText();

        char ch = evt.getKeyChar();
        
        if(ch >= '0' && ch<='9'){
            if(number.length()<3)
               txtPulse.setEditable(true);
            else
               txtPulse.setEditable(false);
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                txtPulse.setEditable(true);
            else
                txtPulse.setEditable(false); 
        }
    }//GEN-LAST:event_txtPulseKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitals;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);
        
        for ( Person p : pd.getPersonDirectory()){
            
            Object[] row = new Object[4];
            row[0] = p;
            row[1] = p.getLastName();
            row[2] = p.getAge();
            row[3] = p.getHouseNumber()+", "+p.getHouseName()+", "+p.getPin();
            
            model.addRow(row);
        }
    }


}
