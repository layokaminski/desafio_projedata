package org.projedata.utils;

import org.projedata.model.Employee;

import java.util.List;

public class RemoveEmployee {
    public void remove(List<Employee> list, String name) {
      list.removeIf(employee -> employee.getName().equals(name));
    };
}
