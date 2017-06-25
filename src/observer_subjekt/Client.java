package observer_subjekt;

public class Client {

	public static void main(String[] args) {

		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();

		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt übergeben und registriert.
		@SuppressWarnings("unused")
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter2 = new KonkreterBeobachter(konkretesSubjekt);

		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
		
		konkretesSubjekt.removeBeobachter(konkreterBeobachter2);
		konkretesSubjekt.setState(1);
	}
}