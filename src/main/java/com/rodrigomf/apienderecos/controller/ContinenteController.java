package com.rodrigomf.apienderecos.controller;

import com.rodrigomf.apienderecos.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rodrigomf.apienderecos.model.Continente;

import java.util.List;

@RestController
@RequestMapping("/apiEnderecos/continente")
public class ContinenteController {

    @Autowired
    ContinenteService continenteService;

    @PostMapping
    public Continente addContinente(@RequestBody Continente continente){
        return continenteService.addContinente(continente);
    }

    @PostMapping("/{continente}")
    public String removeContinente(@RequestBody Continente continente) {
        return continenteService.removeContinente(continente);
    }

    @GetMapping("/{id}")
    public Continente getContinenteById(@PathVariable Long id) {
        return continenteService.getContinenteById(id);
    }


    @GetMapping("/")
    public List<Continente> getAll() {
        return continenteService.getAll();
    }

}
