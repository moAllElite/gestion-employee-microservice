package com.groupeisi.departement_service.repository;

import com.groupeisi.departement_service.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
