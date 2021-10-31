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
public class Community {
    
    private ArrayList<House> house;
    
    public Community(){
        this.house = new ArrayList<House>();
    }

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    } 
    
    public House addHouse(){
        
        House h = new House();
        house.add(h);
        return h;
    } 
}