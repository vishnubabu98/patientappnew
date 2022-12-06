package com.nest.patientapp_backend.controller;

import com.nest.patientapp_backend.dao.PatientDao;
import com.nest.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @GetMapping("/view")
    public List<Patients> viewPage(){
        return (List<Patients>)dao.findAll();
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String addPage(@RequestBody Patients p){
        System.out.println(p.toString());
        dao.save(p);
        return "products added successfully";
    }
}
