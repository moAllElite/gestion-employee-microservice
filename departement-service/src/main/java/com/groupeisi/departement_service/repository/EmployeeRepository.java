package com.groupeisi.departement_service.repository;

import com.groupeisi.departement_service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
