package com.es.libreria.service
import com.es.libreria.model.Libro
import com.es.libreria.repository.LibroRepository
import org.springframework.stereotype.Service

@Service
class LibroService(private val libroRepository: LibroRepository) {

    fun crearLibro(libro: Libro): Libro {
        return libroRepository.save(libro)
    }

    fun obtenerTodosLosLibros(): List<Libro> {
        return libroRepository.findAll()
    }

    fun obtenerLibroPorId(id: Long): Libro? {
        return libroRepository.findById(id).orElse(null)
    }

    fun eliminarLibro(id: Long) {
        libroRepository.deleteById(id)
    }

    fun obtenerLibrosPorGenero(genero: String): List<Libro> {
        return libroRepository.findAll().filter { it.genero.equals(genero, ignoreCase = true) }
    }
}