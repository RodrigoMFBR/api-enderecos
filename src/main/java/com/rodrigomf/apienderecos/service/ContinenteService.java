package com.rodrigomf.apienderecos.service;

import com.rodrigomf.apienderecos.model.Continente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rodrigomf.apienderecos.respository.ContinenteRepository;
import java.util.List;
import java.util.Optional;

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
        List<Continente> listContinente = continenteRepository.findAll();

        return listContinente;
    }

    public String removeContinente(Continente continente){

        continenteRepository.delete(continente);
        Optional<Continente> continenteOpt = continenteRepository.findById(continente.getId());

        if (continenteOpt.isPresent()) {
            return "Continente " + continente + " não excluído.";
        } else {
            return "Exclusão realizada com sucesso";
        }
    }


}
