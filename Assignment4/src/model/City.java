/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;

/**
 *
 * @author murali
 */
public class City {
    private String city;
    private Set<Community> community;

    public String getCity() {
        return city;
    }

    public Set<Community> getCommunity() {
        return community;
    }

    public void setCommunity(Set<Community> community) {
        this.community = community;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
