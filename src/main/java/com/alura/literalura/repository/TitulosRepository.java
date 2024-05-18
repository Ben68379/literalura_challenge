package com.alura.literalura.repository;

import com.alura.literalura.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TitulosRepository extends JpaRepository<Titulo, Long>  {
    Optional<Titulo> findByTituloContainsIgnoreCase(String nombreLibro);
}
