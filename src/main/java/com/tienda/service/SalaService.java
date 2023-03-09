package com.tienda.service;

import com.cinelitas.entity.Sala;
import com.tienda.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {
    
    @Autowired
    private SalaRepository salaRepository;
    
    public List<Sala> listSala() {
        return (List<Sala>) salaRepository.findAll();
    } 
}
