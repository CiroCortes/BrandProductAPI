package com.application.rest.SpringBootRest.service;

import com.application.rest.SpringBootRest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {

    // listar todos los maker
    List<Maker> findAll();

    // buscar maker por id

    Optional<Maker> findById(Long id);

    // guardar un maker

    void save(Maker maker);

    //eliminar

    void deleteById(Long id);
}
