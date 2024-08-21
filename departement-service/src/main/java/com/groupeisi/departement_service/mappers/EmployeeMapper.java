package com.groupeisi.departement_service.mappers;

import com.groupeisi.departement_service.dto.EmployeeDTO;
import com.groupeisi.departement_service.entities.Employee;
import org.mapstruct.Mapper;
//switch Employee Entity to  EmployeeDTO and vice-versa
@Mapper(componentModel = "spring",uses = {Employee.class})
public interface EmployeeMapper extends IAbstractMapper<Employee, EmployeeDTO> {
}
