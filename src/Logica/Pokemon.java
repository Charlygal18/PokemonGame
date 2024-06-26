package Logica;

public abstract class Pokemon {
	//Características de los Pokemones
	protected int numPokedex;
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected int temporada;
	
	//Ataques de los Pokemones
	protected abstract void atacarPlacaje();
	
	protected abstract void atacarAraniazo();
	
	protected abstract void atacarMordisco();
	
	public Pokemon() {
	}

	public Pokemon(int numPokedex, String nombre, double peso, String sexo, int temporada) {
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.peso = peso;
		this.sexo = sexo;
		this.temporada = temporada;
	}
	
}
