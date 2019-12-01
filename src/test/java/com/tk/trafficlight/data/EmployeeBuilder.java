package com.tk.trafficlight.data;

import com.tk.trafficlight.domain.Employee;

public class EmployeeBuilder {

    public static Employee buildInvalidEmployee() {
        return new Employee();
    }

    public static Employee buildValidEmployee() {
        return Employee.builder()
                       .name("John Doe")
                       .build();
    }
}
