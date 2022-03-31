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
public class System {
    private ArrayList<PersonDirectory> personDirectory;
    private ArrayList<PatientDirectory> patientDirectory;
    private String city;

    public ArrayList<PersonDirectory> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonDirectory> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public ArrayList<PatientDirectory> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientDirectory> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
}
