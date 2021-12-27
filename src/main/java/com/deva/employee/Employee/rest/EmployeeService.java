package com.deva.employee.Employee.rest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    Map<String,String> map = new HashMap<>();
    public void addEmployee(String id,String name){
        map.put(id,name);
    }
    public  String   getEmployee(String id){
        return  map.get(id);
    }
    public Map<String, String> getAllEmployee(){
        return  map;
    }
    public void  deleteEmployee(String id){
        map.remove(id);
    }
}
