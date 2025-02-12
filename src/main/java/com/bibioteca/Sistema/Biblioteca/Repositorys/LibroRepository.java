package com.bibioteca.Sistema.Biblioteca.Repositorys;

import com.bibioteca.Sistema.Biblioteca.Models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
