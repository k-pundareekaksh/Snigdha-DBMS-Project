package com.snigdha.snigdhahospitals.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.snigdha.snigdhahospitals.model.Patient;

@Repository
public class PatientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public PatientDao(){

    }

    // table creation
    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS patient(id int PRIMARY KEY AUTO_INCREMENT,username varchar(200),name varchar(200),password varchar(100),phone bigint,dob date,blood varchar(10))";
        int update = this.jdbcTemplate.update(query);
        System.out.print("mr patient");
        return update;  
    }

    public int insertPatient(Patient patient){
        String query = "INSERT INTO patient VALUES (?,?,?,?,?,?)";
        int update = this.jdbcTemplate.update(query);
        return update;
    }
    
}
