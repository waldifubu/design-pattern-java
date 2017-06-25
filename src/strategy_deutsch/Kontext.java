package strategy_deutsch;

public class Kontext {
	private Strategie strategie = null;

	public void setStrategie(final Strategie STRATEGIE) {
		strategie = STRATEGIE;
	}

	public void arbeite() {
		if (strategie != null)
			strategie.algorithmus();
	}
}
