package aula_veiga_poo2_pokemon;

public class PokemonEntry {

	private String category;
	
	private double weight;
	
	private double height;
	
	private String description;
	
	private boolean captured;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCaptured() {
		return captured;
	}

	public void setCaptured(boolean captured) {
		this.captured = captured;
	}
	
	
}
