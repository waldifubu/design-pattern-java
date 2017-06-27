package observer_java_observable;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();

		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt  übergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter2 = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter3 = new KonkreterBeobachter(konkretesSubjekt);

		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(3);
		
		konkreterBeobachter.changeState(konkretesSubjekt, "5");
	}
}