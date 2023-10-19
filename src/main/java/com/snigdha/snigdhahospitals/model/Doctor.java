package com.snigdha.snigdhahospitals.model;

public class Doctor {


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

    public String getQualification(){
        return qualification;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getFees(){
        return fees;
    }

    public void setFees(int fees){
        this.fees = fees;
    }

    public int getSlot(){
        return slots;
    }

    public void setSlot(int slots){
        this.slots = slots;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    private int id;
    private String name;
    private String qualification;
    private String department;
    private int fees;
    private int slots;
    private long phone;





}
