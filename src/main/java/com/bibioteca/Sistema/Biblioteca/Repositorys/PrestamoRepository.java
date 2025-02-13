package com.bibioteca.Sistema.Biblioteca.Repositorys;

import com.bibioteca.Sistema.Biblioteca.Models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
