package com.groupeisi.departement_service.services.interfaces;

public interface IAbstractService <T,D>{
    Long save(D d);
    D update(Long id,D d);
}
