/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shreya
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterList;
    
    public EncounterHistory(){
        this.encounterList = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
  
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter encounter){
        encounterList.remove(encounter);
    }
    
    
}
