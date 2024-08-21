package com.groupeisi.departement_service.dto;

import com.groupeisi.departement_service.entities.Employee;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartementDTO {
    private Long id;
    private String name;
    private List<Employee> employees ;
}
