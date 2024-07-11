package com.aula.relacionamento.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String titulo;

  @ManyToOne
  @JoinColumn(name = "autor_id", nullable = false)
  @JsonBackReference
  private Autor autor;
  
  public Long getId () {
    return id;
  } 

  public void setId (Long id) {
    this.id = id;
  }
  
  public String getTitulo () {
    return titulo;
    }

  public void setTitulo (String titulo) {
    this.titulo = titulo;
  }

  public Autor getAutor(Autor autor) {
    this.autor = autor;
  }
  
}
