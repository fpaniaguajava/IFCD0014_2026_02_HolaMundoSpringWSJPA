package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.controller;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.model.Videojuego;
import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.service.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/videojuego")
public class VideojuegoController {
    @Autowired
    VideojuegoService vs;

    @PostMapping("/")
    public Videojuego create(@RequestBody Videojuego videojuego) {
        return vs.create(videojuego);
    }

    @GetMapping("/")
    public List<Videojuego> readAll(){
        return vs.findAll();
    }
}