package org.application.repo;

import org.application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	//save(entity)
	//findAll()
	//findById(primaryKey)
	//delete(entity)
	//deleteById(primaryKey)
}
