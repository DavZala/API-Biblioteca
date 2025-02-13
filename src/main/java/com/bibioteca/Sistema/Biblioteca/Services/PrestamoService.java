package com.bibioteca.Sistema.Biblioteca.Services;

import com.bibioteca.Sistema.Biblioteca.Models.Libro;
import com.bibioteca.Sistema.Biblioteca.Models.Prestamo;
import com.bibioteca.Sistema.Biblioteca.Repositorys.LibroRepository;
import com.bibioteca.Sistema.Biblioteca.Repositorys.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {
    private final PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository){
        this.prestamoRepository = prestamoRepository;
    }

    public List<Prestamo> obtenerPrestamos() {
        return prestamoRepository.findAll();
    }

    public Prestamo registrarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public Prestamo actualizarPrestamo(Long id, Prestamo prestamoActualizado) {
        Prestamo prestamo = prestamoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prestamo no encontrado"));
        prestamo.setFechaPrestamo(prestamoActualizado.getFechaDevolucion());
        return prestamoRepository.save(prestamo);
    }

    public void borrarPrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }

}
