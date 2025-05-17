package com.application.rest.SpringBootRest.persistence.impl;

import com.application.rest.SpringBootRest.entities.Maker;
import com.application.rest.SpringBootRest.persistence.IMakerDAO;
import com.application.rest.SpringBootRest.repository.MakerRepository;
import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//implementamos las interfaces

@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
            makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
            makerRepository.deleteById(id);
    }
}
