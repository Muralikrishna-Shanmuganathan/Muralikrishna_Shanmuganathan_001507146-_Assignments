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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounter;

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }
    public Encounter addEncounter(){
        Encounter e = new Encounter();
        encounter.add(e);
        return e;
    }
    
    public void deleteEncounter(Encounter e){
        encounter.remove(e);
    }
}