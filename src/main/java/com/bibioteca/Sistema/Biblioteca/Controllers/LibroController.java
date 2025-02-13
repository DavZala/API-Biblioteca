package com.bibioteca.Sistema.Biblioteca.Controllers;

import com.bibioteca.Sistema.Biblioteca.Models.Libro;
import com.bibioteca.Sistema.Biblioteca.Services.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;

    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> obtenerLibros(){
       return libroService.obtenerLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibro(@PathVariable Long id){
        return libroService.obtenerLibro(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro){
        System.out.println(libro.getAutor());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getGenero());
        System.out.println(libro.isDisponible());
        return libroService.guardarLibro(libro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarLibro(@PathVariable Long id){
        if (libroService.obtenerLibro(id).isPresent()) {
            libroService.borrarLibro(id);
            return ResponseEntity.noContent().build(); // 204, no content pero si ejecuto
        }
            return ResponseEntity.notFound().build(); // 404 no encontro
        }
}
