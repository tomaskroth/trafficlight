package com.tk.trafficlight.service.impl;

import com.tk.trafficlight.domain.Employee;
import com.tk.trafficlight.repository.EmployeeRepository;
import com.tk.trafficlight.service.EmployeeService;
import com.tk.trafficlight.service.exceptions.InvalidEmployeeException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        if (StringUtils.isEmpty(employee.getName())) {
            throw new InvalidEmployeeException("All employees should have a name");
        }

        employeeRepository.save(employee);
    }

    @Override
    public Employee fetchEmployee(String id) {
        return null;
    }

    @Override
    public List<Employee> listEmployees() {
        return null;
    }
}
