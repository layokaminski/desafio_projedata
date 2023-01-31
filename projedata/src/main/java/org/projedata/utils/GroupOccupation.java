package org.projedata.utils;

import org.projedata.model.Employee;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOccupation {
    public Map<String, List<Employee>> empolyeesOccupation;

    public void listOfOccupation(List<Employee> employees) {
        empolyeesOccupation = employees.stream()
                .collect(Collectors.groupingBy(Employee::getOccupation));
    }

    // Reference https://www.baeldung.com/java-map-entry
    public void printList(List<Employee> employees) {
        listOfOccupation(employees);
        for (Map.Entry<String, List<Employee>> listMap : empolyeesOccupation.entrySet()) {
            System.out.println("Função: " + listMap.getKey());
            for (Employee employee : listMap.getValue()) {
                System.out.println("Nome: " + employee.getName());
                System.out.println("Data de nascimento: " + employee.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("Salário: " + NumberFormat.getInstance(Locale.forLanguageTag("pt-BR")).format(employee.getSalary()));
            }
        }
    }

}

