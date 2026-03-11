package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.service;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.model.Videojuego;
import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.repository.IVideojuegoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {
    private IVideojuegoRepo ivr;

    //En el constructor se inyecta la dependencia al repo
    public VideojuegoService(IVideojuegoRepo ivr){
        this.ivr=ivr;
    }

    public Videojuego create(Videojuego v) {
        return ivr.save(v);
    }

    public List<Videojuego> findAll() {
        return ivr.findAll();
    }
}
