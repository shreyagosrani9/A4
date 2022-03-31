/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author shreya
 */
public class Patient {    
    
    private String name;
    private String uniqueID;    
    private int age;
    private LocalDateTime createdOn;
    private boolean status = false;
    private VitalSigns vitalSigns;
    private EncounterHistory encounterHistory;
    
    public Patient(String uniqueID, String name, int age, boolean status ) {        
        this.uniqueID = uniqueID;
        this.name = name;
        this.age = age;
        this.status=status;
    }
    public Patient(){
        
    }
    
     public String getgroupAge(int age) {
            String groupAge;
            if (age<1){
                groupAge= "New Born";
            }
            else if (age>=1 &&  age <= 3){
                groupAge = "Toddler";
            } else if (age > 3 && age <= 5)  {
                groupAge = " PreSchooler";
            } else if (age > 5 && age <= 12){
                groupAge= " School Age";
            } else if ( age > 12 && age<=18){
                groupAge= "Teenager";
            } else if(age>18 && age<=60) {
                groupAge = "Adult";
            } else if(age>60){
                groupAge = "Senior Citizen";
            }else{
                groupAge = "Invalid age";
            }
            return groupAge;
        }   
    
    public boolean getBloodPressure(){
        
   
        double bloodPressure = vitalSigns.getBloodPressure();
    
        String ageGroup = getgroupAge(this.age);
        if(ageGroup =="New Born"){
            if(bloodPressure<=50 && bloodPressure>=30){
                return true;
            }
            return false;
        }
        else if(ageGroup == "Teenager"){
            if(bloodPressure<=110 && bloodPressure>=80){
                return true;
            }
            return false;
        }
        else if(ageGroup == "Adult"){
            if(bloodPressure<=120 && bloodPressure>=80){
            return true;}
            return false;
        }
        else if(ageGroup=="Middle Aged"){
            if(bloodPressure<=125 && bloodPressure>=75){
                return true;
            }
            return false;
        }
        else if(ageGroup=="Senior Citizen"){
            if(bloodPressure<=145 && bloodPressure>=75){
                return true;
            }
            else if(ageGroup=="Invalid age"){
                return false;
            }
            return false;
        }
        return false;        
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
        
    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    

}
