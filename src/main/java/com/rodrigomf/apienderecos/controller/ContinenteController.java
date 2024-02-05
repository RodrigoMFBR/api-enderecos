package com.rodrigomf.apienderecos.controller;

import com.rodrigomf.apienderecos.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.rodrigomf.apienderecos.entity.Continente;

import java.util.List;

@RestController
@RequestMapping("/apiEnderecos/continente")
public class ContinenteController {

    @Autowired
    ContinenteService continenteService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Continente addContinente(@RequestBody Continente continente){
        return continenteService.addContinente(continente);
    }

    @PostMapping("/{continente}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public void removeContinente(@RequestBody Continente continente) {
        continenteService.removeContinente(continente);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Continente getContinenteById(@PathVariable Long id) {
        return continenteService.getContinenteById(id);
    }


    @GetMapping("/")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Continente> getAll() {
        return continenteService.getAll();
    }

}
