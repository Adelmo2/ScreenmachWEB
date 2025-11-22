package br.com.alura.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieControler {

    @GetMapping("/series")
    public String obterSeries() {
        return "Aqui vão ser listadas a séries";
    }

}
