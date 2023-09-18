package com.enoca.service;

import com.enoca.dto.request.EmployeeSaveRequestDto;
import com.enoca.dto.request.EmployeeUpdateRequestDto;
import com.enoca.entity.Employee;
import com.enoca.exception.CompanyManagerException;
import com.enoca.exception.EmployeeManagerException;
import com.enoca.exception.ErrorType;
import com.enoca.mapper.IEmployeeMapper;
import com.enoca.repository.IEmployeeRepository;
import com.enoca.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends ServiceManager<Employee,Long> {
    private final CompanyService companyService;
    private final IEmployeeRepository employeeRepository;

    public EmployeeService(CompanyService companyService, IEmployeeRepository employeeRepository){
        super(employeeRepository);
        this.companyService = companyService;
        this.employeeRepository = employeeRepository;
    }

    public Boolean save(EmployeeSaveRequestDto dto){
        Employee employee = IEmployeeMapper.INSTANCE.fromEmployeeSaveRequestDtoToEmployee(dto);
        save(employee);
        return true;
    }

    public Boolean update(EmployeeUpdateRequestDto dto){
        Boolean doesCompanyExist = companyService.existsByCompanyId(dto.getCompanyId());
        if(!doesCompanyExist)
            throw new CompanyManagerException(ErrorType.COMPANY_NOT_FOUND);
        Employee employee = employeeRepository.findById(dto.getEmployeeId()).orElseThrow(()->{
           throw new EmployeeManagerException(ErrorType.EMPLOYEE_NOT_FOUND);
        });
        Employee updatedEmployee = IEmployeeMapper.INSTANCE.fromEmployeeUpdateRequestDtoToEmployee(dto,employee);
        update(updatedEmployee);
        return true;
    }

    public void deleteById(Long employeeId){
        if(!employeeRepository.existsByEmployeeId(employeeId))
            throw new EmployeeManagerException(ErrorType.EMPLOYEE_NOT_FOUND);
        deleteById(employeeId);
    }


}
