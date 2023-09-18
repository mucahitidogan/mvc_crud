package com.enoca.mapper;

import com.enoca.dto.request.EmployeeSaveRequestDto;
import com.enoca.dto.request.EmployeeUpdateRequestDto;
import com.enoca.entity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T14:35:32+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class IEmployeeMapperImpl implements IEmployeeMapper {

    @Override
    public Employee fromEmployeeSaveRequestDtoToEmployee(EmployeeSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee.EmployeeBuilder<?, ?> employee = Employee.builder();

        employee.employeeName( dto.getEmployeeName() );
        employee.gender( dto.getGender() );
        employee.position( dto.getPosition() );
        employee.salary( dto.getSalary() );
        employee.companyId( dto.getCompanyId() );

        return employee.build();
    }

    @Override
    public Employee fromEmployeeUpdateRequestDtoToEmployee(EmployeeUpdateRequestDto dto, Employee employee) {
        if ( dto == null ) {
            return employee;
        }

        if ( dto.getEmployeeId() != null ) {
            employee.setEmployeeId( dto.getEmployeeId() );
        }
        if ( dto.getEmployeeName() != null ) {
            employee.setEmployeeName( dto.getEmployeeName() );
        }
        if ( dto.getGender() != null ) {
            employee.setGender( dto.getGender() );
        }
        if ( dto.getPosition() != null ) {
            employee.setPosition( dto.getPosition() );
        }
        if ( dto.getSalary() != null ) {
            employee.setSalary( dto.getSalary() );
        }
        if ( dto.getCompanyId() != null ) {
            employee.setCompanyId( dto.getCompanyId() );
        }

        return employee;
    }
}
