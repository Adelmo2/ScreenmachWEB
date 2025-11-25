package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.repository.SerieRepository;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {
    @Autowired
    private SerieRepository repositorio;

    @GetMapping("/series")
    //public String obterSeries() {
    public List<Serie> obterSeries() {
        return repositorio.findAll();
        //return "Aqui vão ser listadas a séries";
        //return repositorio.findTop5ByOrderByAvaliacaoDesc();
    }
}
