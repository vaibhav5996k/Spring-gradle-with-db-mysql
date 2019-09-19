package com.springdatabase.springdbc.repository;

import com.springdatabase.springdbc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}