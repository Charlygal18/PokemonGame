package Logica;

public class CharlyAgua extends Pokemon implements IAgua {
	
	public CharlyAgua() {
		super();
	}

	public CharlyAgua(int numPokedex, String nombre, double peso, String sexo, int temporada) {
		super(numPokedex, nombre, peso, sexo, temporada);
	}

	@Override
	public void atacarHidroBomba() {
		System.out.println(nombre + " atacó con HidroBomba");
	}

	@Override
	public void atacarBurbuja() {
		System.out.println(nombre + " atacó con Burbuja");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println(nombre + " atacó con PistolaAgua");
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println(nombre + " atacó con Placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println(nombre + " atacó con Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println(nombre + " atacó con Mordisco");
	}

	protected void ataqueEspecialCharly() {
		System.out.println(nombre + " atacó con su ataque Especial");
	}
}
