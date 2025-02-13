package com.bibioteca.Sistema.Biblioteca.Repositorys;

import com.bibioteca.Sistema.Biblioteca.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
