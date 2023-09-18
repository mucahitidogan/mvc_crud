package com.enoca.repository;

import com.enoca.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    Boolean existsByEmployeeId(Long employeeId);
}
