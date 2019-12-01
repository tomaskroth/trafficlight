package com.tk.trafficlight.repository;

import com.tk.trafficlight.domain.Employee;
import com.tk.trafficlight.domain.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Status> getStatusById(String id);

}
