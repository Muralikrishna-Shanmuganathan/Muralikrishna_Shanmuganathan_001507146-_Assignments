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
public class System {
    
    private ArrayList<PersonDirectory> persondir;
    private ArrayList<PatientDirectory> patientdir;
    private ArrayList<City> city;

    public ArrayList<PersonDirectory> getPersondir() {
        return persondir;
    }

    public void setPersondir(ArrayList<PersonDirectory> persondir) {
        this.persondir = persondir;
    }

    public ArrayList<PatientDirectory> getPatientdir() {
        return patientdir;
    }

    public void setPatientdir(ArrayList<PatientDirectory> patientdir) {
        this.patientdir = patientdir;
    }

    public ArrayList<City> getCity() {
        return city;
    }

    public void setCity(ArrayList<City> city) {
        this.city = city;
    }
    
    
}
