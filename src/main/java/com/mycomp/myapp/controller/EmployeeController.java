package com.mycomp.myapp.controller;

import com.mycomp.myapp.dto.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController

public class EmployeeController {

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee, HttpServletResponse response){

        //have a logc to persist into the Datastore

        if(true)
            response.setStatus(HttpStatus.CREATED.value());

        return employee;
    }
}
