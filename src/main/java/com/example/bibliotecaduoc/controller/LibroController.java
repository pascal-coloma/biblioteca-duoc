package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/busIsbn")
    public Libro busqIsbn(@RequestParam String isbn){
        return libroService.getLibroIsbn(isbn);
    }
    
    @GetMapping("/annoPubl")
    public int totalAnios(@RequestParam int anno){
        return libroService.totalAnnos(anno);
    }

    @GetMapping("/busqAutor")
    public List<Libro> busqAutor(@RequestParam String autor){
        return libroService.busqAutor(autor);
    }
    

    @GetMapping("/total")
    public int totalLibros(){
        return libroService.totalLibros();
    }

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }
    
    //@PostMapping
    //public Libro agregarLibro(@RequestBody Libro libro){
    //    return libroService.saveLibro(libro);
    //}

    @PostMapping 
    public String guardarArreglo(@RequestBody List<Libro> listLibro){
        return libroService.guardarArreglo(listLibro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

    @GetMapping("/antiguo")
    public Libro getlibroAntiguo(){
        return libroService.libroMasAntiguo();
    }
    
    @GetMapping("/nuevo")
    public Libro getLibroNuevo(){
        return libroService.libroNuevo();
    }

    @GetMapping("/ordenlista")
    public List<Libro> getListaOrdenada(){
        return libroService.listaOrdenada();

    }
    
    
    

    


}
    








    
    

