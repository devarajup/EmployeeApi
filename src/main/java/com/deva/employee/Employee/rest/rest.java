package com.deva.employee.Employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class rest {
    @Autowired
  private   EmployeeService service;

    @PostMapping("/add/{id}/{name}")
    public void addEmployee(@PathVariable String id,
                            @PathVariable String name){
        service.addEmployee(id,name);
    }
    @GetMapping("/getone/{id}")
    public String getEmployee(@PathVariable String id){
       return  service.getEmployee(id);
    }
    @GetMapping("/getall")
    public Map<String, String> getAllEmployee(){
       return  service.getAllEmployee();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
service.deleteEmployee(id);
    }

}
