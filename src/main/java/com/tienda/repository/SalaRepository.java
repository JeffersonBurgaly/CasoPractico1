package com.tienda.repository;

import com.cinelitas.entity.Sala;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long>{
    
}
