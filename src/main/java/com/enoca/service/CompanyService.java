package com.enoca.service;

import com.enoca.dto.request.CompanySaveRequestDto;
import com.enoca.dto.request.CompanyUpdateRequestDto;
import com.enoca.entity.Company;
import com.enoca.exception.CompanyManagerException;
import com.enoca.exception.ErrorType;
import com.enoca.mapper.ICompanyMapper;
import com.enoca.repository.ICompanyRepository;
import com.enoca.utility.ServiceManager;
import org.springframework.stereotype.Service;


@Service
public class CompanyService extends ServiceManager<Company,Long> {
    private final ICompanyRepository companyRepository;

    public CompanyService(ICompanyRepository companyRepository){
        super(companyRepository);
        this.companyRepository = companyRepository;
    }

    public Boolean existsByCompanyId(Long companyId){
        return companyRepository.existsByCompanyId(companyId);
    }

    public void update(CompanyUpdateRequestDto dto){
        Company company = findById(dto.getCompanyId()).orElseThrow(()->{
            throw new CompanyManagerException(ErrorType.COMPANY_NOT_FOUND);
        });
        Company updatedCompany = ICompanyMapper.INSTANCE.fromCompanyUpdateRequestDtoToCompany(dto,company);
        update(updatedCompany);
    }

    public void save(CompanySaveRequestDto dto){
        Company company = ICompanyMapper.INSTANCE.fromCompanySaveRequestDtoToCompany(dto);
        save(company);
    }



}
