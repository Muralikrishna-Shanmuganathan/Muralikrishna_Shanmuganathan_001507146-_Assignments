/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Person;
import java.util.ArrayList;

/**
 *
 * @author murali
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson(){
        
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }  
    public void deletePerson(Person p){
        personDirectory.remove(p);
    }

    public Person addPerson(String fname, String lname, int age, String houseNumber, int pin, String houseName, String city) {
        
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }  
}