package com.groupeisi.departement_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeDTO {
    private Long id;
    private String fullName;
    private String sex;
    private String departement;
}
