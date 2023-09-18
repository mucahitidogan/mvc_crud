package com.enoca.mapper;

import com.enoca.dto.request.CompanySaveRequestDto;
import com.enoca.dto.request.CompanyUpdateRequestDto;
import com.enoca.entity.Company;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICompanyMapper {
    ICompanyMapper INSTANCE = Mappers.getMapper(ICompanyMapper.class);

    Company fromCompanySaveRequestDtoToCompany(CompanySaveRequestDto dto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Company fromCompanyUpdateRequestDtoToCompany(CompanyUpdateRequestDto dto, @MappingTarget Company company);
}
