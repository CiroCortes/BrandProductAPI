package com.application.rest.SpringBootRest.service;

import com.application.rest.SpringBootRest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {

    //buscar todos los productos

    List<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product product);

    void deleteById(Long id);

    //obtener un listado de precios por un rango
    List<Product> findByPriceInRange(BigDecimal minPrice , BigDecimal maxPrice);
}
