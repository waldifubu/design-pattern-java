package observer_java_observable;

import java.util.Observable;
import java.util.Observer;

public class KonkreterBeobachter implements Observer {

	private KonkretesSubjekt konkretesSubjekt;

	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;

		// Durchführung der Registrierung beim Übergebenen Subjekt
		this.konkretesSubjekt.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		int newState = konkretesSubjekt.getState();
		System.out.println(newState);

		// ...auf neuen Status reagieren
	}

	public void changeState(Observable o, Object arg) {
		int newState = 0;
		try {
			int number = Integer.parseInt((String) arg);
			if (number > 0) {
				newState = number;
			}
		} catch (NumberFormatException e) {
			newState = konkretesSubjekt.getState();
		} catch (NullPointerException npe) {
			newState = konkretesSubjekt.getState();
		}

		this.konkretesSubjekt.setState(newState);
	}
}