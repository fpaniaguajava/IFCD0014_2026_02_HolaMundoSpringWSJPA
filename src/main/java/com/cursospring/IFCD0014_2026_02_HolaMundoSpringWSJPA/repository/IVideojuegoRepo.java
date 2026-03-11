package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.repository;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWSJPA.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideojuegoRepo extends JpaRepository<Videojuego, Integer> {
}
