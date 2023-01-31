package com.film.eserciziojpa.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.film.eserciziojpa.models.Film;

public interface FilmRepository extends JpaRepository<Film,Long>{
    List<Film> findByName(String name);
    
}
