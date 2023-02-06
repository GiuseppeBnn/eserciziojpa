package com.film.eserciziojpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String Genere;
    private int Anno;
    

    public Film(){}

    public Film(String nome, String gen){
        this.Genere=gen;
        this.name=nome;
    }
    public void setName(String nome){
        this.name=nome;
    }
    public String getName(){
        return this.name;
    }
    public void setGenere(String gen){
        this.Genere=gen;
    }
    public String getGenere(){
        return this.Genere;
    }
    public void setId(Long i){
        this.Id=i;
    }
    public Long getId(){
        return this.Id;
    }
    public void setAnno(int a){
        this.Anno=a;
    }
    public int getAnno(){
        return this.Anno;
    }
}
