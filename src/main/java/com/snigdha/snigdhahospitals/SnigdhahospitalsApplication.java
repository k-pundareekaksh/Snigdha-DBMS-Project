package com.snigdha.snigdhahospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

import com.snigdha.snigdhahospitals.dao.AppointmentDao;
import com.snigdha.snigdhahospitals.dao.DoctorDao;
import com.snigdha.snigdhahospitals.dao.PatientDao;

@SpringBootApplication
public class SnigdhahospitalsApplication implements CommandLineRunner{


    @Autowired
    private DoctorDao doctorDao;

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private AppointmentDao appointmentDao;

    public static void main(String[] args) {
        SpringApplication.run(SnigdhahospitalsApplication.class, args);
        System.out.println("started . . . . ");
    }

	// Configure a JdbcTemplate bean
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

	@Override
	public void run(String... args) throws Exception {
        System.out.println(this.doctorDao.createTable());
        System.out.println(this.patientDao.createTable());
        System.out.println(this.appointmentDao.createTable());
	}
}
