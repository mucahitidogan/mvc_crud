package com.enoca.dto.request;

import com.enoca.entity.enums.EGender;
import com.enoca.entity.enums.EPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class EmployeeUpdateRequestDto {
    private Long employeeId;
    private String employeeName;
    private EGender gender;
    private EPosition position;
    private Double salary;
    private Long companyId;
}
