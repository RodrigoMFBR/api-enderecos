package com.rodrigomf.apienderecos.controller;

import com.rodrigomf.apienderecos.dto.ContinenteDto;
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

    @RequestMapping(method = RequestMethod.GET, path = "/add/{sgl}/{nome}")
    public ContinenteDto addContinente(@PathVariable String sgl, @PathVariable String nome){
        return continenteService.addContinente(sgl, nome);
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
    public List<ContinenteDto> getAll() {
        return continenteService.getAll();
    }

}
