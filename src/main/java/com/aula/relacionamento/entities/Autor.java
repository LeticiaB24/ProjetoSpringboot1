package com.aula.relacionamento.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.mapping.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
  public class Autor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;

    @JsonManagedReference
    @OneToMany(mappedBy = "autor")
    private Set<Livro> livros;

    public Long getId () {
     return id;
    }   
    public void setId (Long id) {
     this.id = id;
    }
    public String getNome () {
      return nome;
    }

    public void setNome (String nome) {
      this.nome = nome;
    }

    public Set<Livro> getLivros () {
      return livros;
    }

    public void setLivros (Set<Livro> livros) {
      this.livros = livros;
    }
    
    
  }