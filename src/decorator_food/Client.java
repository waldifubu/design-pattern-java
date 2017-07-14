package decorator_food;

public class Client {

	public static void main(String[] args) {
		Gericht gericht = new Salat(new Nudeln(new Garnelen()));
		gericht.druckeBeschreibung();
		// Hüftsteak, Nudeln, Salat
		System.out.println(" für " + gericht.getPreis() + " Euro");
		// für 19.75 Euro

		gericht = new Pommes(new Salat(new Tofu()));
		gericht.druckeBeschreibung();
		// Hüftsteak, Nudeln, Salat, Suppe
		System.out.println(" für " + gericht.getPreis() + " Euro");
		// für 21.25 Euro
	}
}
