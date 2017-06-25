package observer_java;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();

		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt �bergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter2 = new KonkreterBeobachter(konkretesSubjekt);

		// Zustands�nderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
	}
}