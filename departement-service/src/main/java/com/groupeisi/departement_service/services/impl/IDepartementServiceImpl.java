package com.groupeisi.departement_service.services.impl;

import com.groupeisi.departement_service.dto.DepartementDTO;
import com.groupeisi.departement_service.entities.Departement;
import com.groupeisi.departement_service.mappers.DepartementMapper;
import com.groupeisi.departement_service.repository.DepartementRepository;
import com.groupeisi.departement_service.services.interfaces.IDepartementService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IDepartementServiceImpl implements IDepartementService {

    //Dependency Injection
    private final DepartementRepository departementRepository;
    private final DepartementMapper departementMapper;
    //return Id after creating a new departement
    @Override
    public Long save(DepartementDTO departementDTO) {
        Departement departement =departementMapper.convertToEntity(departementDTO);
        return departementRepository.save(departement)
                .getId();
    }
    //return DepartementDTO object after update successful
    @Override
    public DepartementDTO update(Long id,DepartementDTO departementDTO) {
         if(departementRepository.existsById(id)){
             throw new EntityNotFoundException(
                     String.format("No Departement was found with provided: %d ",id)
             );
         }
         Departement updatedDepartement = departementRepository.save(
                 departementMapper.convertToEntity(departementDTO)
         );
         return  departementMapper.convertToDto(updatedDepartement);
    }
}
