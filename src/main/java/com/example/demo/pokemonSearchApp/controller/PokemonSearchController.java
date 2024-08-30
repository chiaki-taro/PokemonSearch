package com.example.demo.pokemonSearchApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pokemonSearchApp.dto.PokemonResponseDto;
import com.example.demo.pokemonSearchApp.exception.PokemonNotFoundException;
import com.example.demo.pokemonSearchApp.service.PokemonService;

@Controller
public class PokemonSearchController {
    
    @Autowired
    private PokemonService pokemonService;
    
    //Topにアクセスした際、検索ページに遷移する
    @GetMapping("/")
    public String showSearchPage() {
        return "pokemonSearch"; 
    }
    
    @GetMapping("/search")
    public String searchPokemon(@RequestParam("pokemonName") String pokemonName, Model model) {
        if (pokemonName == null || pokemonName.trim().isEmpty()) {
            model.addAttribute("notFound", true);
            return "pokemonSearch";
        }
        
        try {
            PokemonResponseDto pokemon = pokemonService.getPokemonByName(pokemonName);
            model.addAttribute("pokemon", pokemon);
        } catch (PokemonNotFoundException e) {
            model.addAttribute("notFound", true);
        }
        return "pokemonSearch";
    }

}
