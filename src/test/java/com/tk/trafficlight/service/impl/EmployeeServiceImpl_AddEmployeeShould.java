package com.tk.trafficlight.service.impl;


import com.tk.trafficlight.data.EmployeeBuilder;
import com.tk.trafficlight.domain.Employee;
import com.tk.trafficlight.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


class EmployeeServiceImpl_AddEmployeeShould {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void failWhenPassedAnInvalidEmployee() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            employeeService.addEmployee(EmployeeBuilder.buildInvalidEmployee());
        });
    }

    @Test
    void workWhenPassedAValidEmployee() {
        Employee employee = EmployeeBuilder.buildValidEmployee();

        employeeService.addEmployee(employee);
        verify(employeeRepository, times(1)).save(employee);
    }
}