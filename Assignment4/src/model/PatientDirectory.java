/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author murali
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory(){
        this.patientDirectory = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }
    
    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addNewPatient(){
        Patient p = new Patient();
        patientDirectory.add(p);
        return p;
    }

    
    public void deletePatient(Patient p){
        patientDirectory.remove(p);
    }
}
