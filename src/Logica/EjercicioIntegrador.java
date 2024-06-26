package Logica;

public class EjercicioIntegrador {

	public static void main(String[] args) {
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		Pikachu pikachu = new Pikachu();
		CharlyAgua charlyAgua = new CharlyAgua(1, "CharlyAgua", 72, "M", 2);
		
		squirtle.atacarAraniazo();
		squirtle.atacarHidroBomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzaLlamas();
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		pikachu.atacarAraniazo();
		pikachu.atacarImpacTrueno();
		charlyAgua.atacarAraniazo();
		charlyAgua.atacarHidroBomba();
		charlyAgua.ataqueEspecialCharly();
	}

}
