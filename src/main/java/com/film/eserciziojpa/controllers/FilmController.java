package com.film.eserciziojpa.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.film.eserciziojpa.data.FilmRepository;
import com.film.eserciziojpa.models.Film;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/Film")

public class FilmController {


    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository){
        this.filmRepository=filmRepository;
    }
    
    @PostMapping
    public String filmForm(Model model, @ModelAttribute Film film){
        Film save=this.filmRepository.save(film);
        model.addAttribute("aggiunto", save);
        return "aggiunto";

    }
    @GetMapping("/stampa")
    public String stampaLista(Model model){
        model.addAttribute("lista", this.filmRepository.findAll());
        return "lista";
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("Film", new Film());
        return "Film";
    }
    @GetMapping(path="/info/{Id}")
    public String filmInfo(Model model, @PathVariable Long Id){
        Film film=filmRepository.getReferenceById(Id);
        model.addAttribute("Film", film);
        return "dettagliFilm";
        
    }
    @PostMapping("/update")
    public String filmUpdate(Model model,@ModelAttribute Film film){
        Film save=filmRepository.save(film);
        model.addAttribute("aggiunto", save);
        return "aggiunto";
    }
    

    
    
    
    
    
}
