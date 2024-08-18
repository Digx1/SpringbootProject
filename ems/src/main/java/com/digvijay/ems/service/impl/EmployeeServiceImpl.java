package com.digvijay.ems.service.impl;

import com.digvijay.ems.dto.EmployeeDto;
import com.digvijay.ems.entity.Employee;
import com.digvijay.ems.mapper.EmployeeMapper;
import com.digvijay.ems.repository.EmployeeRepository;
import com.digvijay.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto CreateEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployeeDto(employeeDto);
         Employee savedEmployee=  employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
