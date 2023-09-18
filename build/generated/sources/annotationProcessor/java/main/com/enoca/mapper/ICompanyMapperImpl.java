package com.enoca.mapper;

import com.enoca.dto.request.CompanySaveRequestDto;
import com.enoca.dto.request.CompanyUpdateRequestDto;
import com.enoca.entity.Company;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T14:35:32+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ICompanyMapperImpl implements ICompanyMapper {

    @Override
    public Company fromCompanySaveRequestDtoToCompany(CompanySaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Company.CompanyBuilder<?, ?> company = Company.builder();

        company.companyName( dto.getCompanyName() );
        company.sector( dto.getSector() );
        company.taxNumber( dto.getTaxNumber() );

        return company.build();
    }

    @Override
    public Company fromCompanyUpdateRequestDtoToCompany(CompanyUpdateRequestDto dto, Company company) {
        if ( dto == null ) {
            return company;
        }

        if ( dto.getCompanyId() != null ) {
            company.setCompanyId( dto.getCompanyId() );
        }
        if ( dto.getCompanyName() != null ) {
            company.setCompanyName( dto.getCompanyName() );
        }
        if ( dto.getSector() != null ) {
            company.setSector( dto.getSector() );
        }
        if ( dto.getTaxNumber() != null ) {
            company.setTaxNumber( dto.getTaxNumber() );
        }

        return company;
    }
}
