package observer_java;

import java.util.Observable;
import java.util.Observer;
 
public class KonkreterBeobachter implements Observer {
 
	private KonkretesSubjekt konkretesSubjekt;
 
	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
 
		// Durchf�hrung der Registrierung beim �bergebenen Subjekt
		this.konkretesSubjekt.addObserver(this);
	}
 
	@Override
	public void update(Observable o, Object arg) {
		int newState = konkretesSubjekt.getState();
		System.out.println(newState);
		// ...auf neuen Status reagieren
	}
}