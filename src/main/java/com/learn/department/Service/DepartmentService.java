package com.learn.department.Service;

import com.learn.department.Entity.Department;
import com.learn.department.Repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartementRepository departementRepository;

    public Department SaveDepartment(Department department) {
        System.out.println("print in DepartmentService" + department);
        return departementRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        return departementRepository.findByDepartmentId(id);
    }

    public List<Department> getAllDepartments() {
        return departementRepository.findAll();
    }
}
