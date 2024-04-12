package com.ohgiraffers.section02.annotation.subsection03.collection;


import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 전체를 주입 받아서 나오게
@Service("pokemonServiceCollection")
public class PokemonService {

    // 포켓몬(리스트만들어서)
    private List<Pokemon> pokemonList;

    // 가지고 오고
    @Autowired
    public PokemonService(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    // 포켓몬 어택도 가지고옴
    public void pokemonAttack() {
        for (Pokemon pokemon : pokemonList) {
            pokemon.attack();
        }
    }
}
