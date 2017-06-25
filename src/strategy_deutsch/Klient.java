package strategy_deutsch;

public class Klient {

	public static void main(String[] args) {
		Kontext k = new Kontext();
		k.setStrategie(new KonkreteStrategieA());
		k.arbeite(); // "Weg A"
		k.setStrategie(new KonkreteStrategieB());
		k.arbeite(); // "Weg B"
	}
}
