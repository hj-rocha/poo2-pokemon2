package aula_veiga_poo2_pokemon;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar a nova linha pendente

            switch (escolha) {
                case 1:
                   	encontrarPokemon();
                    break;
                case 2:
                	visualizarEquipe();
                    break;
                case 3:
                	visualizarPokedex();
                	break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1: Encontrar Pokemon Selvagem");
        System.out.println("2: Visualizar Equipe");
        System.out.println("3: Visualizar Pokedex1");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }

	public static void encontrarPokemon() {
		Pokedex pokedex = Pokedex.getInstance();

		// Cadastra um Pokemon
		Pokemon p = new Pokemon();
		// Seta um código no Pokemon
		p.setNumber(pokedex.getEntries().size() + 1);
		p.setName("Joao");

		// Cadastra todos os dados do bichinho.
		PokemonEntry pE = new PokemonEntry();
		pE.setCategory("Fogo");
		pE.setWeight(505);
		pE.setHeight(5);
		pE.setDescription("Pokemon bonitinho.");

		p.setPokemonEntry(pE);
		PokemonEncounter pEnc = new PokemonEncounter();
		pEnc.tryCapture(p);
	}
	
	public static void visualizarEquipe() {
		
		Party party =  Party.getInstance();
		List<Pokemon> pokemon = party.getPokemonList();
		
		for (Pokemon pokemon2 : pokemon) {
			System.out.println(pokemon2.getName());
		}
	}
	
	public static void visualizarPokedex() {
		Pokedex pokedex = Pokedex.getInstance();
		List<PokemonEntry> pE = pokedex.getEntries();
		for (PokemonEntry pokemonEntry : pE) {
			System.out.println(pokemonEntry.getDescription());
		}
		
	}

}
