package Logica;

public class Pikachu extends Pokemon implements IElectrico{

	public Pikachu() {
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("Pikachu atacó con Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Pikachu atacó con Araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Pikachu atacó con Mordisco");
		
	}

	@Override
	public void atacarImpacTrueno() {
		System.out.println("Pikachu atacó con ImpacTrueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Pikachu atacó con PunioTrueno");
		
	}
	

}
