package aula_veiga_poo2_pokemon;


public class Pokemon {
	
	private int number;
	
	private String name;
	
	private Type type1;
	
	private Type type2;
	
	private PokemonEntry pokemonEntry;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType1() {
		return type1;
	}

	public void setType1(Type type1) {
		this.type1 = type1;
	}

	public Type getType2() {
		return type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}

	public PokemonEntry getPokemonEntry() {
		return pokemonEntry;
	}

	public void setPokemonEntry(PokemonEntry pokemonEntry) {
		this.pokemonEntry = pokemonEntry;
	}
	
	

}
