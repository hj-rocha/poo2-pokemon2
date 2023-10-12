package aula_veiga_poo2_pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
		
		private static Pokedex pokedex;
		
		private List<PokemonEntry> pokemonEntries = new ArrayList<PokemonEntry>();
		
		private Pokedex(){
	
		}
		
		public static Pokedex getInstance(){
			if (pokedex == null)
				pokedex = new Pokedex();

			return pokedex;
		}
		
		public void registerPokemon(PokemonEntry pE) {
			pokemonEntries.add(pE);
		}
		
		public void seePokemon(PokemonEntry pE) {
			
		}
	
		public List<PokemonEntry> getEntries(){
			return pokemonEntries;
		}
}
