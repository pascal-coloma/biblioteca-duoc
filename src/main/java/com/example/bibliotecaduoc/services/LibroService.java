package com.example.bibliotecaduoc.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliotecaduoc.repository.LibroRepository;
import com.example.bibliotecaduoc.model.Libro;
import java.util.List;


@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Libro eliminado";
    }

    public String guardarArreglo(List <Libro> listLibro){
        libroRepository.guardarArregloLibro(listLibro);
        return "Arreglo guardado";
    }

    public int totalLibros(){
        return libroRepository.totalLibros();
    }
}
