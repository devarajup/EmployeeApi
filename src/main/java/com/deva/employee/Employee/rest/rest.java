package com.deva.employee.Employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class rest {
    @Autowired
    private EmployeeService service;

    @PostMapping("/add/{id}/{name}")
    public String  addEmployee(@PathVariable String id,
                            @PathVariable String name) {
        service.addEmployee(id, name);
        return  id+" and "+name+" added";
    }

    @GetMapping("/getone/{id}")
    public String getEmployee(@PathVariable String id) {
        return service.getEmployee(id);
    }

    @GetMapping("/getall")
    public Map<String, String> getAllEmployee() {
        return service.getAllEmployee();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id) {
        service.deleteEmployee(id);
        return  id+"deleted";
    }
    @PatchMapping("/patch/{id}/{oldName}/{newName}")
    public String patchEmployee(@PathVariable String id,
                                @PathVariable String oldName,
                                @PathVariable String newName){
            service.patchEmployee(id,oldName,newName);
        return  id+" replaced or updated";
    }
    @PutMapping("/put/{id}/{newId}/{name}")
    public String putMapping(@PathVariable String id,
                             @PathVariable String newId,
                             @PathVariable String name){
        service.putMapping(id,newId,name);
        return "replaced successfully";
    }
}
