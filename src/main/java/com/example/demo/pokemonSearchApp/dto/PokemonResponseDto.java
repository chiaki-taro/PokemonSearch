package com.example.demo.pokemonSearchApp.dto;

import java.util.List;

public class PokemonResponseDto {

    private String name;                // ポケモンの名前
    private int height;                 // ポケモンの高さ
    private int weight;                 // ポケモンの重さ
    private List<String> abilities;     // ポケモンの能力リスト
    private List<String> types;         // ポケモンのタイプのリスト
    private List<String> moves;         // ポケモンが覚えられる技のリスト

    // コンストラクタ
    public PokemonResponseDto(String name, int height, int weight, List<String> abilities, List<String> types, List<String> moves) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.types = types;
        this.moves = moves;
    }

    // ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getMoves() {
        return moves;
    }

    public void setMoves(List<String> moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "PokemonResponseDto{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", abilities=" + abilities +
                ", types=" + types +
                ", moves=" + moves +
                '}';
    }
}