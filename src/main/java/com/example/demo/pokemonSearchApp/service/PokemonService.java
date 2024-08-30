package com.example.demo.pokemonSearchApp.service;

import com.example.demo.pokemonSearchApp.dto.PokemonResponseDto;

public interface PokemonService {
    PokemonResponseDto getPokemonByName(String name);
}
