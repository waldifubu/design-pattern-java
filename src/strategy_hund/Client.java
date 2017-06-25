package strategy_hund;

public class Client {

	public static void main(String[] args) {
		Husky husky = new Husky();
		husky.bellen(); // ganz leises bellen...
		husky.laufen(); // Schnelles laufen
		husky.setLaufVerhalten(new Humpeln());
		husky.laufen(); // Humpeln
		// ...
	}

}
