package com.snigdha.snigdhahospitals.model;

import java.time.LocalDate;

public class Patient {


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPhone(){
        return phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }


    public LocalDate getDate(){
        return dob;
    }

    public void setDate(LocalDate dob){
        this.dob=dob;
    }

    public String getBlood(){
        return blood;
    }

    public void setBlood(String blood){
        this.blood=blood;
    }
    
    private int id;
    private String name;
    private int phone;
    private LocalDate dob;
    private String blood;
}
