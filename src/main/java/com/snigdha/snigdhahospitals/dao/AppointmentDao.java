package com.snigdha.snigdhahospitals.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public AppointmentDao(){

    }

    // table creation
    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS appointment(id int primary key ,dateofapp date,modeofapp char(10),status char(10),pid int,did int,prescription varchar(100))";
        int update = this.jdbcTemplate.update(query);
        System.out.println("mr appointment");
        return update;  
    }

    
    
}
