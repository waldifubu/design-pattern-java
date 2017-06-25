package observer_subjekt;

public class KonkreterBeobachter implements Beobachter {

	private KonkretesSubjekt konkretesSubjekt;

	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;

		// Durchf�hrung der Registrierung beim �bergebenen Subjekt
		this.konkretesSubjekt.addBeobachter(this);
	}

	@Override
	public void update() {
		int newState = konkretesSubjekt.getState();
		System.out.println(newState);
		// ...auf neuen Status reagieren
	}
}