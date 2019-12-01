package com.tk.trafficlight.service;

import com.tk.trafficlight.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    /**
     * Add a single employee to the system
     *
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * Fetch an employee provided a valid ID is passed through
     *
     * @param id
     * @return Employee information
     */
    Employee fetchEmployee(String id);

    /**
     * Fetch an unfiltered list of employees
     * @return
     */
    List<Employee> listEmployees();

}
