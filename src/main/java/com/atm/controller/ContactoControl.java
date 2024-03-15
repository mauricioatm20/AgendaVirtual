package com.atm.controller;

import com.atm.entyti.Contacto;
import com.atm.repository.ContactoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/contacto")
@RestController
public class ContactoControl {

    @Autowired
    private ContactoRepo contacRepository;

    @GetMapping("")
    Iterable<Contacto> list(){
        return contacRepository.findAll();
    }
}

//Devuelve un Iterable<Contacto>, que es una colección iterable de todos los contactos recuperados de la base de datos.
// Luego, este iterable se devuelve como resultado del método list(),
// lo que significa que cuando este método se invoque, devolverá todos los contactos disponibles.