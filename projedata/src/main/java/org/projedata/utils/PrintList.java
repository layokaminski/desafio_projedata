package org.projedata.utils;

import org.projedata.model.Employee;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PrintList {
    public void print(List<Employee> employees) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        for (Employee employee : employees) {
            System.out.println("Nome: " + employee.getName());
            System.out.println("Data de Nascimento: " + employee.getBirthday().format(formatter));
            System.out.println("Salário: " + decimalFormat.format(employee.getSalary()));
            System.out.println("Cargo: " + employee.getOccupation());
            System.out.println("");
        }
    }
}
