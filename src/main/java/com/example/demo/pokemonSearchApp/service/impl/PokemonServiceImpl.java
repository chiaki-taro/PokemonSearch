package com.example.demo.pokemonSearchApp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.pokemonSearchApp.dto.PokemonResponseDto;
import com.example.demo.pokemonSearchApp.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService {
    
    @Autowired
    private WebClient.Builder webClientBuilder;
    
    @Override
    public PokemonResponseDto getPokemonByName(String name) {
        return webClientBuilder.build()
                .get()
                .uri("https://pokeapi.co/api/v2/pokemon/" + name)
                .retrieve()
                .bodyToMono(PokemonResponseDto.class)
                .block();
    }
}
