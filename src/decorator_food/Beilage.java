package decorator_food;

public abstract class Beilage implements Gericht {

	protected Gericht gericht;

	public Beilage(Gericht gericht) {
		this.gericht = gericht;
	}
}
