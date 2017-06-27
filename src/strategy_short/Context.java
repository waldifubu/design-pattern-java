package strategy_short;

public class Context {

	// Instanzvariable für die Strategy (Komposition)
	// vom Typ des Interfaces -> Implementierungunabhängigkeit
	// Defaultverhalten: ConcreteStrategyA
	private Strategy strategy; // = new ConcreteStrategyA();

	public void execute() {
		// delegiert Verhalten an Strategy-Objekt
		try {
			strategy.executeAlgorithm();
		} catch (NullPointerException npe) {
			System.out.println("No strategy defined");
		}
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}
}