package aula_veiga_poo2_pokemon;

import java.util.Random;

public class PokemonEncounter {
	
	private Pokemon pokemon;
	
	public void tryCapture(Pokemon p) {

		Pokedex pokedex = Pokedex.getInstance();
			
		////Sorteia a possibilidade de 25% do Pokeomn ser capturado
		Random random = new Random();
		int captura = random.nextInt(3); //(0-3)
		
		//Se for capturado.
		if(captura == 1) {
		
			//Registra o caboclo na cadeia
			pokedex.registerPokemon(p.getPokemonEntry());
			
			//Inclui o sujeito na equipe.
			Party party = Party.getInstance();
			if ( party.getPokemonList().size() <= 5 ) {
				party.insert(p);
			} else {
				//Caso a equipe esteja cheia, dispensa o primeiro e insere o novato.
				party.remove();
				//Insere o pokemon na lista pokemon.
				party.insert(p);				
			}
		}
	}
	
	public void runAway() {
		
	}

}
