package com.digvijay.ems.mapper;

import com.digvijay.ems.dto.EmployeeDto;
import com.digvijay.ems.entity.Employee;

public class EmployeeMapper{
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastname(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployeeDto(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );

    }
}

