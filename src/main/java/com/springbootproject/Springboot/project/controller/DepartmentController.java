package com.springbootproject.Springboot.project.controller;

import com.springbootproject.Springboot.project.entity.Department;
import com.springbootproject.Springboot.project.error.DepartmentNotFoundException;
import com.springbootproject.Springboot.project.service.DepartmentService;
import com.springbootproject.Springboot.project.service.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    //this is ur end point

    // return ur Department entity
    // request body means u covert that json body to ur entity, which means ur Department entity
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        // buat service di departmentservicenya

        LOGGER.info("inside savedepartment of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentsList () {
        LOGGER.info("inside fetchdepartment of department controller");
        return departmentService.fetchDepartments();

    }


    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById (@PathVariable ("id") Long departmentId) throws DepartmentNotFoundException {

        return departmentService.fetchDepartmentsById(departmentId);

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById (@PathVariable("id") Long departmentId){

        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully!!!";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById (@PathVariable("id") Long departmentId, @RequestBody Department department) {

        return departmentService.updateDepartment(departmentId, department);


    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName (@PathVariable("name") String departmentName) {

        return departmentService.fetchDepartmentByName(departmentName);
    }



}
