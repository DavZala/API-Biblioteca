package com.bibioteca.Sistema.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible = true;
}
