package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

	public Bulbasaur() {
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Bulbasaur atacó con Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Bulbasaur atacó con Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Bulbasaur atacó con Mordisco");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Bulbasaur atacó con Drenaje");
		
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Bulbasaur atacó con Paralizar");
		
	}

}
