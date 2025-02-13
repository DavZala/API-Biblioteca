package com.bibioteca.Sistema.Biblioteca.Controllers;

import com.bibioteca.Sistema.Biblioteca.Models.Prestamo;
import com.bibioteca.Sistema.Biblioteca.Services.PrestamoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    private PrestamoService prestamoService;

    public PrestamoController (PrestamoService prestamoService){
        this.prestamoService = prestamoService;
    }

    @GetMapping
    public List<Prestamo> obtenerPrestamos() {
        return prestamoService.obtenerPrestamos();
    }

    @PostMapping
    public Prestamo registrarPrestamo(@RequestBody Prestamo Prestamo) {
        return prestamoService.registrarPrestamo(Prestamo);
    }

    @PutMapping("/{id}")
    public Prestamo actualizarPrestamo(@PathVariable Long id, @RequestBody Prestamo prestamoActualizado) {
        return prestamoService.actualizarPrestamo(id, prestamoActualizado);
    }

    @DeleteMapping("/{id}")
    public void borrarPrestamo(@PathVariable Long id) {
        prestamoService.borrarPrestamo(id);
    }

}

