package com.snigdha.snigdhahospitals;

// import javax.swing.tree.RowMapper;

// import java.util.ArrayList;
import java.util.List;

// import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.servlet.ModelAndView;

import com.snigdha.snigdhahospitals.model.Appointment;
import com.snigdha.snigdhahospitals.model.Doctor;
import com.snigdha.snigdhahospitals.model.Patient;

// import ch.qos.logback.core.model.Model;



@RestController
public class controller {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/d")
    public ResponseEntity<List<Doctor>> getDoctors(){
        List<Doctor> doctors = jdbcTemplate.query("SELECT * FROM doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
        return new ResponseEntity<>(doctors,HttpStatus.OK);
    }

    @GetMapping("/a")
    public ResponseEntity<List<Appointment>> getAppointments(){
        List<Appointment> appointments = jdbcTemplate.query("SELECT * FROM appointment", new BeanPropertyRowMapper<Appointment>(Appointment.class));
        return new ResponseEntity<List<Appointment>>(appointments,HttpStatus.OK);
    }


    @GetMapping("/p")
    public ResponseEntity<List<Patient>> getPatients(){
        List<Patient> patient = jdbcTemplate.query("SELECT * FROM patient", new BeanPropertyRowMapper<Patient>(Patient.class));
        return new ResponseEntity<List<Patient>>(patient,HttpStatus.OK);
    }

    // @PostMapping("/signup") // This matches the form's action attribute
    // public String signupSubmit(@ModelAttribute Patient patient) {
    //     ModelAndView mv = new ModelAndView();
    //     mv.setViewName("home");
    //     return mv;
    // }

    // @PostMapping("/login1") // This matches the form's action attribute
    // public String signupSubmit(@ModelAttribute Patient patient) {
        
    //     ModelAndView mv = new ModelAndView();
    //     mv.setViewName("home");
    //     return mv;
    // }
    
    

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/home")
    public ModelAndView homepage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/doctors")
    public ModelAndView doctors(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("doctors");
        return mv;
    }

    @RequestMapping("/login1")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/signup")
    public ModelAndView signup(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("signup");
        return mv;
    }

    @RequestMapping("/appointments")
    public ModelAndView appointments(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("appointments");
        return mv;
    }

    @RequestMapping("/contactus")
    public ModelAndView contactus(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contactus");
        return mv;
    }

    @RequestMapping("/grievance")
    public ModelAndView grievance(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("grievance");
        return mv;
    }

    @RequestMapping("/aboutus")
    public ModelAndView aboutus(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aboutus");
        return mv;
    }
    
}
