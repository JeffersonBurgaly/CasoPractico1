package com.tienda.service;

import com.cinelitas.entity.Pelicula;
import java.util.List;


public interface IPeliculaService {
    
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaByID(long id);
    public void savePelicula(Pelicula pelicula);
    public void delete(long id);
}
