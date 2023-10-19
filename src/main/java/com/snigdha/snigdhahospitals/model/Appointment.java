package com.snigdha.snigdhahospitals.model;

import java.time.LocalDate;


public class Appointment {

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }


    public String getMode(){
        return mode;
    }

    public void setDate(String mode){
        this.mode = mode;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }


    public int getpid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public int Did(){
        return did;
    }

    public void setDid(int did){
        this.did = did;
    }

    public String getPrescription(){
        return prescription;
    }

    public void setPrescription(String prescription){
        this.prescription = prescription;
    }
    
    private int id;
    private LocalDate date;
    private String mode;
    private String status;
    private int pid;
    private int did;
    private String prescription;    
}
