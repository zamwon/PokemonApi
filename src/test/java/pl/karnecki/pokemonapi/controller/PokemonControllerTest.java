package pl.karnecki.pokemonapi.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import pl.karnecki.pokemonapi.dal.PokemonDaoImpl;
import pl.karnecki.pokemonapi.model.Pokemon;
import pl.karnecki.pokemonapi.service.PokemonService;
import pl.karnecki.pokemonapi.service.PokemonServiceImpl;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
class PokemonControllerTest {


    @Mock
    private PokemonDaoImpl pokemonDao = mock(PokemonDaoImpl.class);

    @InjectMocks
    private PokemonService pokemonService = new PokemonServiceImpl(pokemonDao);

    @BeforeEach
    public void setUpDao() {
        pokemonDao.savePokemon(1L, "Pikachu", "Electric");
        pokemonDao.savePokemon(2L, "Raichu", "Electric");
        List<Pokemon> pokemons = pokemonDao.findAll();
        doReturn(pokemons).when(pokemonDao).findByName("Pikachu");
    }

    @Test
    @DisplayName("Should Return Selected Name")
    public void shouldReturnSelectedName() {

        //when
        List<Pokemon> actual = pokemonDao.findByName("Pikachu");

        //then
        Assertions.assertEquals("Pikachu", actual.get(0).getName());
        Assertions.assertEquals(1L, actual.get(0).getPokemonId());
    }
    @Test
    @DisplayName("Should No Return Any Name")
    public void shouldNoReturnAnyName() {

        //when
        List<Pokemon> actual = pokemonService.getPokemonsByName("Blazej");

        //then
        assertTrue(actual.isEmpty());
    }
}
