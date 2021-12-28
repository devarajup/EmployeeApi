package com.deva.employee.Employee.rest;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    Map<String, String> map = new HashMap<>();

    public void addEmployee(String id, String name) {
        map.put(id, name);
    }

    public String getEmployee(String id) {
        return map.get(id);
    }

    public Map<String, String> getAllEmployee() {
        return map;
    }

    public void deleteEmployee(String id) {
        map.remove(id);
    }
    public  void patchEmployee(String id,String oldValue,String name){
        map.replace(id, oldValue,name);
    }
    public  void  putMapping(String id, String newId ,String name){
        map.remove(id);
        map.put(newId,name);
    }
}
