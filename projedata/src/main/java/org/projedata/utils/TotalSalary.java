package org.projedata.utils;

import org.projedata.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class TotalSalary {
    public BigDecimal totalSalary(List<Employee> employeeList) {
        BigDecimal total = BigDecimal.ZERO;
        for (Employee employee : employeeList) {
            total = total.add(employee.getSalary());
        }
        return total;
    }
}
