package com.learn.department.Controller;

import com.learn.department.Entity.Department;
import com.learn.department.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department SaveDepartment(@RequestBody Department department) {
        System.out.println("print in saveDepartment" + department);
        return departmentService.SaveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long DepartmentId) {
        return departmentService.findDepartmentById(DepartmentId);
    }

    @GetMapping("/allDepartments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
