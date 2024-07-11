package com.aula.relacionamento.controllers;

import java.util.List;

import com.aula.relacionamento.entities.Livro;
import com.aula.relacionamento.services.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
  @RequestMapping(value = "/livros")
  public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> getAll () {
      List<Livro> lista = service.getAllLivros();
      return ResponseEntity.status(HTTPStaus.OK).body(lista);
    }

    @PostMapping
      public ResponseEntity<String> saveLivro (@RequestBody Livro livro) {
      service.saveLivro(livro);
      return ResponseEntity.status(HttpStatus.CREATED).body("Livro cadastrado")
    }
  }