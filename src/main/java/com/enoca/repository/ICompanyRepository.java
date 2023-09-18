package com.enoca.repository;

import com.enoca.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company,Long> {
    Boolean existsByCompanyId(Long companyId);
}
