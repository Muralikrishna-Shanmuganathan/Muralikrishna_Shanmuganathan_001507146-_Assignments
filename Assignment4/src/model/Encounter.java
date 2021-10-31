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
public class Encounter {
    
    private ArrayList<VitalSigns> encounter;
    
    public Encounter(){
        this.encounter = new ArrayList<VitalSigns>();
    }
    
    public ArrayList<VitalSigns> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<VitalSigns> encounter) {
        this.encounter = encounter;
    }
    
    public VitalSigns addVitalSign(){
        VitalSigns vs = new VitalSigns();
        encounter.add(vs);
        return vs;
    }
    public void deleteVitalSign(VitalSigns vs){
        encounter.remove(vs);
    } 
}