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
public class Patient {
    private String patientFirstName;
    private String PatientLastName;
    private int age;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private int houseNumber;
    private int pin;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
    private ArrayList<EncounterHistory> encounterHistory;

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return PatientLastName;
    }

    public void setPatientLastName(String PatientLastName) {
        this.PatientLastName = PatientLastName;
    }

    public int getPatientNumber() {
        return age;
    }

    public void setPatientAge(int age) {
        this.age = age;
    }

    public ArrayList<EncounterHistory> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterHistory> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    @Override
    public String toString(){
        return patientFirstName;
    }
    
}
