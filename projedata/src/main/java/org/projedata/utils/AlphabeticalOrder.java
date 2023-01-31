package org.projedata.utils;

import org.projedata.model.Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AlphabeticalOrder {
    public void print (List<Employee> employees) {
        var empolyeesOrder = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        empolyeesOrder.forEach(employee -> {
            System.out.println(employee.getName());
        });
    }
}
