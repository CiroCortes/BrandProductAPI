package com.application.rest.SpringBootRest.persistence;

import com.application.rest.SpringBootRest.entities.Maker;

import java.util.List;
import java.util.Optional;

// Patron de diseño DAO
// data acces object
// aqui implementamos los metedos para acceder y procesar lo bassico de este crud
public interface IMakerDAO {

    // listar todos los maker
    List<Maker>findAll();

    // buscar maker por id

    Optional <Maker> findById(Long id);

    // guardar un maker

    void save(Maker maker);

    //eliminar

    void deleteById(Long id);
}
