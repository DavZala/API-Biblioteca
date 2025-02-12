package com.bibioteca.Sistema.Biblioteca.Services;

import com.bibioteca.Sistema.Biblioteca.Models.Libro;
import com.bibioteca.Sistema.Biblioteca.Repositorys.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }

    public List<Libro> obtenerLibros(){
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerLibro(Long id){
        return libroRepository.findById(id);
    }
    public Libro guardarLibro(Libro libro){
        return libroRepository.save(libro);
    }

    public void borrarLibro(Long id){
        libroRepository.deleteById(id);
    }
}
