package com.application.rest.SpringBootRest.repository;


import com.application.rest.SpringBootRest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    // aqui como la clase JPA no tiene ciertos metodos los creamos aqui
    // para el caso de buscar productos en un rango de precio
    // entonces aqui hacemos un query metod (investigar) 2da y la primera hacemos una query directa con lenguaje jpa query

    @Query("SELECT p FROM Product  p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findByPriceInRange(BigDecimal minPrice , BigDecimal maxPrice);

    List<Product> findByPriceBetween(BigDecimal minPrice , BigDecimal maxPrice);
}
