package org.projedata.utils;

import org.projedata.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class IncreaseSalary {
    public void increase(List<Employee> employees) {
        for (Employee employee : employees) {
            var newSalary = employee.getSalary().multiply(BigDecimal.valueOf(1.10));
            employee.setSalary(newSalary);
        }
    };
}
