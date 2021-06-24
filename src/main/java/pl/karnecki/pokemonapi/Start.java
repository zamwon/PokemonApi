package pl.karnecki.pokemonapi;

import org.springframework.stereotype.Component;
import pl.karnecki.pokemonapi.dal.PokemonDao;


@Component
public class Start {

    PokemonDao pokemonDao;

    public Start(PokemonDao pokemonDao) {
        this.pokemonDao = pokemonDao;
    }
}
