package com.snigdha.snigdhahospitals.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public DoctorDao(){

    }

    // table creation
    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS doctor(id int primary key ,name varchar(200),department varchar(100),qualification varchar(100),dob date,slots int,fees int,phone bigint)";
        int update = this.jdbcTemplate.update(query);
        System.out.print("mr doctor");
        return update;  
    }
    
}
