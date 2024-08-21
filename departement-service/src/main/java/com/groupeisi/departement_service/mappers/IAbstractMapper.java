package com.groupeisi.departement_service.mappers;

public  interface IAbstractMapper<T,D> {
        //allow to convert Data Transfert Object to an Entity
       T convertToEntity(D d);
     //allow to an Entity convert  to Data Transfert Object
       D convertToDto(T t);
}
