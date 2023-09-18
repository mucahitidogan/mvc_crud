package com.enoca.mapper;

import com.enoca.dto.request.EmployeeSaveRequestDto;
import com.enoca.dto.request.EmployeeUpdateRequestDto;
import com.enoca.entity.Employee;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IEmployeeMapper {
    IEmployeeMapper INSTANCE = Mappers.getMapper(IEmployeeMapper.class);

    Employee fromEmployeeSaveRequestDtoToEmployee(final EmployeeSaveRequestDto dto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee fromEmployeeUpdateRequestDtoToEmployee(EmployeeUpdateRequestDto dto,@MappingTarget Employee employee);

}
