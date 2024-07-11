package com.aula.relacionamento.services;

import com.aula.relacionamento.entities.Autor;
import com.aula.relacionamento.repository.AutorRepository;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
  @Transactional
  public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAll () {
      return autorRepository.findAll () ;
     }

    public void saveAutor (Autor autor) {
      autorRepository.save(autor);
    }
    
  }