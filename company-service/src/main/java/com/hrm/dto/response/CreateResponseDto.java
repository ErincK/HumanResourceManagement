package com.hrm.dto.response;

import com.hrm.repository.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateResponseDto {
    private String companyName;
    private String title;
    private String mersisNumber;
    private String taxNumber;
    private String TaxAdministration;
    private String image;
    private String phoneNumber;
    private String address;
    private String email;
    private int numberOfEmployees;
    private String foundationYear;
    private LocalDate contractStartDate;
    private LocalDate contractFinishDate;
}