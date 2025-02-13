package com.bibioteca.Sistema.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Libro libro;

    @Column(nullable = false)
    private LocalDate fechaPrestamo;
    @Column(nullable = false)
    private LocalDate fechaDevolucion;

}
