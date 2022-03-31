/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author shreya
 */
public class Person {
    protected String unique_id;
    protected String name;
    protected int age;
    protected String address;
    protected String email;
    protected String community;
    protected boolean status;
    
    public Person(String unique_id, String name, int age, String address, String email, String community, boolean status){
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.community = community;
        this.status = status;
    }
    
    public Person(){
        
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return unique_id;
    }
    
    
    
}
