/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author shreya
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList<Person>();
        
        Person person1 = new Person("001095168","Mike", 25, "2 Washington St", "mikewashington@gmail.com", "Mission Main", false);
        Person person2 = new Person("ABP546987","Alex", 20, "327 Darlington St", "alexmorgan@gmail.com", "Roxbury", false);
        Person person3 = new Person("POE987455","Max", 65, "52 Puddington St", "maxarnold@gmail.com", "Mission Main", false);
        Person person4 = new Person("PLE964587","Ronald", 45, "1573 Hammond St", "ronaldk@gmail.com", "Roxbury", false);
        Person person5 = new Person("123456789","Haley", 65, "15 Hammond St", "haley@gmail.com", "Roxbury", false);
        Person person6 = new Person("12345678","Jill", 20, "15 germain Street", "jill@gmail.com", "saint germain", false);
        
        personDirectory.add(person1);
        personDirectory.add(person2);
        personDirectory.add(person3);
        personDirectory.add(person4);
        personDirectory.add(person5);
        personDirectory.add(person6);
        
    }
 

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

   public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson(){
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }    
    
}
