package aula_veiga_poo2_pokemon;

import java.util.ArrayList;
import java.util.List;

public class Party {
	
	private static Party party;
	
	private List<Pokemon> pokemon = new ArrayList<Pokemon>();
	
	private Party(){

	}
	
	public static Party getInstance(){
		if (party == null)
			party = new Party();

		return party;
	}
	
	public List<Pokemon> getPokemonList(){
		return pokemon;
	}
	
	public void remove() {
		pokemon.remove(0);
	}
	
	public void insert(Pokemon p) {
		pokemon.add(p);
	}

}
