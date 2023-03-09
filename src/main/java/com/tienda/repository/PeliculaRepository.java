package com.tienda.repository;

import com.cinelitas.entity.Pelicula;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{
    
}
