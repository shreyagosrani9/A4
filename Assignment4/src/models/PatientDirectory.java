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
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<Patient>();
        
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;        
    }

    public void deletePatient(Patient patient) {
        patientDirectory.remove(patient);
}
}
