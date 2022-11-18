package com.gomezr.commandquery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CommandQuerySeparationTest {
    @InjectMocks
    private CommandQuerySeparation commandQuerySeparation;
    @Mock
    private SalaryService salaryService;

    @Test
    public void test_changingSalary() {
        Employee employee = new Employee("Mark", 1000);

        when(salaryService.getSalaryDelta(employee, 100)).thenReturn(10);
        String salaryLogic = commandQuerySeparation.changingSalary(employee);
        verify(salaryService).changeSalary(employee, 100);

        assertEquals("Logic with 10", salaryLogic);
    }

}