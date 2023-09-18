package com.enoca.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class CompanyUpdateRequestDto {
    private Long companyId;
    private String companyName;
    private String sector;
    private String taxNumber;
}
