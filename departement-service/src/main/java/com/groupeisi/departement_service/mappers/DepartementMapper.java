package com.groupeisi.departement_service.mappers;

import com.groupeisi.departement_service.dto.DepartementDTO;
import com.groupeisi.departement_service.entities.Departement;
import org.mapstruct.Mapper;

//switch Departement Entity to Departement DTO and vice-versa
@Mapper(componentModel = "spring",uses = {Departement.class})
public interface DepartementMapper extends IAbstractMapper<Departement, DepartementDTO> {
}
