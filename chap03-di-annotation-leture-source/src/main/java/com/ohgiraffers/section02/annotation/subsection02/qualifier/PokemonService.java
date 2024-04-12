package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* @Qualifier 어노테이션은 여러 개의 빈 객체중에서 특정 빈 객체를 이름으로 지정하는 어노테이션이다./
        @Primary 어노테이션과 @퀄리파이어 어노테이션이 함께 쓰였을 때 @퀄리 가 우선이다. */

    /* 1. 필드 주입 방식 */
//    @Autowired
//    @Qualifier("squirtle")
    private Pokemon pokemon;

    /* 생성자 주입 방식 */
    @Autowired
    public PokemonService(@Qualifier("charmander")Pokemon pokemon) {

        this.pokemon = pokemon;
    }

    public void PokemonAttack() {
        pokemon.attack();
    }

}
