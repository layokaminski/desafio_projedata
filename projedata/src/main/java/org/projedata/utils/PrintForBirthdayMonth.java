package org.projedata.utils;

import org.projedata.model.Employee;

import java.text.DecimalFormat;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PrintForBirthdayMonth {
    public void print(List<Employee> employees) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        for (Employee employee : employees) {
            Month birthMonth = employee.getBirthday().getMonth();
            if (birthMonth == Month.OCTOBER || birthMonth == Month.DECEMBER) {
                System.out.println("Nome: " + employee.getName());
            }
        }
    }
}
