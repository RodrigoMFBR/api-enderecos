package com.rodrigomf.apienderecos.service;

import com.rodrigomf.apienderecos.dto.ContinenteDto;
import com.rodrigomf.apienderecos.model.Continente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rodrigomf.apienderecos.respository.ContinenteRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContinenteService {

    private final ContinenteRepository continenteRepository;

    @Autowired
    public ContinenteService(ContinenteRepository continenteRepository){
        this.continenteRepository = continenteRepository;
    }

    public ContinenteDto addContinente(String sgl, String nome){
        Continente continente = new Continente();
        continente.setSgl(sgl);
        continente.setNome(nome);
        continente.setDtHrInclusao(new Date());
        continente.setUsuInclusao("root");
        continente = continenteRepository.save(continente);
        ContinenteDto continenteDto = new ContinenteDto(continente.getId(), continente.getSgl(),continente.getNome());
        return continenteDto;

    }

    public Continente getContinenteById(Long id){
        return continenteRepository.getById(id);
    }

    public List<ContinenteDto> getAll(){
        List<Continente> listContinente = continenteRepository.findAll();

        return listContinente.stream()
                .map(continente -> new ContinenteDto(continente.getId(), continente.getSgl(), continente.getNome()))
                .collect(Collectors.toList());

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
