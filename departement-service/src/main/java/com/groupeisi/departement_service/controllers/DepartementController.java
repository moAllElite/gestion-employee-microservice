package com.groupeisi.departement_service.controllers;

import com.groupeisi.departement_service.dto.DepartementDTO;
import com.groupeisi.departement_service.services.interfaces.IDepartementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("departement")
@RestController
@AllArgsConstructor
public class DepartementController {
    //Dependency Injection & IOC
    private final IDepartementService departementService;
    //return 201 status after creating new departement
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public  Long createDepartement(
            @RequestBody DepartementDTO departementDTO
            ){
        return  departementService.save(departementDTO);
    }

    //
}
