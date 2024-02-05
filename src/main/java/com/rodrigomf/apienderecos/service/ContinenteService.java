package com.rodrigomf.apienderecos.service;

import com.rodrigomf.apienderecos.entity.Continente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rodrigomf.apienderecos.respository.ContinenteRepository;
import java.util.List;

@Service
public class ContinenteService {

    private final ContinenteRepository continenteRepository;

    @Autowired
    public ContinenteService(ContinenteRepository continenteRepository){
        this.continenteRepository = continenteRepository;
    }

    public Continente addContinente(Continente continente){
        return continenteRepository.save(continente);
    }

    public Continente getContinenteById(Long id){
        return continenteRepository.getById(id);
    }

    public List<Continente> getAll(){
        return continenteRepository.findAll();
    }

    public void removeContinente(Continente continente){
        continenteRepository.delete(continente);
    }

}
