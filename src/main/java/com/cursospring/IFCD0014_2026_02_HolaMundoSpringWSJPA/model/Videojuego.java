package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String plataforma;

    public Videojuego(String titulo, String plataforma){
        this.titulo = titulo;
        this.plataforma = plataforma;
    }
}
