package Logica;

public class Squirtle extends Pokemon implements IAgua{
	
	public Squirtle() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Squirtle atacó con Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Squirtle atacó con Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Squirtle atacó con Mordisco");
		
	}

	@Override
	public void atacarHidroBomba() {
		System.out.println("Squirtle atacó con HidroBomba");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Squirtle atacó con Burbuja");
		
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Squirtle atacó con PistolaAgua");
		
	}

}
