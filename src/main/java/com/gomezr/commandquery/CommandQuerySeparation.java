package com.gomezr.commandquery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandQuerySeparation {
    private final SalaryService salaryService;

    public String changingSalary(Employee employee) {
        salaryService.changeSalary(employee, 100);
        salaryService.changeSalary(employee, 100);

        int x =  salaryService.changeSalary(employee, 100);

        return "Logic with " + x;
    }
}


class SalaryService {
    public int changeSalary(Employee employee, int x) {
        //do stuff
        employee.setSalary(employee.getSalary() + x);
        return x+200;
    }
}

@Data
@AllArgsConstructor
class Employee {
    private String name;
    private int salary;
}