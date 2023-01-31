package org.projedata.utils;

import org.projedata.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GenerateListEmployees {
    public List<Employee> generateList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Maria", LocalDate.of(2000, Month.OCTOBER, 18), BigDecimal.valueOf(2009.44), "Operador"));
        employees.add(new Employee("João", LocalDate.of(1990, Month.MAY,12), BigDecimal.valueOf(2284.38), "Operador"));
        employees.add(new Employee("Caio", LocalDate.of(1961, Month.MAY, 2), BigDecimal.valueOf(9836.14), "Coordenador"));
        employees.add(new Employee("Miguel", LocalDate.of(1988, Month.OCTOBER, 14), BigDecimal.valueOf(19119.88), "Diretor"));
        employees.add(new Employee("Alice", LocalDate.of(1995, Month.JANUARY, 5), BigDecimal.valueOf(2234.68), "Recepcionista"));
        employees.add(new Employee("Heitor", LocalDate.of(1999, Month.NOVEMBER, 19), BigDecimal.valueOf(1582.72), "Operador"));
        employees.add(new Employee("Arthur", LocalDate.of(1993, Month.MARCH, 31), BigDecimal.valueOf(4071.84), "Contador"));
        employees.add(new Employee("Laura", LocalDate.of(1994, Month.JULY, 8), BigDecimal.valueOf(3017.45), "Gerente"));
        employees.add(new Employee("Heloísa", LocalDate.of(2003, Month.MAY, 24), BigDecimal.valueOf(1606.85), "Eletricista"));
        employees.add(new Employee("Helena", LocalDate.of(2000, Month.SEPTEMBER, 2), BigDecimal.valueOf(2799.93), "Gerente"));

        return employees;
    };
}
