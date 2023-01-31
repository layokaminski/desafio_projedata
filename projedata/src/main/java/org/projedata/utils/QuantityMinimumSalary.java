package org.projedata.utils;

import org.projedata.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class QuantityMinimumSalary {
    private static final BigDecimal MINIMUM_SALARY = BigDecimal.valueOf(1212.0);

    public void quantity(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(
                    employee.getName() + " ganha " + employee.getSalary().divide(MINIMUM_SALARY, 0, RoundingMode.HALF_UP) + " salários mínimos");
        }
    }
}
