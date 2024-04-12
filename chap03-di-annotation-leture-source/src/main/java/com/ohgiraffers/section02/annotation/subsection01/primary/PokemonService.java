package com.ohgiraffers.section02.annotation.subsection01.primary;


import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PokemonService {

    private Pokemon pokemon;

    // 생성자로 초기화
    // 생성자 주입 해줌 Pokemon 빈을 찾아서 가지고옴
    @Autowired
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
