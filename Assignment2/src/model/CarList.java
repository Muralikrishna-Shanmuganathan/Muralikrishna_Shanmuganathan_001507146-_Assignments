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
public class CarList {
    
    private ArrayList<Car> carList;
    
    public CarList(){
        this.carList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addNewCars(){
        
        Car newCar = new Car();
        carList.add(newCar);
        return newCar;
    }
    public Car addNewCars(String manufacturerName,String manufacturerYear,int seats,String serialNumber,String modelNumber,String city,String expiryDate,String avail){
        
        Car newCar = new Car();
        carList.add(newCar);
        return newCar;
    }
    
    public void deleteCar( Car c){
        carList.remove(c);
        
    }
    
}
