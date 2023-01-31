package org.projedata.utils;

import org.projedata.model.Employee;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GetOldestEmployee {
    public void print (List<Employee> employees) {
        LocalDate today = LocalDate.now();

        Optional<Employee> employee = Optional.of(employees.stream().max(Comparator.comparing(e -> {
            return e.getBirthday().until(today, ChronoUnit.YEARS);
        })).get());

        System.out.println("Nome: " + employee.get().getName());
        System.out.println("Data de Nascimento: " + employee.get().getBirthday().until(today, ChronoUnit.YEARS));
    }
}
