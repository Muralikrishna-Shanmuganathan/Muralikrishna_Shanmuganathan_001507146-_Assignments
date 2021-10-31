/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author murali
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    PatientDirectory pd;
    Encounter e;
    VitalSigns vs;
    public PatientJPanel(PatientDirectory pd, VitalSigns vs, Encounter e) {
        
        initComponents();
        this.pd=pd;
        this.vs=vs;
        this.e=e;
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

        lblPatientHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnViewPatient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVital = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientHistory.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPatientHistory.setText("PATIENT HISTORY");
        add(lblPatientHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient FirstName", "Patient LastName", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblPatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 430, 141));

        btnViewPatient.setText("VIEW PATIENT HISTORY");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });
        add(btnViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 180, 40));

        tblVital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Temperature", "Blood Pressure", "Pulse", "Date of Visit"
            }
        ));
        jScrollPane2.setViewportView(tblVital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 210));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"25 or Less", "122 - 78"},
                {"26 - 30", "120 - 70"},
                {"31  - 35", "117 - 66"},
                {"35 - 45", "114 - 62"},
                {"45 - 60", "111 - 57"},
                {"Above 60", "109 - 53"}
            },
            new String [] {
                "Age", "Nominal BP"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 170, 130));

        jLabel4.setText("BLOOD PRESSURE CHART");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
       int selectedRowIndex = tblPatient.getSelectedRow();
        
        if ( selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this,"Please select a row to get Vitals");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex , 0);
       
        
        String fname = selectedPatient.getPatientFirstName();
        String lname = selectedPatient.getPatientLastName();
        
        for( VitalSigns v : e.getEncounter()){
            
            if( v.getFname().equals(fname) && v.getLname().equalsIgnoreCase(lname)){
            
                 populateVitalTable(fname,lname);
        }
        
        }
    }//GEN-LAST:event_btnViewPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPatientHistory;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblVital;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        
        for ( Patient p : pd.getPatientDirectory()){
            
            Object[] row = new Object[3];
            row[0] = p;
            row[1] = p.getPatientLastName();
            row[2] = p.getDate();
            
            model.addRow(row);
        }
    }

    private void populateVitalTable(String fname, String lname) {
        
         DefaultTableModel model = (DefaultTableModel) tblVital.getModel();
         model.setRowCount(0);
        
        for ( VitalSigns vs : e.getEncounter()){
            if( vs.getFname().equals(fname) && vs.getLname().equalsIgnoreCase(lname)){
                Object[] row = new Object[4];
                row[0] = vs;
                row[1] = vs.getBloodPressure();
                row[2] = vs.getPulse();
                row[3] = vs.getDate();
                model.addRow(row);
            }
        }
    }
}