package observer_listener;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();

		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt übergeben und registriert.		
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter2 = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter3 = new KonkreterBeobachter(konkretesSubjekt);
		KonkreterBeobachter konkreterBeobachter4 = new KonkreterBeobachter(konkretesSubjekt);
		
		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
		
		konkretesSubjekt.removeBeobachter(konkreterBeobachter2);
		konkretesSubjekt.removeBeobachter(konkreterBeobachter4);			
		konkretesSubjekt.setState(2);
		
		konkreterBeobachter.update();
		//konkreterBeobachter.update();
	}
}