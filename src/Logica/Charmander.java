package Logica;

public class Charmander extends Pokemon implements IFuego{

	public Charmander() {
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Charmander atacó con Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Charmander atacó con Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Charmander atacó con Mordisco");
		
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Charmander atacó con PunioFuego");
		
	}

	@Override
	public void atacarLanzaLlamas() {
		System.out.println("Charmander atacó con LanzaLlamas");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Charmander atacó con Ascuas");
		
	}

}
