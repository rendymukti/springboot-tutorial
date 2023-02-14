package com.springbootproject.Springboot.project.service;

import com.springbootproject.Springboot.project.entity.Department;
import com.springbootproject.Springboot.project.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {


    //dari sini bakal di buat di implnya
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentsById(Long departmentId) throws DepartmentNotFoundException;


    public void deleteDepartmentById(Long departmentId);


    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}


