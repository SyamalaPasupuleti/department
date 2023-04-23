package com.learn.department.Repository;

import com.learn.department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
